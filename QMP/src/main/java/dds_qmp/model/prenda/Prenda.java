package dds_qmp.model.prenda;

import dds_qmp.model.atuendo.AfinidadClimatica;

public class Prenda {
  private TipoDePrenda tipoDePrenda;
  private Material material;
  private Trama trama;
  private Color colorPrincipal;
  private Color colorSecundario;
  private AfinidadClimatica afinidadClimatica;

  public Prenda(TipoDePrenda tipoDePrenda, Material material, Trama trama, Color colorPrincipal, Color colorSecundario, AfinidadClimatica afinidadClimatica) {
    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.trama = trama;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.afinidadClimatica = afinidadClimatica;
  }

  public AfinidadClimatica getAfinidadClimatica() {
    return afinidadClimatica;
  }
}
