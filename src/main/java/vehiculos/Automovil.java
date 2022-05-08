package vehiculos;

public class Automovil extends Vehiculo{
    private int puestos;

    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos){
        super(placa, nombre, precio, peso, fabricante, 4, 100, "FWD");
        this.puestos = puestos;
    }

    public int getPuestos(){return this.puestos;}
    public void setPuestos(int puestos){this.puestos = puestos;}



}
