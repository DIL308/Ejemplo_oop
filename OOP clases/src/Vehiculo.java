public class Vehiculo {
    public int id;
    public String marca;
    public int precio;

    public Vehiculo(int id, String marca, int precio) {
        this.id = id;
        this.marca = marca;
        this.precio = precio;
    }

    public void describe(){
        System.out.println("Soy un vehiculo");
    }
}
