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
        //know();
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
                } else if ((place.getNoise() == 0 )  || (place.getNoise() == 1)) {
                    System.out.println("Сегодня день, когда нужно что-то сделать. - подумал " + name + ", увидев своих друзей.");
                }
                else {
                    System.out.println("Никаких планов на день. - подумал " + name);
                }
                break;
            }
            default: {
                System.out.println("Никаких планов на день. - подумал " + name);
                break;
            }
        }
    }

    public void ask(String a) {
        System.out.println(name + " спрашивает " + a);
    }

    public void answer() {
        System.out.println(name + " отвечает");
    }

    @Override
    public void know() {
        setKnowledge(" знает, сколько будет дважды девятнадцать");
        if (place.equals(Forest.BRIDGE)) {
            if ((place.getNoise() == 0 )  || (place.getNoise() == 1)) {
                setKnowledge(" знает базовую математику");
            } else {
                setKnowledge(" знает все-все на свете");
            }
        }
        System.out.println(name + getKnowledge());
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