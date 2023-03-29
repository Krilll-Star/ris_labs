/**
 Класс Main является главным классом, в котором находится и выполняется главная
 функция
 author Старченко Кирилл
 */

public class Main {     // главная функция
    public static void main(String[] args) {
        System.out.println();   // для красоты

        Circle circle = new Circle(5.0);    // создание экземпляра класса Circle
        System.out.println("Параметры круга:");     // вывод данных о круге
        System.out.print("Радиус -- ");
        System.out.println(circle.getRadius());
        System.out.print("Площадь -- ");
        System.out.println(circle.getSquare());
        System.out.print("Периметр -- ");
        System.out.println(circle.getPerimeter());

        System.out.println();   // для красоты

        Rectangle rectangle = new Rectangle(5.0, 3.0);  // создание экземпляра класса Rectangle
        System.out.println("Параметры прямоугольника:");    // вывод данных о прямоугольнике
        System.out.print("Длина -- ");
        System.out.println(rectangle.getA());
        System.out.print("Щирина -- ");
        System.out.println(rectangle.getB());
        System.out.print("Площадь -- ");
        System.out.println(rectangle.getSquare());
        System.out.print("Периметр -- ");
        System.out.println(rectangle.getPerimeter());

        System.out.println();   // для красоты

        Triangle triangle = new Triangle(3.0, 4.0, 5.0);    // создание экземпляра класса Triangle
        System.out.print("Параметры треугольника:");    // вывод данных о треугольнике
        System.out.print("Сторона а -- ");
        System.out.println(triangle.getA());
        System.out.print("Сторона b -- ");
        System.out.println(triangle.getB());
        System.out.print("Сторона c -- ");
        System.out.println(triangle.getC());
        System.out.print("Площадь -- ");
        System.out.println(triangle.getSquare());
        System.out.print("Периметр -- ");
        System.out.println(triangle.getPerimeter());
    }
}