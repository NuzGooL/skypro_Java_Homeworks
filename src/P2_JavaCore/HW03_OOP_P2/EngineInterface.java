package P2_JavaCore.HW03_OOP_P2;

public interface EngineInterface {
    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}