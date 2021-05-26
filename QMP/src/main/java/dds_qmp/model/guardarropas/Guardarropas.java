package dds_qmp.model.guardarropas;

import dds_qmp.model.Usuario;
import dds_qmp.model.atuendo.Atuendo;
import dds_qmp.model.prenda.Prenda;

import java.util.List;

public class Guardarropas {
  private Criterio criterio;
  private List<Prenda> prendas;
  private List<Atuendo> atuendos;

  private Usuario coDuenio;
  private List<ModificacionGuardarropas> propuestasDeModificacionPendientes;
  private List<ModificacionGuardarropas> propuestasDeModificacionAceptadas;


  //Sabe calcular todas las combinaciones posibles de ropa, sean o no útiles


  public void proponerAgregarPrenda(Prenda prenda) {
    AgregarPrenda propuestaAgregar = new AgregarPrenda(prenda);
    this.propuestasDeModificacionPendientes.add(propuestaAgregar);
  }

  public void proponerEliminarPrenda(Prenda prenda) {
    EliminarPrenda propuestaEliminar = new EliminarPrenda(prenda);
    this.propuestasDeModificacionPendientes.add(propuestaEliminar);
  }

  public void agregarPrenda(Prenda prenda) {
    this.prendas.add(prenda);
  }

  public void eliminarPrenda(Prenda prenda) {
    this.prendas.remove(prenda);
  }

  public void aceptarPropuestaModificacion(ModificacionGuardarropas propuesta) {
    propuesta.realizarModificacionEn(this);
    propuestasDeModificacionPendientes.remove(propuesta);
    propuestasDeModificacionAceptadas.add(propuesta);

  }

  public void deshacerPropuestaModificacion(ModificacionGuardarropas propuesta) {
    propuestasDeModificacionAceptadas.remove(propuesta);
    propuesta.deshacerModificacionEn(this);
  }
}
