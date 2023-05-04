package Tienda;

public class Sillas extends Muebles implements Porcentaje{
    public String ruedas;

    public String getRuedas() {
        return ruedas;
    }

    public void setRuedas(String ruedas) {
        this.ruedas = ruedas;
    }

    public Sillas(Integer stock, String nombre, Double precio, String ruedas) {
        super(stock, nombre, precio);
        if(verificarRuedas(ruedas))
        {this.ruedas = ruedas;}
    }

    public static Boolean verificarRuedas(String ruedas)
    {
        return (boolean)ruedas.equals("si")||ruedas.equals("no");
    }

    @Override
    public String toString() {
        return super.toString() + "Sillas{" +
                "ruedas='" + ruedas + '\'' +
                '}';
    }

    @Override
    public Double porcentaje() {return 20.0;

    }
}
