package MultipleImplements;

public interface Animal {
    default void say(){
        System.out.println("I am animal");
    }
        

}
