public class Circle extends Shape{
    int r;
    final double pi= 3.14;
    Circle(int r){
        this.r= r;
    }
    @Override
    double calculateArea(){
        return pi*r*r;
    }
}
