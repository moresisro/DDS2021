package dds_qmp.model.atuendo;

import services.Clima;

public class AfinidadClimatica {
  private String descripcion;
  private int minTemp;
  private int maxTemp;
  private boolean lluvia;

  public AfinidadClimatica(String descripcion, int minTemp, int maxTemp, boolean lluvia) {
    //TODO: Chequear que las temperaturas max/min sean validas
    this.descripcion = descripcion;
    this.minTemp = minTemp;
    this.maxTemp = maxTemp;
    this.lluvia = lluvia;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public int getMinTemp() {
    return minTemp;
  }

  public int getMaxTemp() {
    return maxTemp;
  }

  public boolean isLluvia() {
    return lluvia;
  }

  public boolean esAfinAClima(Clima clima) {
    //TODO
    return true;
  }
}
