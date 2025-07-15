package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {
  public int getSpeed() {
    return 65;
  }

  public void cdplayer() {
    System.out.println("CD player running");
  }

  @Override
  public String getModelName() {
    return "M1423A";
  }

  @Override
  public String getOwnerName() {
    return "Ankit Burman";
  }

  @Override
  public String getRegistrationNumber() {
    return "89784864894";
  }
}
