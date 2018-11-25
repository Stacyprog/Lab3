
public class Main {
    public static void main(String[] args) {
        Animal pooh = new Animal("Винни");
        Animal ia = new Animal("Иа");
        Animal Tiger = new Animal("Тигруля");
        pooh.ask(ia.name);
        ia.answer();
        Tiger.move(Forest.REEDS);
        Person Chris = new Person("Кристофер Робин");
        Chris.move("Дорожка");
        Chris.mood();
        Chris.think();
        Chris.move("Мост");
        Chris.think();
    }
}
