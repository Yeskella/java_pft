package ru.stqa.pft.sandbox;

public class Point {

  public double x;
  public double y;

  public Point(double cordx, double cordy){
    this.x = cordx;
    this.y = cordy;
  }

  public double distance(Point p){
    return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
  }
}