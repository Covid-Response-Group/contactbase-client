package org.covid19.contactbase.client;

import org.covid19.contactbase.client.invoker.ApiClient;
import org.covid19.contactbase.client.model.Contact;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContactControllerApi
 */
public class ContactControllerApiTest {

    private ContactControllerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ContactControllerApi.class);
    }

    /**
     * list
     *
     * 
     */
    @Test
    public void listUsingGETTest() {
        String dateStamp = null;
        String geohash = null;
        // List<Contact> response = api.listUsingGET(dateStamp, geohash);

        // TODO: test validations
    }
    /**
     * store
     *
     * 
     */
    @Test
    public void storeUsingPOSTTest() {
        List<Contact> contacts = null;
        // api.storeUsingPOST(contacts);

        // TODO: test validations
    }
}
