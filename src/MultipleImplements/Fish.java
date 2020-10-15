package MultipleImplements;

public interface Fish {
    default void say(){
        System.out.println("I am fish");
    }
}
