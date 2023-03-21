/**
 Класс Triangle наследуется от класса Figure и реализует его методы под свои нужды.
 author Старченко Кирилл
 */

public class Triangle implements Figure     // объявление класса и его родителя
{
    private double a, b, c;     // поля класса

    public Triangle(double a, double b, double c) {     // конструктор класса
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    @Override
    public double getSquare(){      // метод расчета площади треугольника
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    @Override
    public double getPerimeter(){   // метод расчета периметра треугольника
        return a + b + c;
    }
}
