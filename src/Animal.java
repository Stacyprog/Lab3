

public class Animal extends Habitat implements Speech, Acting {
    Forest place;
    public String type;

    Animal(String name) {
        super.name = name;
    }

    public void move(Forest place) {
        this.place = place;
        switch (this.place) {
            case FIELD: {
                System.out.println(name + " находится на поле");
                break;
            }
            case REEDS: {
                System.out.println(name + " вышел из камышей в поле");
                break;
            }
            case PATH:
            {
                System.out.println(name + " пошел домой по дорожке");
                break;
            }
            case BRIDGE:
            {
                System.out.println(name + " стоит на мосту и ждет Кристофера");
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
