public class bai27 {
    public static void main(String[] args){
        MyLine line1 = new MyLine(0, 0, 3, 4);
        MyLine line2 = new MyLine(new MyPoint(1, 1), new MyPoint(4, 5));
        System.out.println("line1: " + line1);
        System.out.println("line2: " + line2);
        System.out.println("line1 begin: " + line1.getBegin());
        System.out.println("line1 end: " + line1.getEnd());
        line1.setBegin(new MyPoint(2, 2));
        line1.setEnd(new MyPoint(5, 6));
        System.out.println("line1 after setBegin() and setEnd(): " + line1);
        System.out.println("line1 beginX: " + line1.getBeginX());
        System.out.println("line1 beginY: " + line1.getBeginY());
        System.out.println("line1 endX: " + line1.getEndX());
        System.out.println("line1 endY: " + line1.getEndY());
        line1.setBeginX(0);
        line1.setBeginY(0);
        line1.setEndX(3);
        line1.setEndY(4);
        System.out.println("line1 after setBeginX(), setBeginY(), setEndX(), setEndY(): " + line1);
        int[] beginXY = line1.getBeginXY();
        int[] endXY = line1.getEndXY();
        System.out.println("line1 beginXY: [" + beginXY[0] + ", " + beginXY[1] + "]");
        System.out.println("line1 endXY: [" + endXY[0] + ", " + endXY[1] + "]");
        line1.setBeginXY(1, 1);
        line1.setEndXY(4, 5);
        System.out.println("line1 after setBeginXY() and setEndXY(): " + line1);
        System.out.println("line1 length: " + line1.getLength());
        System.out.println("line1 gradient: " + line1.getGradient());
        System.out.println(line1.toString());
    }
}
