package com.company;

/**
 * Created by liang on 2017/6/20.
 */
public class Human extends Animal {
    private  String country;
    public Human(String name, int age,String country) {
        super(name, age);
        this.country=country;
    }

    @Override
    public void say() {
        super.say();
        System.out.print(country+"Human from");
    }
}

