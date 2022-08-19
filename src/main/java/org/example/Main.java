package org.example;

public class Main {
    public static void main(String[] args) {

        Weapon energysword = new Energysword();
        Attacker robot_one = new Robot(energysword);

        robot_one.Attack();

        Attacker dino_one = new Dinosaur("Arrrgh", 60);

        dino_one.Attack();
    }
}