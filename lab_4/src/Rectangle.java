/**
 Класс Rectangle наследуется от класса Figure и реализует его методы под свои нужды.
 author Старченко Кирилл
 */

public class Rectangle implements Figure    // объявление класса и его родителя
{
    private double a, b;    // поля класса

    public Rectangle(double a, double b) {      // конструктор класса
        this.a = a;
        this.b = b;
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
    @Override
    public double getSquare(){      // метод расчета площади прямоугольника
        return a * b;
    }
    @Override
    public double getPerimeter(){       // метод расчета периметра прямоугольника
        return 2 * (a + b);
    }
}
