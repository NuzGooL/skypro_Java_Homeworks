package P2_JavaCore.HW03_OOP_P2.V2;

public class Bicycle implements ServiceVehicle {
    private final String modelName;
    private final int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public void service() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}