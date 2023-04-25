public class Rectangle {
    private double length = 0.0;
    private double breadth = 0.0;
    
    public Rectangle (double length, double breadth){
        this.length = length;
        this.breadth = breadth;
        
        if (length == breadth){
            System.out.println("This is a Square");
        }
        else{
            System.out.println("This is a Rectangle");
        }
    }
    
    public double getArea(){
        return length * breadth;
    }
    
    public double getPerimeter(){
        return 2*(length + breadth);
    }
    
    
}
