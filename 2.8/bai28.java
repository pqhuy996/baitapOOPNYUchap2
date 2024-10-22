public class bai28 {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle();
        System.out.println("circle1: " + circle1);
        MyCircle circle2 = new MyCircle(5, 5, 3);
        System.out.println("circle2: " + circle2);
        MyPoint point = new MyPoint(2, 3);
        MyCircle circle3 = new MyCircle(point, 4);
        System.out.println("circle3: " + circle3);
        System.out.println("Tọa độ tâm của circle2: (" + circle2.getCenterX() + ", " + circle2.getCenterY() + ")");
        circle2.setCenterX(7);
        circle2.setCenterY(8);
        System.out.println("Tọa độ tâm mới của circle2: (" + circle2.getCenterX() + ", " + circle2.getCenterY() + ")");
        System.out.println("\nDiện tích của circle2: " + circle2.getArea());
        System.out.println("Chu vi của circle2: " + circle2.getCircumference());
        System.out.println("\nKhoảng cách giữa circle2 và circle3: " + circle2.distance(circle3));
        System.out.println("\nThông tin circle2: " + circle2.toString());
        System.out.println("Thông tin circle3: " + circle3.toString());
    }
}
