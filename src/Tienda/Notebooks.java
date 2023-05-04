package Tienda;

public class Notebooks extends ProductosInformaticos{
    private Integer memoria;

    public Notebooks(Integer stock, String nombre, Double precio, String fabricante, Integer memoria) {
        super(stock, nombre, precio, fabricante);
        this.memoria = memoria;
    }

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return super.toString() + "Notebooks{" +
                "memoria=" + memoria +
                '}';
    }
}
