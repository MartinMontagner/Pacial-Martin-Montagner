package Tienda;

public class ProductosInformaticos {
    private Integer stock;
    private String nombre;
    private Double precio;
    private String fabricante;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public ProductosInformaticos(Integer stock, String nombre, Double precio, String fabricante) {
        this.stock = stock;
        this.nombre = nombre;
        this.precio = precio;
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "ProductosInformaticos{" +
                "stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
