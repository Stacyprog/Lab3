
abstract class Habitat {
    String name;
    @Override
    public boolean equals(Object object) {
        return this == object;
    }

    @Override
    public String toString() {
        return "Existance [x = " + name + "]";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
