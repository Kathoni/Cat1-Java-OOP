

public class Rectangle{
    double length;
    double width;

    public Rectangle() {
    }
    
    public Rectangle(double length, double width) {
        this.length = length;//means the upper length
        this.width = width;
    }
    
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }

    public void setLength(double newlength) {
        this.length = newlength;
    }
        public void setWidth(double newwidth) {
          this.width = newwidth;
             }
      public double findArea(){
        return length*width;
      }
      public double findPerimeter(){
        return 2*(length + width);
      }
      
      @Override
      public String toString() {
    return "Length: " + length + "\n" + 
           "Width: " + width + "\n" + 
           "Area: " + findArea();
}
       
      

}