package dds_qmp.model.atuendo;

import dds_qmp.model.prenda.Prenda;

public class Atuendo {
  private Prenda parteSuperior;
  private Prenda parteInferior;
  private Prenda calzado;
  private Prenda accesorios;
  private AfinidadClimatica afinidadClimatica;

  public Atuendo(Prenda parteSuperior, Prenda parteInferior, Prenda calzado, Prenda accesorios, AfinidadClimatica afinidadClimatica) {
    this.parteSuperior = parteSuperior;
    this.parteInferior = parteInferior;
    this.calzado = calzado;
    this.accesorios = accesorios;
    this.afinidadClimatica = afinidadClimatica;
  }

}
