package com.startjava.Lesson_2_3.robot;

public class Jaeger {
    private String mark;
    private float weight;
    private int speed;

    public Jaeger() {
    }

    public Jaeger(String mark, float weight, int speed) {
        this.mark = mark;
        this.weight = weight;
        this.speed = speed;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public String scanKaiju() {
        return "nothing";
    }

    public String toString() {
        return "Jaeger{" +
                "mark='" + mark + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }
}