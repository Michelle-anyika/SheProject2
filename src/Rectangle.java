public class Rectangle extends Shape {
    int length;
    int width;

    Rectangle(int length, int width){
        this.length= length;
        this.width= width;


        }
    @Override
    double calculateArea(){
        return length*width;
    }
}
