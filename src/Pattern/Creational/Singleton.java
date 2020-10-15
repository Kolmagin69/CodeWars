package Pattern.Creational;

public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Kristina");
        Singleton singleton1 = Singleton.getInstance("Nikita");
        System.out.println(singleton.value + " " + singleton1.value);
        System.out.println(singleton == singleton1);
    }
}
