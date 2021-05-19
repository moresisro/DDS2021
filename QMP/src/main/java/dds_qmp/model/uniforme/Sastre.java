package dds_qmp.model.uniforme;

import dds_qmp.model.prenda.Prenda;

abstract public class Sastre {

  public Uniforme fabricarUniforme() {
       return new Uniforme(
            this.fabricarParteSuperior(),
            this.fabricarParteInferior(),
            this.fabricarCalzado());
      }

  protected abstract Prenda fabricarParteSuperior();
  protected abstract Prenda fabricarParteInferior();
  protected abstract Prenda fabricarCalzado();
}
