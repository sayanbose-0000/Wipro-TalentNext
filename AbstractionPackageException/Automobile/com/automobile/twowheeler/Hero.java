package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {
  public int getSpeed() {
    return 56;
  }

  public void radio() {
    System.out.println("Radio running");
  }

  @Override
  public String getModelName() {
    return "MA789B";
  }

  @Override
  public String getOwnerName() {
    return "Aman Singh";
  }

  @Override
  public String getRegistrationNumber() {
    return "584681814846";
  }
}
