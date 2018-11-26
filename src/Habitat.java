
abstract class Habitat {
    String name;
    private String knowledge = "Ничего не знает";
    public void setKnowledge(String knowledge) {
        this.knowledge = knowledge;
    }
    public String getKnowledge() {
        return knowledge;
    }

    void know() {
        System.out.println(getKnowledge());
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
