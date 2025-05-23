public class SubClase1 extends ClaseBase {
    public String atributoEspecifico;

    public SubClase1(int id, String atributo1, int atributo2, String atributoEspecifico) {
        super(id, atributo1, atributo2);
        this.atributoEspecifico = atributoEspecifico;
    }

    @Override
    public void metodoDescriptivo() {
        System.out.println("Soy una subclase con id: " + this.id);
    }
}
