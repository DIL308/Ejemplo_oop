public class SubClase2 extends ClaseBase {
    public int atributoEspecifico;

    public SubClase2(int id, String atributo1, int atributo2, int atributoEspecifico) {
        super(id, atributo1, atributo2);
        this.atributoEspecifico = atributoEspecifico;
    }

    @Override
    public void metodoDescriptivo() {
        System.out.println("Soy una subclase con id: " + this.id);
    }
}