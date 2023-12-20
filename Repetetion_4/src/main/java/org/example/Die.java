package org.example;

import java.util.Random;

public class Die {

    int sides;
    Random random;

    Die(int sides){
        this.sides = sides;
        random = new Random();
    }

    public int roll(){

        return random.nextInt(sides) + 1;
        //returnere, et tilfældig tal 1-6
    }

}
