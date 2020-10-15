public class Casting {
    static class Animal{
        void eat(){
            System.out.println("eat");
        }
    }
    static class Cat extends Animal{
        void meow(){
            System.out.println("meow");
        }
    }
    static class Dog extends Animal{
        void woof(){
            System.out.println("woof");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Cat();
        ((Cat) animal).meow();
        Cat cat = (Cat) animal;
        cat.meow();
        int i = new Integer(10);
        ((Integer) i).toString();
        Animal[] animals = new Cat[10];
        Cat[] cats = (Cat[])animals;
        Object object = cats;
    }
}
