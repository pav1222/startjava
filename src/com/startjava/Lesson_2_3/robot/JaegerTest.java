package com.startjava.Lesson_2_3.robot.Jaeger;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger();
        gipsyDanger.setMark("Mark-3");
        gipsyDanger.setSpeed(7);
        gipsyDanger.setWeight(44.728f);
        
        System.out.println(gipsyDanger.scanKaiju());
        System.out.println(gipsyDanger.drift());

        Jaeger strikerEureka = new Jaeger("Mark-5", 41.792f, 10);
        System.out.println(strikerEureka.scanKaiju());
        System.out.println(gipsyDanger.drift());

        System.out.println(strikerEureka);
        System.out.println(gipsyDanger);
    }
}
