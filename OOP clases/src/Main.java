//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TiendaVehiculos miTIenda = new TiendaVehiculos();



        miTIenda.addVehiculo(new Bicicleta(1, "corvea", 20, "plastico"));
        miTIenda.addVehiculo(new Moto(2,"yamaha", 50, 500));
        miTIenda.addVehiculo(new Moto(3 ,"Honda", 1000, 600));


        //  miTIenda.showListaVehiculos();

        System.out.println("============");

        try {
            miTIenda.vendeVehiculo(1);
        } catch (VehiculoNoDisponibleException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("============");
        System.out.println("Lista de vehiculos");
        miTIenda.showListaVehiculos();


        }
    }