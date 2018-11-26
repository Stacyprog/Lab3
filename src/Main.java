
public class Main {
    public static void main(String[] args) {
        Animal Pooh = new Animal("Винни");
        Animal Ia = new Animal("Иа");
        Animal Tiger = new Animal("Тигруля");
        Pooh.ask(Ia.name);
        Ia.answer();
        Tiger.move(Forest.PATH);
        Person Chris = new Person("Кристофер Робин");
        Chris.move(Forest.PATH);
        Chris.mood();
        Chris.think();
        Chris.move(Forest.BRIDGE);
        Chris.think();
        Chris.know();
    }
}
