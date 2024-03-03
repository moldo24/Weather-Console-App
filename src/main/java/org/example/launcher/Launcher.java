package org.example.launcher;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.service.HttpUtils;
import org.example.service.JsonUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
        String API_KEY = "51e34a80d8d4ea71639e07b36cff7c78";
        Scanner scanner = new Scanner(System.in);

        System.out.print("What city are you from?\n");
        String city = scanner.nextLine();

        System.out.print("What are the initials of your Country?\n");
        String countryInitials = scanner.nextLine();

        String location = city + ", " + countryInitials.toUpperCase();
        String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + location + "&appid=" + API_KEY + "&units=metric";
        try {
            StringBuilder response = HttpUtils.sendHttpGetRequest(urlString);
            JsonUtils.printWeatherData(response);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
