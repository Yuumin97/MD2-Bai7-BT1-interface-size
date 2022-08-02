package rekkei.academy;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{new Circle(), new Square(), new Rectangle()};

        System.out.println("truoc khi truyen:");
        System.out.println("Circle: " + ((Circle) shapes[0]).getArea());
        System.out.println("Square: " + ((Square) shapes[1]).getArea());
        System.out.println("Rectangle: " + ((Rectangle) shapes[2]).getArea());

        ((Circle) shapes[0]).resize(Math.floor(Math.random() * 100 + 1));
        ((Square) shapes[1]).resize(Math.floor(Math.random() * 100 + 1));
        ((Rectangle) shapes[2]).resize(Math.floor(Math.random() * 100 + 1));

        System.out.println("");

        System.out.println("Sau khi truyen:");
        System.out.println("Circle: " + ((Circle) shapes[0]).getArea());
        System.out.println("Square: " + ((Square) shapes[1]).getArea());
        System.out.println("Rectangle: " + ((Rectangle) shapes[2]).getArea());

    }
}