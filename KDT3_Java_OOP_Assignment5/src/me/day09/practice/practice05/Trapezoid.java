package me.day09.practice.practice05;

import java.util.Arrays;

public class Trapezoid extends Shape {
    private Line[] lines; // 윗변, 아랫변, 왼쪽변, 오른쪽변 들어온다고 가정

    public Trapezoid() {
    }

    public Trapezoid(Point centerPoint) {
        super(centerPoint);
    }

    public Trapezoid(Line[] lines) {
        this.lines = lines;
    }

    public Trapezoid(Point centerPoint, Line[] lines) {
        super(centerPoint);
        this.lines = lines;
    }

    public Line[] getLines() {
        return lines;
    }

    public void setLines(Line[] lines) {
        this.lines = lines;
    }

    //사다리꼴의 밑변의 양 끝점은 x축 위에 있는 점만 받는다고 했으므로, 윗변의 한 점과 밑변의 한 점의 y값 차이가 높이가 된다.
    public int getHeight(){
        Line u = lines[0];
        Line b = lines[1];

        return u.getStart().getY() - b.getStart().getY();
    }

    // draw() 함수 무조건 재정의!
    @Override
    public void draw() {
        System.out.println(Trapezoid.class.getName() + " draw()");
    }

    @Override
    public double calculateArea() {
        Line u = lines[0];
        Line b = lines[1];

        int upper;
        int down;
        int height;

        upper = u.getEnd().getX() - u.getStart().getX();
        down = b.getEnd().getX() - b.getStart().getX();
        height = getHeight();

        return (upper + down) * height * 0.5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Trapezoid trapezoid = (Trapezoid) o;
        return Arrays.equals(lines, trapezoid.lines);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(lines);
        return result;
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "lines=" + Arrays.toString(lines) +
                ", centerPoint=" + centerPoint +
                '}';
    }


}

