package Tienda;

public class Escritorios extends Muebles{
    public Double ancho;
    public Double alto;


    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Escritorios(Integer stock, String nombre, Double precio, Double ancho, Double alto) {
        super(stock, nombre, precio);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public String toString() {
        return super.toString() + "Escritorios{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }
}
