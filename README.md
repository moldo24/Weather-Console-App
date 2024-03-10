# Simple City Weather Console App

This project is a simple client application that retrieves weather 
data from the OpenWeatherMap API based on user input.
This project in only a basic structure that may be used for more complex weather apps.
## Technologies used

- Allows users to input a city name and country initials to fetch current weather data.
- Supports multiple requests in a loop until the user decides to exit.
- Utilizes Retrofit library for making HTTP requests to the OpenWeatherMap API.
- Parses JSON responses using Gson library to extract weather information.
- 
## Usage

1. Run the `Launcher.java` file.
2. Follow the prompts to enter the city name and country initials.
3. Weather data for the specified location will be displayed.
4. Repeat steps 2-3 to fetch weather data for additional locations.
5. Type 'exit' when you're finished to terminate the program.

## Dependencies

- Retrofit: https://github.com/square/retrofit
- Gson: https://github.com/google/gson