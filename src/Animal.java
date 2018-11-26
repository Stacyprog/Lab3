public class Animal extends Creatures {
    Location place;
    Animal(String name) {
        super(name);
    }

    public void move(Location place) {
        this.place = place;
        switch (this.place) {
            case FIELD: {
                System.out.println(name + " находится на поле");
                this.place.setNoise(Location.FIELD);
                break;
            }
            case REEDS: {
                System.out.println(name + " вышел из камышей в поле");
                this.place.setNoise(Location.REEDS);
                break;
            }
            case PATH:
            {
                System.out.println(name + " пошел домой по дорожке");
                this.place.setNoise(Location.PATH);
                break;
            }
            case BRIDGE:
            {
                System.out.println(name + " стоит на мосту и ждет Кристофера");
                this.place.setNoise(Location.BRIDGE);
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
        return "Animals [x = " + name +  "]";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}