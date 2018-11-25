
abstract class Habitat {
    String name;
    private String knowlege = "Ничего не знает";
    public void setKnowlege(String knowlege) {
        this.knowlege = knowlege;
    }
    public String getKnowlege() {
        return knowlege;
    }

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
