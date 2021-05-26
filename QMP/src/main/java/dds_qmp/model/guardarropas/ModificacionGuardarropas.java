package dds_qmp.model.guardarropas;

public interface ModificacionGuardarropas {
  void proponerModificacionEn(Guardarropas guardarropas);
  void realizarModificacionEn(Guardarropas guardarropas);
  void deshacerModificacionEn(Guardarropas guardarropas);
}
