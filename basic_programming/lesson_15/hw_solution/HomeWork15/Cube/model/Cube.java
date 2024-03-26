package Cube.model;

public class Cube {

    private double sideCube;
    private double perimetr;
    private double square;
    private double volume;

    public Cube(double sideCube) {
        this.sideCube = sideCube;
        this.perimetr = perimetr;
        this.square = square;
        this.volume = volume;
    }

    public double getSideCube() {
        return sideCube;
    }

    public void setSideCube(double sideCube) {
        this.sideCube = sideCube;
    }

    public double getPerimetr() {
        return perimetr;
    }

    public void setPerimetr(double perimetr) {
        this.perimetr = perimetr;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "sideCube=" + sideCube +
                ", perimetr=" + perimetr +
                ", square=" + square +
                ", volume=" + volume +
                '}';
    }


    public double perimetrCube() {

        perimetr = sideCube * 12;
        return perimetr;

    }

    public double squareCube() {

        square = sideCube * sideCube * 6;
        return square;

    }
    public double volumeCube(){
        volume = square * sideCube;
        return volume;
    }


}










