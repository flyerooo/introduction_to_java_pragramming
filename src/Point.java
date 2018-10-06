public class Point {
    public int x = 0;
    public int y = 0;

    public Point(int x, int y){
        x = x;
        y = y;
    }

    public static void main(String[] args) {
        Point A = new Point(1,2);
        System.out.println(A.x + " " + A.y);
    }
}
