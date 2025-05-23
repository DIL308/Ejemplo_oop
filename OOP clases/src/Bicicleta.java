public class Bicicleta extends Vehiculo{
    public String materialPedales;

    public Bicicleta(int id, String marca, int precio, String materialPedales) {
        super(id, marca, precio);
        this.materialPedales = materialPedales;
    }
    @Override
    public void describe() {
        System.out.println("Soy una bicicleta con id: " +this.id);

    }
}
