package dds_qmp.model.guardarropas;

import dds_qmp.model.prenda.Prenda;

public class AgregarPrenda implements ModificacionGuardarropas {
  //private int idPropuesta;
  //private EstadoModificacion estadoModificacion;
  //private AccionPrenda accionAsociada;
  private Prenda prenda;

  public AgregarPrenda(Prenda prenda) {
    this.prenda = prenda;
  }

  @Override
  public void proponerModificacionEn(Guardarropas guardarropas) {
    guardarropas.proponerAgregarPrenda(this.prenda);
  }

  @Override
  public void realizarModificacionEn(Guardarropas guardarropas) {
    guardarropas.agregarPrenda(this.prenda);
  }

  @Override
  public void deshacerModificacionEn(Guardarropas guardarropas) {
    guardarropas.eliminarPrenda(this.prenda);
  }
}
