package dds_qmp.model.prenda;

import dds_qmp.model.atuendo.AfinidadClimatica;

//Este va a ser mi builder
public class Borrador {
  private TipoDePrenda tipoDePrenda;
  private Material material;
  private Trama trama = Trama.LISA;
  private Color colorPrincipal;
  private Color colorSecundario;
  private AfinidadClimatica afinidadClimatica;

  public Borrador(TipoDePrenda tipoDePrenda) {
    //TODO: validateNonNull
    this.tipoDePrenda = tipoDePrenda;
  }

  public void especificarColorPrincipal(Color colorPrincipal) {
    //TODO: validateNonNull
    this.colorPrincipal = colorPrincipal;
  }

  public void especificarMaterial(Material material) {
    //TODO: validateNonNull
    this.validarMaterialConsistenteConTipoDePrenda(material);
    this.material = material;
  }

  public void especificarTrama(Trama trama) {
    //TODO: validateNonNull y por defecto lisa
    this.trama = trama;
  }

  public void especificarAfinidadClimatica(AfinidadClimatica afinidadClimatica) {
    //TODO: validateNonNull y por defecto lisa
    this.afinidadClimatica = afinidadClimatica;
  }

  public Prenda crearPrenda() {
    //TODO: validateNonNull
    return new Prenda(this.tipoDePrenda, this.material, this.trama, this.colorPrincipal, this.colorSecundario, this.afinidadClimatica);
  }
  public boolean validarMaterialConsistenteConTipoDePrenda(Material material) {
    //TODO
    return true;
  }

}
