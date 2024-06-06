public class Car extends Transport {
   public Car(String modelName, int weelsCount) {
       super(modelName, weelsCount);
   }

    public void makeService() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWeelsCount(); i++) {
            this.updateTyre();
        }
        this.checkEngine();
    }
}
