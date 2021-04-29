package training.functional_Interface;

public class Main {

    public static void main(String[] args) {
        //Anonymous class
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String message) {
                System.out.println("Good "+message);
            }
        };

        gm.greet("Morning");
    }

}
