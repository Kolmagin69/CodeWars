package Pattern.Creational;

public class Prototype {
    public  interface MakePrototype{
        Object makeNew();
    }
    public static class Dog implements MakePrototype{

        private String color;

        private int age;

        public Dog(String color, int age) {
            this.color = color;
            this.age = age;
        }

        @Override
        public Object makeNew() {
            return new Dog(color, age);
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "color='" + color + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("black", 5);
        Dog dog1 = (Dog) dog.makeNew();
        System.out.println(dog1.toString());
        System.out.println(dog == dog1);
    }
}
