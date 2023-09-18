package P2_JavaCore.HW03_OOP_P2.V1;

public interface TrailerInterface {
    default void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
