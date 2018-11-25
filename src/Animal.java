

public class Animal extends Habitat implements Speech, Acting {
    Forest point;
    public String type;

    Animal(String name, Forest area) {
        super.name = name;
        this.point = area;
        switch (this.point) {
            case GLADE:
                this.type = "Поле";
                break;
            case REEDS:
                this.type = "Камыши";
                break;
            case SWAMP:
                this.type = "Болото";
                break;
            case BRIDGE:
                this.type = "Мост";
                break;
        }
    }
    public void ask(String a) {
        System.out.println(name + " спрашивает " + a);
    }
    public void answer() {
        System.out.println(name + " отвечает");
    }
    public void move() {
        if (point == Forest.GLADE) {
            System.out.println(name + "находится на месте: " + type);
        }
        else if (point == Forest.REEDS) {
            System.out.println(name + " вышел из места : " + type);
        }
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
