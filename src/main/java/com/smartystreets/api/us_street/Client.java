package com.smartystreets.api.us_street;

import com.smartystreets.api.Request;
import com.smartystreets.api.Response;
import com.smartystreets.api.Sender;
import com.smartystreets.api.Serializer;
import com.smartystreets.api.exceptions.SmartyException;

import java.io.IOException;

public class Client {
    private final String urlPrefix;
    private final Sender sender;
    private final Serializer serializer;

    public Client(String urlPrefix, Sender sender, Serializer serializer) {
        this.urlPrefix = urlPrefix;
        this.sender = sender;
        this.serializer = serializer;
    }

    public void send(Lookup lookup) throws SmartyException, IOException {
        Batch batch = new Batch();
        batch.add(lookup);
        this.send(batch);
    }

    public void send(Batch batch) throws SmartyException, IOException {
        Request request = new Request(this.urlPrefix);

        if (batch.size() == 0)
            return;

        this.putHeaders(batch, request);

        if (batch.size() == 1)
            this.populateQueryString(batch.get(0), request);
        else
            request.setPayload(this.serializer.serialize(batch.getAllLookups()));

        Response response = this.sender.send(request);

        Candidate[] candidates = this.serializer.deserialize(response.getPayload(), Candidate[].class);
        if (candidates == null)
            candidates = new Candidate[0];
        this.assignCandidatesToLookups(batch, candidates);
    }

    private void putHeaders(Batch batch, Request request) {
        if (batch.getIncludeInvalid())
            request.putHeader("X-Include-Invalid", "true");
        else if (batch.getStandardizeOnly())
            request.putHeader("X-Standardize-Only", "true");
    }

     private void populateQueryString(Lookup address, Request request) {
        request.putParameter("street", address.getStreet());
        request.putParameter("street2", address.getStreet2());
        request.putParameter("secondary", address.getSecondary());
        request.putParameter("city", address.getCity());
        request.putParameter("state", address.getState());
        request.putParameter("zipcode", address.getZipCode());
        request.putParameter("lastline", address.getLastline());
        request.putParameter("addressee", address.getAddressee());
        request.putParameter("urbanization", address.getUrbanization());

        if (address.getMaxCandidates() != 1)
            request.putParameter("candidates", Integer.toString(address.getMaxCandidates()));
    }

    private void assignCandidatesToLookups(Batch batch, Candidate[] candidates) {
        for (Candidate candidate : candidates)
            batch.get(candidate.getInputIndex()).addToResult(candidate);
    }
}
