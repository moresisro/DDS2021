package dds_qmp.model.atuendo;

import dds_qmp.model.guardarropas.Guardarropas;
import dds_qmp.model.prenda.Prenda;
import services.ServicioMeteorologicoAccuWeather;
import services.Clima;

import java.util.List;

public class AtuendoManager {
  private ServicioMeteorologicoAccuWeather servicioMeteorologico;
  private Guardarropas guardarropas;
  private Clima clima;

  public AtuendoManager(List<Prenda> ropaDisponible) {
    //this.weatherService = new ServicioMeteorologico();
    //this.ropaDisponible = ropaDisponible;
  }

  public Atuendo sugerirAtuendo(String location, Guardarropas guardarropas) {

  }

  public void obtenerClimaDeHoy() {
    //TODO: Cachear en clima
    // weatherService.getWeather("Buenos Aires");
  }

  public List<Prenda> filtrarRopaQueCoincideConClima() {
    //return this.ropaDisponible.stream().filter(ropa -> ropa.esAptaParaClima());
  }

}
