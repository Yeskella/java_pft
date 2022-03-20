package ru.stqa.pft.sandbox;

public class EquationBuilder {
  private double a;
  private double b;
  private double c;

  public EquationBuilder setA(double a) {
    this.a = a;
    return this;
  }

  public EquationBuilder setB(double b) {
    this.b = b;
    return this;
  }

  public EquationBuilder setC(double c) {
    this.c = c;
    return this;
  }

  public Equation createEquation() {
    return new Equation(a, b, c);
  }
}