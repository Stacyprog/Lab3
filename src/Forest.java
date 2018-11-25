

public enum   Forest {
       FIELD,
       REEDS,
       PATH,
       BRIDGE ;
    private boolean noise;
    public void setNoise(boolean noise) {
        this.noise = noise;
    }
    public boolean getNoise() {
        return noise;
    }
}
