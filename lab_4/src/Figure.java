/**
 Класс Figure, точнее интерфейс, является базовым классом для других классов
 фигур, и в нем объявляются, но не описываются методы, реализация которых
 опишется в дочерних классах.
 author Старченко Кирилл
 */

public interface Figure     // объявление класса и его родителя
{
    double getSquare();     // метод расчета площади

    double getPerimeter();  // метод расчета периметра
}