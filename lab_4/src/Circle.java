/**
 Класс Circle наследуется от класса Figure и реализует его методы под свои нужды.
 author Старченко Кирилл
 */

public class Circle implements Figure   // объявление класса и его родителя
{
    private double radius;      // поля класса

    public Circle(double radius) {      // конструктор класса
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override       // для новой реализации метода класса-родителя, или просто переопределяем
    public double getSquare(){      // метод расчета площади круга
        return Math.PI * Math.pow(this.radius, 2.0);
    }
    @Override
    public double getPerimeter(){       // метод расчета периметра круга
        return 2 * Math.PI * radius;
    }
}
