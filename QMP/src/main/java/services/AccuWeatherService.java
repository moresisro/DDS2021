package services;

import java.time.LocalDate;

public class AccuWeatherService implements  WeatherService {
  private AccuWeatherAPI api;

  public AccuWeatherService() {
    this.api = new AccuWeatherAPI();
  }

  @Override
  public int getWeather(String ciudad) {
    //TODO: return this.api.getWeather(ciudad).get(0).get("PrecipitationProbability");
    return 0;
  }

}
