

public class Road {
    private String place;
    public void setPlace(String place) {
        this.place = place;
    }
    public String getPlace() {
        return place;
    }
    @Override
    public boolean equals(Object object) {
        return this == object;
    }

    @Override
    public String toString() {
        return "Forest [x = " + place + "]";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
