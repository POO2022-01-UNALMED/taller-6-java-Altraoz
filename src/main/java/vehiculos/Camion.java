package vehiculos;

public class Camion extends Vehiculo{
    private int ejes;

    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes){
        super(placa, nombre, precio, peso, fabricante, 2, 80, "4x2");
        this.ejes = ejes;
    }

    public int getEjes(){return this.ejes;}
    public void setEjes(int ejes){this.ejes = ejes;}
}
