package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Die die1 = new Die(6);
        Die die2 = new Die(6);

        Cup cup = new Cup(die1, die2);

        System.out.println("Rolling die 1: " + die1.roll());
        System.out.println("Rolling die 2: " + die2.roll());

        int timesToRoll = 33;
        int identicalThrows = cup.howManyIdenticalThrows(timesToRoll);
        System.out.println("Identical throws in " + timesToRoll + "rolls: " + identicalThrows);

        int[] rolls = cup.results(timesToRoll);
        System.out.println("Results of rolling the die " + timesToRoll + " Times: " + Arrays.toString(rolls));

    }
}