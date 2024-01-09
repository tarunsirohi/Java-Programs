import java.util.Scanner;
class Area {
    double length1, length2, length3;

    public Area() {
        length1 = 0;
        length2 = 0;
        length3 = 0;
    }

    public Area(double l1) {
        length1 = l1;
        length2 = 0;
        length3 = 0;
    }

    public Area(double l1, double l2) {
        length1 = l1;
        length2 = l2;
        length3 = 0;
    }

    public Area(double l1, double l2, double l3) {
        length1 = l1;
        length2 = l2;
        length3 = l3;
    }

    public void compute(double side) {
        System.out.println("Area of square: " + (side * side));
    }

    public void compute(double length, double breadth) {
        System.out.println("Area of rectangle: " + (length * breadth));
    }

    public void compute(double side1, double side2, double side3) {
        System.out.println("Volume of cuboid: " + (side1 * side2 * side3));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side length for square: ");
        double side = sc.nextDouble();

        System.out.print("Enter length and breadth for rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        System.out.print("Enter side lengths for cuboid: ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        Area obj1 = new Area();
        Area obj2 = new Area(side);
        Area obj3 = new Area(length, breadth);
        Area obj4 = new Area(side1, side2, side3);

        obj1.compute(side);
        obj2.compute(length, breadth);
        obj3.compute(side1, side2, side3);
        obj4.compute(side1, side2, side3); 
        sc.close();
    }
}