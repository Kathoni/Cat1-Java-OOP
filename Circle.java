public class Circle{
    String color ;
    double radius;
    public Circle(String color, double radius){
        this.color = color;
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public String geString(){
        return color + " " + radius;
    }
}