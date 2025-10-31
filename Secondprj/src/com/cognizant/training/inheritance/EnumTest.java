package com.cognizant.training.inheritance;

enum TrafficLight{
    RED,YELLOW,GREEN;
}

public class EnumTest {
public static void main(String[] args) {
    TrafficLight light1=TrafficLight.RED;
    System.out.println(light1);
    light1=TrafficLight.YELLOW;
    System.out.println(light1);
    light1=TrafficLight.GREEN;
    System.out.println(light1);
    changeColor(TrafficLight.GREEN);
    
}

static void changeColor(TrafficLight light) {
    switch (light) {
    case RED:
            System.out.println("switching on RED");
            break;
    case GREEN:
            System.out.println("switching on GREEN");
            break;
    case YELLOW:
            System.out.println("switching on YELLOW");
            break;
    }
}
}