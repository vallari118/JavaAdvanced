package training.functional_Interface;

//A functional interface is an interface which contains only single abstract method

@FunctionalInterface
public interface GreetingMessage {

    public abstract void greet(String message);
}
