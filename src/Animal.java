

public class Person extends Habitat implements Acting, Speech{
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
        System.out.println("Настроение у него - солнечное и безоблачное");
    }

    void think() {
        switch (place) {
            case PATH: {
                System.out.print("\"Если я встану на нижнюю перекладину перил моста и наклонюсь над рекой, ");
                System.out.print("я узнаю все-все на свете и тогда я расскажу все это Пуху, который пока ");
                System.out.println("еще знает не все на свете,\" - подумал " + name);
                break;
            }
            case BRIDGE: {
                if (getKnowledge().equals("Знает всё на свете")) {
                    System.out.println("Я теперь знаю всё-всё на свете, и я должен рассказать об этом Пуху!");
                } else {
                    System.out.print(getKnowledge() + " - подумал " + name + ", увидев своих друзей.");
                }
                break;
            }
            default: {
                System.out.println("никаких планов на день. - подумал " + name);
                break;
            }
        }
        know();
    }

    public void ask(String a) {
        System.out.println(name + " спрашивает " + a);
    }

    public void answer() {
        System.out.println(name + " отвечает");
    }

    @Override
    public void know() {
        setKnowledge("Знает 2х19");
        if ((place.equals(Forest.BRIDGE)) && (Forest.FIELD.getNoise())) {
            if (!place.getNoise()) {
                setKnowledge("Знает всё-всё на свете");
            } else {
                setKnowledge("Сегодня день, когда нужно что-то сделать.");
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
