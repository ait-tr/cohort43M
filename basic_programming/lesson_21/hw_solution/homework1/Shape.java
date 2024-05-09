package homework.homework1;


import java.util.Random;

abstract class Shape {
    abstract double getArea();

    abstract double getPerimeter();

    abstract void printInfo();

    Random random = new Random();
}
