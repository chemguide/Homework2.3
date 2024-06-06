public class Truck extends Transport {
    public Truck(String modelName, int weelsCount) {
        super(modelName, weelsCount);
    }

    public void makeService() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWeelsCount(); i++) {
            this.updateTyre();
        }
        this.checkEngine();
        this.checkTrailer();
    }
}
