public class Rectangle {
    private int x, y;
    private int width, height;
    private Point origin;

    public Rectangle() {
        this(0, 0, 1, 1);
    }

    public Rectangle(int width, int height) {
        this(0, 0, width, height);
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point p, int w, int h){
        origin = new Point(0,0);
        width = w;

    }
}
