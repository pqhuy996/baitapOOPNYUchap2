public class bai26 {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        System.out.println("Điểm 1: " + point1);
        MyPoint point2 = new MyPoint(3, 4);
        System.out.println("Điểm 2: " + point2); // Sử dụng toString để in ra (3, 4)
        System.out.println("Khoảng cách từ điểm 2 đến (0, 0): " + point2.distance());
        System.out.println("Khoảng cách từ điểm 1 đến điểm 2: " + point1.distance(point2));
        point1.setXY(7, 1);
        System.out.println("Điểm 1 sau khi cập nhật: " + point1);
        System.out.println("Khoảng cách từ điểm 1 đến (3, 4): " + point1.distance(3, 4));
    }
}
