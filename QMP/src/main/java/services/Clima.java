package services;

public class Clima {
  private int temperatura;
  private String descripcion;
  private boolean lluvia;

  public Clima(int temperatura, String descripcion, boolean lluvia) {
    this.temperatura = temperatura;
    this.descripcion = descripcion;
    this.lluvia = lluvia;
  }
}
