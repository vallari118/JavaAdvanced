package training.methodReference;

public class Main {

    public static void main(String[] args) {
        Square s = new Square(4);
    //Here we can replace Lambda expression with method reference
//        Shapes shapes = (square) -> {
//            return square.calculateArea();
//        };

        //Syntax for Method Reference --> Functional interface = Class Name::Method Name
        Shapes shapes = Square::calculateArea;
        System.out.println("Area is : " + shapes.getArea(s));
    }
}
