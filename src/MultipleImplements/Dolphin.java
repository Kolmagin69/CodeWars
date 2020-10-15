package MultipleImplements;

public class Dolphin implements Animal, Fish {
    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin();
        dolphin.say();
    }

    @Override
    public void say() {
        Fish.super.say();
        Animal.super.say();

    }
}
