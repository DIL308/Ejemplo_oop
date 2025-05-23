import java.util.List;
import java.util.ArrayList; // Necesario para inicializar la lista

public class TiendaVehiculos {
    // Atributos
    public ArrayList<Vehiculo> lista_vehiculos;

    // Constructor
    public TiendaVehiculos() {
        lista_vehiculos = new ArrayList<Vehiculo>();
    }

    // Método para añadir vehículo
    public void addVehiculo(Vehiculo vehiculo) {
        if (vehiculo.precio >= 0)
            this.lista_vehiculos.add(vehiculo);
    }

    public void showListaVehiculos() {
        for (int i=0; i< this.lista_vehiculos.size(); i++) {
           Vehiculo miVehiculo = this.lista_vehiculos.get(i);
           miVehiculo.describe();
        }
    }

    public void vendeVehiculo(int id) throws VehiculoNoDisponibleException  {
        boolean existe = false;
        for (int i=0; i< this.lista_vehiculos.size(); i++) {
            Vehiculo miVehiculo = this.lista_vehiculos.get(i);
            if (miVehiculo.id == id){
                lista_vehiculos.remove(miVehiculo);
                System.out.println("Vehículo con id" +  id + " se ha vendido correctamente.");
                existe = true;
                break;

            }
            }
        if (!existe) {
                throw new VehiculoNoDisponibleException("Vehiculo no disponible");

        }

        }

    }

