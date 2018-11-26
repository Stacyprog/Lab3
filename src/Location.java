public enum   Location {
    FIELD,
    REEDS,
    PATH,
    BRIDGE;
    static int noise;

    public int getNoise() {
        return noise;
    }

    public void setNoise(Location place) {
        noise = place.ordinal();
    }
}