import java.util.Scanner;

public class Retangle {
    int width;
    int height;

    public Retangle() {
    }

    public Retangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return this.width * this.height;
    }

    public int getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public String display() {
        return "Hello";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Retangle retangle = new Retangle();
        System.out.println("Enter width ");
        retangle.width = scanner.nextInt();
        System.out.println("Enter height ");
        retangle.height = scanner.nextInt();
        System.out.println("Retangle have width is " + retangle.width + " and height " + retangle.height + "." + " Area = " + retangle.getArea() + " and Perimeter = " + retangle.getPerimeter());
    }
}
