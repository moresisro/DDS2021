package dds_qmp.model.atuendo;

import dds_qmp.model.prenda.Prenda;
import services.AccuWeatherService;
import services.Clima;

import java.util.List;

public class AtuendoManager {
  private AccuWeatherService weatherService;
  private List<Prenda> ropaDisponible;
  private Clima clima;

  public AtuendoManager(List<Prenda> ropaDisponible) {
    this.weatherService = new AccuWeatherService();
    this.ropaDisponible = ropaDisponible;
  }

  public void obtenerClimaDeHoy() {
    //TODO: Cachear en clima
    // weatherService.getWeather("Buenos Aires");
  }

  public List<Prenda> filtrarRopaQueCoincideConClima() {
    //return this.ropaDisponible.stream().filter(ropa -> ropa.esAptaParaClima());
  }

}
