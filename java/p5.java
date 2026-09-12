import java.util.Scanner;

class Area
{
    public static double rectArea(double length, double width)
    {
        return length * width;
    }

    public static double circleArea(double radius)
    {
        return Math.PI * radius * radius;
    }

    public static double triangleArea(double base, double height)
    {
        return 0.5 * base * height;
    }

    public static double squareArea(double side)
    {
        return side * side;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        System.out.println("Area of the rectangle: " + rectArea(length, width));

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        System.out.println("Area of the circle: " + circleArea(radius));

        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();

        System.out.println("Area of the triangle: " + triangleArea(base, height));

        System.out.print("Enter the side of the square: ");
        double side = sc.nextDouble();

        System.out.println("Area of the square: " + squareArea(side));
    }
}