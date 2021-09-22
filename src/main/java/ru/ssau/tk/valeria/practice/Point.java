package ru.ssau.tk.valeria.practice;

public class Point {
    public final double x;
    public final double y;
    public final double z;

    public double length(){
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}