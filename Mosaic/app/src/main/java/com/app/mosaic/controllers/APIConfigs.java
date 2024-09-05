package com.app.mosaic.controllers;

public class APIConfigs {
    private static final String API_URL = "https://staging-mosaic-103-api-ds-ab946f1a053c.herokuapp.com";
    
    public static String getChatEndpoint() {
        return API_URL + "/chat";
    }
}
