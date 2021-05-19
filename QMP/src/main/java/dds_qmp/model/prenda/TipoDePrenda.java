package dds_qmp.model.prenda;

public class TipoDePrenda {
  private Categoria categoria;

  public TipoDePrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  //constant ZAPATO = new TipoDePrenda(CALZADO)
  //constant REMERA = new TipoDePrenda(PARTE_SUPERIOR)
  //constant PANTALON = new TipoDePrenda(PARTE_INFERIOR)
}
