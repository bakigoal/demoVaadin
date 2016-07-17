package com.bakigoal.vaadin.mvp.model;

/**
 * Created by ilmir on 16.07.16.
 */
/** The model **/
public class CalculatorModel {
  private double value = 0.0;
  public void clear() {
    value = 0.0;
  }
  public void add(double arg) {
    value += arg;
  }
  public void multiply(double arg) {
    value *= arg;
  }
  public void divide(double arg) {
    if (arg != 0.0)
      value /= arg;
  }
  public double getValue() {
    return value;
  }
  public void setValue(double value) {
    this.value = value;
  }
}