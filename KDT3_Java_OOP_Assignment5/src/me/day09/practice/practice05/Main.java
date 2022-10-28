package me.day09.practice.practice05;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(3), new Rectangle(3, 5), new Triangle(5, 3) };

        for (int i = 0; i < shapes.length; i++) {
            Point point = new Point((int)(Math.random()*10) + 1, (int)(Math.random()*10) + 1);
            shapes[i].setCenterPoint(point);
        }

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getClass().getName() + " = " + calculateArea(shapes[i]));
        }

        Circle circle = new Circle(new Point(3, 5), 2);
        System.out.println(circle);

        circle.translate(3, 5);
        System.out.println(circle); // 중점이 이동 (translate)된 도형 반환

        circle.scale(2);
        System.out.println(circle); // offset만큼 스케일링 (scale)된 도형 반환
    }
    // 객체지향적이지 않은 코드 🤔
    // 아래 코드를 객체 지향적인것으로 바꾸는 거는 잘 모르겠습니다...
    // 이미 다른 클래스들을 참조하고 있는데 객체 지향적이지 않은 이유가 무엇인지 궁금합니다..ㅠㅠ..
    public static double calculateArea(Shape shape) {
        final double PI = 3.14;
        if (shape instanceof Circle) {
            return ((Circle) shape).getRadius() * ((Circle) shape).getRadius() * PI;
        } else if (shape instanceof Rectangle) {
            return ((Rectangle) shape).getWidth() * ((Rectangle) shape).getHeight();
        } else if (shape instanceof Triangle) {
            return ((Triangle) shape).getBase() * ((Triangle) shape).getHeight() * 0.5;
        } else {
            return 0.0;
        }
    }
}
