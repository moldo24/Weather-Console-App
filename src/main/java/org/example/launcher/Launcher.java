package org.example.launcher;

import org.example.service.HttpUtils;
import org.example.service.JsonUtils;

import java.io.IOException;
import java.util.Scanner;
//51e34a80d8d4ea71639e07b36cff7c78 - remove this before posting
public class Launcher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = 1;
        System.out.println("(type 'exit' to quit)");

        // Ask user for API key
        System.out.print("Please enter your API key: ");
        String API_KEY = scanner.nextLine();

        boolean exit = false;
        while (!exit) {
            System.out.print(x + ". Name of the city ?\n");
            String city = scanner.nextLine();

            if (city.equalsIgnoreCase("exit")) {
                exit = true;
                continue; // Skip to the next iteration of the loop
            }

            System.out.print(x + ". Initials of the Country?\n");
            String countryInitials = scanner.nextLine();

            String location = city + ", " + countryInitials.toUpperCase();
            //Make the url request
            String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + location + "&appid=" + API_KEY + "&units=metric";
            try {
                //Send HTTP GET request
                StringBuilder response = HttpUtils.sendHttpGetRequest(urlString);
                //print weather data
                JsonUtils.printWeatherData(response);

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            x++; // Loop Numbering
        }
        scanner.close(); // Close scanner when done
    }
}
