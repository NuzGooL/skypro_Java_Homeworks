package P2_JavaCore.HW03_OOP_P2.V1;

public interface VehicleInterface {

    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    String getModelName();

    int getWheelsCount();
}