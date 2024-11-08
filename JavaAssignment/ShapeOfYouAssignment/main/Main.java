package main;

import shapes.*;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(20, 10);
        double area = rect.calArea();
        System.out.println("Area of Rectangle: " + area);
    }
}
