
public class Main {
    public static void main(String[] args) {
        Animals pooh = new Animals("Винни", Forest.REEDS);
        Animals ia = new Animals("Иа", Forest.REEDS);
        AnimalsOutView Tiger = new AnimalsOutView("Тигруля", Forest.REEDS);
        pooh.ask(ia.name);
        ia.answer();
        Tiger.move();
        Person Chris = new Person("Кристофер Робин");
        Chris.go("Дорожка");
        Chris.mood();
        Chris.dreams();
        Chris.go("Мост");
        Chris.dreams();


    }
}
