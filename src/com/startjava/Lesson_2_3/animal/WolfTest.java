package com.startjava.Lesson_2_3.animal.Wolf;

class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setSex("male");
        wolf.setName("Trump");
        wolf.setWeight(50);
        wolf.setAge(9);
        wolf.setColor("white");

        System.out.println(wolf.getSex());
        System.out.println(wolf.getName());
        System.out.println(wolf.getWeight());
        System.out.println(wolf.getAge());
        System.out.println(wolf.getColor());
        System.out.println();

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
