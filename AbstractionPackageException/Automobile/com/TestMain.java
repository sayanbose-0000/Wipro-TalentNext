package com;

import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class TestMain {
  public static void main(String[] args) {
    Hero hero = new Hero();
    System.out.println(hero.getModelName());
    System.out.println(hero.getRegistrationNumber());
    System.out.println(hero.getOwnerName());
    System.out.println(hero.getSpeed());  
    hero.radio();

    Honda honda = new Honda();
    System.out.println(honda.getModelName());
    System.out.println(honda.getRegistrationNumber());
    System.out.println(honda.getOwnerName());
    System.out.println(honda.getSpeed());
    honda.cdplayer();
  }
}
