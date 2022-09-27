package codigosPrueba;

public class Mercancia {
    String nombre;
    double Precio;
    int Ventas;
    int Compras;
    Integer Exist;

    public Mercancia(String nombre, double precio, int ventas, int compras, Integer exist) {
        this.nombre=nombre;
        Precio=precio;
        Ventas=ventas;
        Compras=compras;
        Exist=exist;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        this.Precio = precio;
    }

    public int getVentas() {
        return Ventas;
    }

    public void setVentas(int ventas) {
        this.Ventas = ventas;
    }

    public int getCompras() {
        return Compras;
    }

    public void setCompras(int compras) {
        this.Compras = compras;
    }

    public Integer getExist() {
        return Exist;
    }

    public void setExist(Integer exist) {
        this.Exist = exist;
    }
@Override
   public String toString(){
        return nombre+","+Precio+","+Ventas+","+Compras+","+Exist;
   }
}
