package org.example;

public class Robot {
//    Instance variables (Has a)
    public String name;
    public String weaponName;
    public int weaponPower;

//    Constructor
    public Robot() {
        this.name = "Jimmy";
        this.weaponName = "Sword";
        this.weaponPower = 50;
    }

//Methods (can do)
public void Attack(){
    System.out.println(this.name + " attacks with their " + this.weaponName + " for " + this.weaponPower + " damage!");
}}