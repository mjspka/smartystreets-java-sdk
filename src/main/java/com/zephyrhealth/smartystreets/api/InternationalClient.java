/**
 *
 */
package com.zephyrhealth.smartystreets.api;

import java.io.IOException;

import com.smartystreets.api.Request;
import com.smartystreets.api.Response;
import com.smartystreets.api.Sender;
import com.smartystreets.api.Serializer;
import com.smartystreets.api.exceptions.SmartyException;
import com.zephyrhealth.smartystreets.InternationalLookup;

/**
 * @author pmalla
 *
 */
public class InternationalClient {

	private final String urlPrefix;
	private final Sender sender;
	private final Serializer serializer;

	public InternationalClient(String urlPrefix, Sender sender, Serializer serializer) {
		this.urlPrefix = urlPrefix;
		this.sender = sender;
		this.serializer = serializer;
	}

	public void send(InternationalLookup lookup) throws SmartyException, IOException {
		InternationalBatch batch = new InternationalBatch();
		batch.add(lookup);
		this.send(batch);
	}

	public void send(InternationalBatch batch) throws SmartyException, IOException {
		Request request = new Request(this.urlPrefix);

		if (batch.size() == 0)
			return;

		this.putHeaders(batch, request);

		if (batch.size() == 1)
			this.populateQueryString(batch.get(0), request);
		else
			request.setPayload(this.serializer.serialize(batch.getAllLookups()));

		Response response = this.sender.send(request);

		InternationalCandidate[] candidates = this.serializer.deserialize(response.getPayload(), InternationalCandidate[].class);
		if (candidates == null)
			candidates = new InternationalCandidate[0];
		this.assignCandidatesToLookups(batch, candidates);
	}

	private void putHeaders(InternationalBatch batch, Request request) {
		request.putHeader("Host", "api.smartystreets.com");

		if (batch.getIncludeInvalid())
			request.putHeader("X-Include-Invalid", "true");
		else if (batch.getStandardizeOnly())
			request.putHeader("X-Standardize-Only", "true");
	}

	private void populateQueryString(InternationalLookup address, Request request) {
		request.putParameter("country", address.getCountry());
		request.putParameter("geocode", address.getGeocode());
		request.putParameter("language", address.getLanguage());
		request.putParameter("freeform", address.getFreeform());
		request.putParameter("address1", address.getAddress1());
		request.putParameter("address2", address.getAddress2());
		request.putParameter("address3", address.getAddress3());
		request.putParameter("address4", address.getAddress4());
		request.putParameter("organization", address.getOrganization());
		request.putParameter("locality", address.getLocality());
		request.putParameter("administrative_area", address.getAdministrativeArea());
		request.putParameter("postal_codemaps api", address.getPostalCode());

	}

	private void assignCandidatesToLookups(InternationalBatch batch, InternationalCandidate[] candidates) {
		for (int i = 0; i < batch.size(); i++) {
			for (InternationalCandidate candidate : candidates) {
				if (candidate.getInputIndex() == i) {
					batch.get(i).addToResult(candidate);
				}
			}
		}
	}

}
