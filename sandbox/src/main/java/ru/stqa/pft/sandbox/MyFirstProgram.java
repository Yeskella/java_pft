package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " равна " + s.area());

    Rectangle r = new Rectangle(4,6);
    System.out.println("Площадь прямоугольника с сторонами " + r.a + " и " + r.b + " равна " + r.area());

    Point p1 = new Point(1 , 1);
    Point p2 = new Point(4 , 5);

    System.out.println("Расстояние между двумя точками p1 (" + p1.x + " ; " + p1.y + ") и p2 (" + p2.x + " ; " + p2.y + ") равно " + p1.distance(p2));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

}