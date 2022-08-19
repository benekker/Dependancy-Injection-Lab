package org.example;

public class Robot implements Attacker{
//    Instance variables (Has a)
    public String name;
    public Weapon weapon;

//    Constructor
    public Robot(Weapon weapon) {
        this.name = "Jimmy";
        this.weapon = weapon;

    }

//Methods (can do)
public void Attack(){
    System.out.println(this.name + " attacks with their " + this.weapon.name + " for " + this.weapon.power + " damage!");
}}