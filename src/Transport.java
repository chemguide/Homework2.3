public class Transport {
    private String modelName;
    private int weelsCount;

    public Transport(String modelName, int weelsCount) {
        this.modelName = modelName;
        this.weelsCount = weelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWeelsCount() {
        return weelsCount;
    }

    public void makeService() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWeelsCount(); i++) {
            this.updateTyre();
        }
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
