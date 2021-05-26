package dds_qmp.model.guardarropas;

import dds_qmp.model.Usuario;
import dds_qmp.model.prenda.Prenda;

public class ModificacionGuardarropas {
  private AccionPrenda accionAsociada;
  private Prenda prenda;
  private Usuario autor;
  private EstadoModificacion estadoModificacion;

  public ModificacionGuardarropas(AccionPrenda accionAsociada, Prenda prenda, Usuario autor, EstadoModificacion estadoModificacion) {
    this.accionAsociada = accionAsociada;
    this.prenda = prenda;
    this.autor = autor;
    this.estadoModificacion = estadoModificacion;
  }

  public void setEstadoModificacion(EstadoModificacion estadoModificacion) {
    this.estadoModificacion = estadoModificacion;
  }
}
