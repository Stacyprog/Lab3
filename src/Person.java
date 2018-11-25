public class Person extends Habitat {
    Road path = new Road();
    Person(String name) {
        super.name = name;
    }

    void go(String place) {
        path.setPlace(place);
        System.out.println(name + " пошагал на место: " + path.getPlace());

    }

    void mood() {
        System.out.println("Настроение : солнечное и безоблачное");
    }

    boolean thoughts() {
        if (path.getPlace().equals("Дорожка")) {
            System.out.print("Если я встану на нижнюю перекладину перил моста и наклонюсь над рекой, ");
            System.out.print("я узнаю все-все на свете и тогда я расскажу все это Пуху, который пока ");
            System.out.println("еще знает не все на свете. - подумал " + name);
            return true;
        } else if (path.getPlace().equals("Мосnт")) {
            System.out.print("Сегодня день, когда нужно что-то сделать.");
            System.out.println(" - подумал " + name + ", увидев своих друзей.");
            return true;
        } else {
            System.out.println("никаких планов на день. - подумал " + name);
            return false;
        }
    }
    @Override
    public boolean equals(Object object) {
        return this == object;
    }

    @Override
    public String toString() {
        return "Person [x = " + name + "]";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}