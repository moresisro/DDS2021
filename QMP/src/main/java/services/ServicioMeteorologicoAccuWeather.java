package services;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServicioMeteorologicoAccuWeather implements  WeatherService {
  private AccuWeatherAPI api;
  private Duration periodoDeValidez;
  private Clima ultimaRespuesta;
  private String direccion;
  private LocalDateTime proximaExpiracion;

  public ServicioMeteorologicoAccuWeather(AccuWeatherAPI api, Duration validoHasta, String direccion) {
    this.api = api;
    this.periodoDeValidez = validoHasta;
    //this.ultimaRespuesta = new Clima("", 0, "", false);
    this.direccion = direccion;
  }

  @Override
  public Clima obtenerCondicionesClimaticas(String direccion) {
    if (!this.ultimaRespuesta.esDeDireccion(direccion) || this.expiro() || this.ultimaRespuesta == null) {
      this.ultimaRespuesta = consultarApi();
      this.proximaExpiracion = LocalDateTime.now().plus(this.periodoDeValidez);
    }
    return this.ultimaRespuesta;
  }

  @Override
  public Clima consultarApi() {
    //... Mapear la respuesta de la api en Clima
    List<Map<String, Object>> condicionesClimaticas = this.api.getWeather(this.direccion);
    return condicionesClimaticas.get(0).get("Value");
  }

  public boolean expiro() {
    return proximaExpiracion.isAfter(LocalDateTime.now());
  }

}
