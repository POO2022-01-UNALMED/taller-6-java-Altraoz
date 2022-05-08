package vehiculos;

public class Camioneta extends Vehiculo{
    private Boolean volco;

    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, Boolean volco){
        super(placa, nombre, precio, peso, fabricante, puertas, 90, "4X4");
        this.volco = volco;
    }

    public Boolean getVolco(){return this.volco;}
    public void setVolco(Boolean volco){this.volco = volco;}
}
