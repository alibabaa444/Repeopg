package org.example;

public class Cup {

    Die die1 = new Die(6);
    Die die2 = new Die(6);

Cup(Die die1, Die die2) {
    this.die1 = die1;
    this.die2 = die2;
}

    public int howManyIdenticalThrows(int times){

    int countHowManyIdenticalThrows = 0;

    for (int i = 0; i < times; i++){
        if (die1.roll() == die2.roll()){
            countHowManyIdenticalThrows++;
        }
    }

    return countHowManyIdenticalThrows;
}
    public int[] results(int times){
    int[] rolls = new int [times];

    for (int i = 0; i < times; i++) {
        rolls [i] = die1.roll() + die2.roll();
    }
    return rolls;

    }


}
