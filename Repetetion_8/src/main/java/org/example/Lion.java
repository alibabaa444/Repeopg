package org.example;

class Lion extends Animal {
    public Lion() {
        this.isMammal = true;
    }

    @Override
    public void makeSound() {
        System.out.println("AAAAAAAARGH");
    }
}