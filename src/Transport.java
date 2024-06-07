public abstract class Transport {
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
}
