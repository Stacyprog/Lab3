
public class Main {
    public static void main(String[] args) {
        Animal pooh = new Animal("Винни", Forest.REEDS);
        Animal ia = new Animal("Иа", Forest.REEDS);
        Animal Tiger = new Animal("Тигруля", Forest.REEDS);
        pooh.ask(ia.name);
        ia.answer();
        Tiger.move();
        Person Chris = new Person("Кристофер Робин");
        Chris.go("Дорожка");
        Chris.mood();
        Chris.thoughts();
        Chris.go("Мост");
        Chris.thoughts();
    }
}
