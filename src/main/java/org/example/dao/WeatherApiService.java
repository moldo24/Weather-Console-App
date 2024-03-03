package org.example.dao;

import org.example.model.WeatherModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
public interface WeatherApiService {
    @GET("data/2.5/weather")
    Call<WeatherModel> requestWeatherByCity(
            @Query("q") String cityName,
            @Query("units") String units,
            @Query("appid") String apiKey
    );
}
