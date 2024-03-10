package org.example.dao;

import org.example.model.WeatherModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
// This class is an interface for the HTTP GET requests and Query general form
public interface WeatherApiService {
    //GET request for retrieving weather data by city
    @GET("data/2.5/weather")
    Call<WeatherModel> requestWeatherByCity(  // Request call using the WeatherModel provided by http://openweathermap.com
           //Query parameters for the GET Request,open for modification
            @Query("q") String cityName,
            @Query("units") String units,
            @Query("appid") String apiKey
    );
}
