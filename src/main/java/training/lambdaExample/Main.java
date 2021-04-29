package training.lambdaExample;

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

        //Lambda Expression for one Argument
        //Writing String is optional
        GreetingMessage gm2 = (String message) -> {
            System.out.println("Good "+message);
        };
        gm2.greet("Afternoon");

        MessagePrinter printer = () -> {
            System.out.println("This is for no argument Lambda Expression");
        };
        printer.printMessage();
    }

}
