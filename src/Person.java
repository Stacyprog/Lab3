public class Person extends Habitat implements Acting {
    Forest place;
    Person(String name) {
        super.name = name;
    }

    public void move(Forest place) {
        this.place = place;
        switch (this.place) {
            case FIELD: {
                System.out.println(name + "пришел к друзьям на поле");
                break;
            }
            case REEDS: {
                System.out.println(name + "полез в камыши искать Тигрулю");
                break;
            }
            case PATH: {
                System.out.println(name + " идет по дорожке");
                break;
            }
            case BRIDGE: {
                System.out.println(name + " подошел к мосту");
            }
        }
    }

    void mood() {
        System.out.println("Настроение : солнечное и безоблачное");
    }

    void think() {
        switch (place) {
            case PATH: {
                System.out.print("Если я встану на нижнюю перекладину перил моста и наклонюсь над рекой, ");
                System.out.print("я узнаю все-все на свете и тогда я расскажу все это Пуху, который пока ");
                System.out.println("еще знает не все на свете. - подумал " + name);
                break;
            }
            case BRIDGE: {
                System.out.print("Сегодня день, когда нужно что-то сделать.");
                System.out.println(" - подумал " + name + ", увидев своих друзей.");
                break;
            }
            default: {
                System.out.println("никаких планов на день. - подумал " + name);
                break;
            }
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