package dds_qmp.model.guardarropas;

import dds_qmp.model.Usuario;
import dds_qmp.model.atuendo.Atuendo;
import dds_qmp.model.prenda.Prenda;

import java.util.List;

public class Guardarropas {
  private String descripcionGuardarropas;
  private List<Prenda> prendas;
  private List<Atuendo> atuendos;

  private Usuario coDuenio;
  private List<ModificacionGuardarropas> propuestasDeModificacion;


  //sabe calcular todas las combinaciones posibles de ropa, sean o no útiles
}
