package services;

public class Clima {
  private String direccion;
  private int temperatura;
  private String descripcion;
  private boolean lluvia;

  public Clima(String direccion, int temperatura, String descripcion, boolean lluvia) {
    this.direccion = direccion;
    this.temperatura = temperatura;
    this.descripcion = descripcion;
    this.lluvia = lluvia;
  }

  public boolean esDeDireccion(String direccion) {
    return this.direccion == direccion;
  }
}
