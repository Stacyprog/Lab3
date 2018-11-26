public class Animal extends Habitat implements Speech, Acting {
    Forest place;

    Animal(String name) {
        super.name = name;
    }

    public void move(Forest place) {
        this.place = place;
        switch (this.place) {
            case FIELD: {
                System.out.println(name + " находится на поле");
                this.place.setNoise(Forest.FIELD);
                break;
            }
            case REEDS: {
                System.out.println(name + " вышел из камышей в поле");
                this.place.setNoise(Forest.REEDS);
                break;
            }
            case PATH:
            {
                System.out.println(name + " пошел домой по дорожке");
                this.place.setNoise(Forest.PATH);
                break;
            }
            case BRIDGE:
            {
                System.out.println(name + " стоит на мосту и ждет Кристофера");
                this.place.setNoise(Forest.BRIDGE);
            }
        }
    }

    public void ask(String a) {
        System.out.println(name + " спрашивает " + a + ": \"Как тебя зовут?\"");
    }

    public void answer() {
        System.out.println(name + " отвечает: \"Меня зовут...\"");
    }


    @Override
    public boolean equals(Object object) {
        return this == object;
    }

    @Override
    public String toString() {
        return "Animals [x = " + name +  "]";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}