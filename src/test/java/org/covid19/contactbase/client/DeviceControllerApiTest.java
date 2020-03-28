package org.covid19.contactbase.client;

import org.covid19.contactbase.client.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DeviceControllerApi
 */
public class DeviceControllerApiTest {

    private DeviceControllerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DeviceControllerApi.class);
    }

    /**
     * isInfected
     *
     * 
     */
    @Test
    public void isInfectedUsingGETTest() {
        // Boolean response = api.isInfectedUsingGET();

        // TODO: test validations
    }
    /**
     * markInfected
     *
     * 
     */
    @Test
    public void markInfectedUsingPOSTTest() {
        // api.markInfectedUsingPOST();

        // TODO: test validations
    }
    /**
     * unMarkInfected
     *
     * 
     */
    @Test
    public void unMarkInfectedUsingDELETETest() {
        // api.unMarkInfectedUsingDELETE();

        // TODO: test validations
    }
}
