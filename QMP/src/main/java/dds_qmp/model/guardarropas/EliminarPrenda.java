package dds_qmp.model.guardarropas;

import dds_qmp.model.prenda.Prenda;

public class EliminarPrenda implements ModificacionGuardarropas {
  //private int idPropuesta;
  //private EstadoModificacion estadoModificacion;
  //private AccionPrenda accionAsociada;
  private Prenda prenda;

  public EliminarPrenda(Prenda prenda) {
    //this.idPropuesta = int.random()
    this.prenda = prenda;
  }

  @Override
  public void proponerModificacionEn(Guardarropas guardarropas) {
    guardarropas.proponerEliminarPrenda(this.prenda);
  }

  @Override
  public void realizarModificacionEn(Guardarropas guardarropas) {
    guardarropas.eliminarPrenda(this.prenda);
  }

  @Override
  public void deshacerModificacionEn(Guardarropas guardarropas) {
    guardarropas.agregarPrenda(this.prenda);
  }
}
