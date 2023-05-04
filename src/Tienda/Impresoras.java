package Tienda;

public class Impresoras extends ProductosInformaticos implements Porcentaje{
    public Integer impresionesXMinuto;

    public Integer getImpresionesXMinuto() {
        return impresionesXMinuto;
    }

    public void setImpresionesXMinuto(Integer impresionesXMinuto) {
        this.impresionesXMinuto = impresionesXMinuto;
    }

    public Impresoras(Integer stock, String nombre, Double precio, String fabricante, Integer impresionesXMinuto) {
        super(stock, nombre, precio, fabricante);
        this.impresionesXMinuto = impresionesXMinuto;
    }

    @Override
    public Double porcentaje() {
        return 30.0;
    }
}
