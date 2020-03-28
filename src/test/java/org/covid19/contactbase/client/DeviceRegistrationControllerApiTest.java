package org.covid19.contactbase.client;

import org.covid19.contactbase.client.invoker.ApiClient;
import org.covid19.contactbase.client.model.Device;
import org.covid19.contactbase.client.model.TokenResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DeviceRegistrationControllerApi
 */
public class DeviceRegistrationControllerApiTest {

    private DeviceRegistrationControllerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DeviceRegistrationControllerApi.class);
    }

    /**
     * register
     *
     * 
     */
    @Test
    public void registerUsingPOSTTest() {
        Device device = null;
        // TokenResponse response = api.registerUsingPOST(device);

        // TODO: test validations
    }
}
