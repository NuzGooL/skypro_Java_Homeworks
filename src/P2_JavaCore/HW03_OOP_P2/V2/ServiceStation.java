package P2_JavaCore.HW03_OOP_P2.V2;

public class ServiceStation {

    public void check(Bicycle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        vehicle.service();
    }
}