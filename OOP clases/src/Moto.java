public class Moto extends Vehiculo{
    public int cilindrada;

    public Moto(int id, String marca, int precio, int cilindrada){
        super(id, marca, precio);
        this.cilindrada = cilindrada;


    }

    public void describe() {
        System.out.println("Soy una moto con id: " + this.id);
}
}
