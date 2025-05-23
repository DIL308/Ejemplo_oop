public class Main {
    public static void main(String[] args) {
        ClaseGestora miGestor = new ClaseGestora();

        miGestor.agregarElemento(new SubClase1(1, "marca1", 20, "material1"));
        miGestor.agregarElemento(new SubClase2(2, "marca2", 50, 500));
        miGestor.agregarElemento(new SubClase2(3, "marca3", 1000, 600));

        // miGestor.mostrarListaElementos();

        System.out.println("============");

        try {
            miGestor.eliminarElemento(1);
        } catch (ExcepcionPersonalizada e) {
            System.out.println(e.getMessage());
        }

        System.out.println("============");
        System.out.println("Lista de elementos");
        miGestor.mostrarListaElementos();
    }
}