package com.microservices.limitsservice.bean;

public class Limits {

  private int minitum;
  private int maximum;

  public Limits() {
  }

  public Limits(int minitum, int maximum) {
    this.minitum = minitum;
    this.maximum = maximum;
  }

  public int getMinitum() {
    return minitum;
  }

  public void setMinitum(int minitum) {
    this.minitum = minitum;
  }

  public int getMaximum() {
    return maximum;
  }

  public void setMaximum(int maximum) {
    this.maximum = maximum;
  }
}
