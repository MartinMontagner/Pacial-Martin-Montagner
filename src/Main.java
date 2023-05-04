import Tienda.*;

public class Main {

    public static void main(String[] args) {
        //punto 1
    Escritorios escritorio=new Escritorios(10,"escritorio",25000.5,150.1,150.1);
    Sillas sillas=new Sillas(10,"sillas",20000.2,"si");
        Impresoras impresoras=new Impresoras(10,"impresoras",1000.1,"hp",5);
        Notebooks notebooks=new Notebooks(10,"notebooks",100000.0,"hp",512);
// punto 3
    ListaTienda listaTienda=new ListaTienda();
    listaTienda.agregarMuebles(escritorio);
    listaTienda.agregarMuebles(sillas);
    listaTienda.agregarProdInf(impresoras);
    listaTienda.agregarProdInf(notebooks);
    listaTienda.mostrarListaTienda();
// punto 4
        System.out.println("El descuento para la silla es de "+ sillas.porcentaje());
        sillas.setPrecio(sillas.getPrecio()*(1-(sillas.porcentaje()/100)));
        System.out.println("El nuevo precio para la silla es: "+ sillas.getPrecio());
        System.out.println("El descuento para las impresoras es de " + impresoras.porcentaje());
        impresoras.setPrecio(impresoras.getPrecio()*(1-(impresoras.porcentaje()/100)));
        System.out.println("El nuevo precio para las impresoras es: "+ impresoras.getPrecio());
            //punto 5
    listaTienda.recalcularPrecio();
    listaTienda.mostrarListaTienda();

    }
}