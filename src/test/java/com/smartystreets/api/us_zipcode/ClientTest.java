package com.smartystreets.api.us_zipcode;

import com.smartystreets.api.Response;
import com.smartystreets.api.mocks.FakeDeserializer;
import com.smartystreets.api.mocks.FakeSerializer;
import com.smartystreets.api.mocks.MockSender;
import com.smartystreets.api.mocks.RequestCapturingSender;
import org.junit.Test;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.*;

public class ClientTest {
    //region [ Single Lookup ]

    @Test
    public void testSendingSingleZipOnlyLookup() throws Exception {
        RequestCapturingSender sender = new RequestCapturingSender();
        FakeSerializer serializer = new FakeSerializer(null);
        Client client = new Client("http://localhost/", sender, serializer);

        client.send(new Lookup("1"));

        assertEquals("http://localhost/?zipcode=1", sender.getRequest().getUrl());
    }

    @Test
    public void testSendingSingleFullyPopulatedLookup() throws Exception {
        RequestCapturingSender sender = new RequestCapturingSender();
        FakeSerializer serializer = new FakeSerializer(null);
        Client client = new Client("http://localhost/", sender, serializer);
        Lookup lookup = new Lookup();
        lookup.setCity("1");
        lookup.setState("2");
        lookup.setZipCode("3");

        client.send(lookup);

        assertEquals("http://localhost/?city=1&state=2&zipcode=3", sender.getRequest().getUrl());
    }

    //endregion

    //region [ Batch Lookup ]

    @Test
    public void testEmptyBatchNotSent() throws Exception {
        RequestCapturingSender sender = new RequestCapturingSender();
        Client client = new Client("/", sender, null);

        client.send(new Batch());

        assertNull(sender.getRequest());
    }

    @Test
    public void testSuccessfullySendsBatchOfLookups() throws Exception {
        byte[] expectedPayload = "Hello, World!".getBytes();
        RequestCapturingSender sender = new RequestCapturingSender();
        FakeSerializer serializer = new FakeSerializer(expectedPayload);
        Client client = new Client("http://localhost/", sender, serializer);
        Batch batch = new Batch();
        batch.add(new Lookup());
        batch.add(new Lookup());

        client.send(batch);

        assertArrayEquals(expectedPayload, sender.getRequest().getPayload());
    }

    //endregion

    //region [ Response Handling ]

    @Test
    public void testDeserializeCalledWithResponseBody() throws Exception {
        Response response = new Response(0, "Hello, World!".getBytes());
        MockSender sender = new MockSender(response);
        FakeDeserializer deserializer = new FakeDeserializer(null);
        Client client = new Client("/", sender, deserializer);

        client.send(new Lookup());

        assertEquals(response.getPayload(), deserializer.getPayload());
    }

    @Test
    public void testCandidatesCorrectlyAssignedToCorrespondingLookup() throws Exception {
        Result[] expectedCandidates = new Result[2];
        expectedCandidates[0] = new Result();
        expectedCandidates[1] = new Result();
        Batch batch = new Batch();
        batch.add(new Lookup());
        batch.add(new Lookup());

        MockSender sender = new MockSender(new Response(0, "[]".getBytes()));
        FakeDeserializer deserializer = new FakeDeserializer(expectedCandidates);
        Client client = new Client("/", sender, deserializer);

        client.send(batch);

        assertEquals(expectedCandidates[0], batch.get(0).getResult());
        assertEquals(expectedCandidates[1], batch.get(1).getResult());
    }

    //endregion

}