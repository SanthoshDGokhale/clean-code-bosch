/*
 * Copyright (c) ETAS GmbH 2024. All rights reserved.
 */
package test;


/**
 *
 */
public class TestStringArray {

  public static void main(final String[] args) {
    String[] names = { "Bosch", "Robert", "Bengaluru", "Rubic" };

    for (String name : names) {
      if (name.startsWith("B")) {
        System.out.println(name);
      }
    }


  }

}
