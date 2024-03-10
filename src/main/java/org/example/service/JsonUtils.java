// JsonUtils.java
package org.example.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public class JsonUtils {
    //prints the hashmap
    public static void printWeatherData(StringBuilder result) {
        Map<String, Object> respMap = jsonToMap(result.toString());
        Map<String, Object> mainMap = jsonToMap(respMap.get("main").toString());
        Map<String, Object> windMap = jsonToMap(respMap.get("wind").toString());

        System.out.println("Current Temperature: " + mainMap.get("temp"));
        System.out.println("Current Humidity: " + mainMap.get("humidity"));
        System.out.println("Wind Speeds: " + windMap.get("speed"));
        System.out.println("Wind Angle: " + windMap.get("deg"));
    }
    //method that uses Google's gson library to parse the json String
    public static Map<String, Object> jsonToMap(String json) {
        return new Gson().fromJson(json, new TypeToken<HashMap<String, Object>>() {}.getType());
    }
}
