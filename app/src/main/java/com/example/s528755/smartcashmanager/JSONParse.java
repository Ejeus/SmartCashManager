package com.example.s528755.smartcashmanager;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONParse {
    public String parse(JSONObject json) {
        String b="parse";
        try {
            b=json.getString("Value");
        } catch (JSONException e) {
            b=e.getMessage();
        }
        return b;
    }
}
