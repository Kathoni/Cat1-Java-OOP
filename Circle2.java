public class Circle2{
    double radius;
    String color;

    public Circle2(double radius,String color){
        this.radius=radius;
        this.color= color; 
    }
    public double getRadius(){
       return radius;
    }
    public String getColor(){
        return color;
    }
    public void setRadius(double newRadius){
         
    }
    public void setColor (String newColor){
    }
    public  double getArea() {
        return radius*radius*Math.PI;
    }
   public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    @Override

    public String toString(){
        return "Circle[radius="+radius+"]"+
                "Color[color="+color+"]"+
                "Area="+getArea()+
                "Circumference="+getCircumference();

    }
}