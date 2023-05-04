package Tienda;

import java.util.ArrayList;

public class ListaTienda{
    public ArrayList<Muebles> listaMuebles;
    public ArrayList<ProductosInformaticos>listaProdInf;

    public ListaTienda() {this.listaMuebles = new ArrayList<Muebles>();
        this.listaProdInf = new ArrayList<ProductosInformaticos>();
    }

    public ArrayList<Muebles> getListaMuebles() {
        return listaMuebles;
    }

    public void setListaMuebles(ArrayList<Muebles> listaMuebles) {
        this.listaMuebles = listaMuebles;
    }

    public ArrayList<ProductosInformaticos> getListaProdInf() {
        return listaProdInf;
    }

    public void setListaProdInf(ArrayList<ProductosInformaticos> listaProdInf) {
        this.listaProdInf = listaProdInf;
    }

    @Override
    public String toString() {
        return "ListaTienda{" +
                "listaMuebles=" + listaMuebles +
                ", listaProdInf=" + listaProdInf +
                '}';
    }
    public void agregarMuebles(Muebles i){this.listaMuebles.add(i);}
    public void agregarProdInf(ProductosInformaticos i){this.listaProdInf.add(i);}
    public void mostrarMuebles()
    {
        for(Muebles i: listaMuebles)
        {
            System.out.println(i.toString());
        }
    }
    public void mostrarProdInf()
    {
        for(ProductosInformaticos i: listaProdInf)
        {
            System.out.println(i.toString());
        }
    }
    public void mostrarListaTienda()
    {
        mostrarMuebles();
        mostrarProdInf();
    }
public void recalcularPrecio()
{
    for(Muebles i: listaMuebles)
    {
        if(i instanceof Sillas)
        {
            System.out.println("El precio de la silla es: "+ i.getPrecio());
            i.setPrecio(i.getPrecio()*1.05);
            System.out.println("El precio actualizado de la silla es: "+i.getPrecio());
        }else if(i instanceof Escritorios)
        {
            System.out.println("El precio del escritorio es: "+ i.getPrecio());
            i.setPrecio(i.getPrecio()*1.1);
            System.out.println("El precio actualizado del escritorio es: "+(double)i.getPrecio());
        }
        for(ProductosInformaticos j: listaProdInf)
        {
            if(j instanceof Impresoras)
            {
                System.out.println("El precio de la impresora es: "+ i.getPrecio());
                i.setPrecio(i.getPrecio()*1.15);
                System.out.println("El precio actualizado de la impresora es: "+ i.getPrecio());

            }else if(j instanceof Notebooks)
            {
                System.out.println("El precio de la notebook es: "+ i.getPrecio());
                i.setPrecio(i.getPrecio()*1.2);
                System.out.println("El precio actualizado de la notebook es: "+ i.getPrecio());
            }
        }
        }

    }

}
