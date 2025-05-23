import java.util.ArrayList;

public class ClaseGestora {
    // Atributos
    public ArrayList<ClaseBase> lista_elementos;

    // Constructor
    public ClaseGestora() {
        lista_elementos = new ArrayList<ClaseBase>();
    }

    // Método para añadir elemento
    public void agregarElemento(ClaseBase elemento) {
        if (elemento.atributo2 >= 0) {
            this.lista_elementos.add(elemento);
        }
    }

    // Método para mostrar lista de elementos
    public void mostrarListaElementos() {
        for (int i = 0; i < this.lista_elementos.size(); i++) {
            ClaseBase miElemento = this.lista_elementos.get(i);
            miElemento.metodoDescriptivo();
        }
    }

    // Método para eliminar elemento
    public void eliminarElemento(int id) throws ExcepcionPersonalizada {
        boolean existe = false;
        for (int i = 0; i < this.lista_elementos.size(); i++) {
            ClaseBase miElemento = this.lista_elementos.get(i);
            if (miElemento.id == id) {
                lista_elementos.remove(miElemento);
                System.out.println("Elemento con id " + id + " se ha eliminado correctamente.");
                existe = true;
                break;
            }
        }
        if (!existe) {
            throw new ExcepcionPersonalizada("Elemento no disponible");
        }
    }
}