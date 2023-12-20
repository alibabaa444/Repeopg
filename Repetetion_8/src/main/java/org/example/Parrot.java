package org.example;

class Parrot extends Animal {
    public Parrot() {
        this.isMammal = false;
    }

    @Override
    public void makeSound() {
        System.out.println("Hello, verden");
    }
}