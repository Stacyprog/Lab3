


public class AnimalsOutView extends Animals implements Acting {

    public AnimalsOutView(String name, Forest area) {
        super(name, area);
    }

    public void move() {
        System.out.println(name + " появился из места : " + type);
    }

    public void ask(String a) {
    }

    public void answer() {
    }
}