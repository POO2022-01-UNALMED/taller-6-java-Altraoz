package vehiculos;

public class Vehiculo {
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private int precio;
    private int peso;
    private String traccion;
    private Fabricante fabricante;
    private int cantidadVehiculos;

    public Vehiculo(String placa, String nombre, int precio, int peso, Fabricante fabricante,
                    int puertas, int velocidadMaxima, String traccion){
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.traccion = traccion;
    }

    public String getPlaca(){return this.placa;}
    public void setPlaca(String placa){this.placa = placa;}

    public int getPuertas(){return this.puertas;}
    public void setPuertas(int puertas){this.puertas = puertas;}

    public int getVelocidadMaxima(){return this.velocidadMaxima;}
    public void setVelocidadMaxima(int velocidadMaxima){this.velocidadMaxima = velocidadMaxima;}

    public String getNombre(){return this.nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    public int getPrecio(){return this.precio;}
    public void setPrecio(int precio){this.precio = precio;}

    public int getPeso(){return this.peso;}
    public void setPeso(int peso){this.peso = peso;}

    public String getTraccion(){return this.traccion;}
    public void setTraccion(String traccion){this.traccion = traccion;}

    public Fabricante getFabricante(){return this.fabricante;}
    public void setFabricante(Fabricante fabricante){this.fabricante = fabricante;}

    public int getCantidadVehiculos(){return this.cantidadVehiculos;}
    public void setCantidadVehiculos(int cantidadVehiculos){this.cantidadVehiculos = cantidadVehiculos;}


}
