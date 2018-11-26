
import java.util.Arrays;

abstract class Creatures implements Speech, Acting{
    String name;
    private String[] knowledge = new String[1];

    public Creatures(String name) {
        this.name = name;
        knowledge[0] = "Ничего не знает";
    }

    public String ask(String question) {
        return(name + " спрашивает: \"" + question + "\"");
    }

    public String answer(String ans) {
        return(name + " отвечает: \"" + ans + "\"");
    }

    public void addKnowledge(String knowledge) {
        this.knowledge = Arrays.copyOf(this.knowledge, this.knowledge.length + 1);
        this.knowledge[this.knowledge.length - 1] = knowledge;
    }

    public String[] getKnowledge() {
        return knowledge;
    }

    @Override
    public boolean equals(Object object) {
        return this == object;
    }

    @Override
    public String toString() {
        return "Creatures [x = " + name + "]";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
