package me.day09.practice.practice05;

import java.util.Objects;

public class Circle extends Shape implements GeometricController {
    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(Point centerPoint, int radius) {
        super(centerPoint);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(Circle.class.getName() + " draw()");
    }

    @Override
    public double calculateArea() {
        return radius * radius * 3.14;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", centerPoint=" + centerPoint +
                '}';
    }

    @Override
    public void translate(int dx, int dy) {
        int x = centerPoint.getX();
        int y = centerPoint.getY();

        setCenterPoint(new Point(x + dx, y + dy));
    }

    @Override
    public void scale(int offset) {

        int r = getRadius();

        setRadius(r*offset);

    }
}
