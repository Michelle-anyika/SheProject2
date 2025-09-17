//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape rectangle= new Rectangle(20, 10);
        Shape triangle= new Triangle(16, 8);
        Shape circle= new Circle(9);

        System.out.println("the area of rectangle: "+rectangle.calculateArea());
        System.out.println("the area of triangle: "+ triangle.calculateArea());
        System.out.println("the area of circle : "+circle.calculateArea());
    }
}