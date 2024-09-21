public class Shape1 
{
    public static void main(String[] args) 
    {
        Rectangle rect = new Rectangle(5, 10);
        Circle cir = new Circle(7);
        Triangle tri = new Triangle(4, 6);

        System.out.println("Area of Rectangle: " + rect.getArea());
        System.out.println("Area of Circle: " + cir.getArea());
        System.out.println("Area of Triangle: " + tri.getArea());
    }
}

interface Shape 
{
    double getArea();
}

class Rectangle implements Shape 
{
    private double length;
    private double width;

    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

    public double getArea() 
    {
        return length * width;
    }
}

class Circle implements Shape 
{
    private double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    public double getArea() 
    {
        return Math.PI * radius * radius;
    }
}

class Triangle implements Shape 
{
    private double base;
    private double height;

    public Triangle(double base, double height) 
    {
        this.base = base;
        this.height = height;
    }

    public double getArea() 
    {
        return 0.5 * base * height;
    }
}

