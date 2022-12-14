package me.day09.practice.practice05;

import java.util.Objects;

public class Rectangle extends Shape implements GeometricController{
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point centerPoint, int width, int height) {
        super(centerPoint);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(Rectangle.class.getName() + " draw()");
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
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
        int width = getWidth();
        int height = getHeight();

        setWidth(width*offset);
        setHeight(height*offset);

    }
}
