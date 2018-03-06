package points_alexey.points_alexey;

import java.net.PortUnreachableException;

public abstract class Point {

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getDirectionX() {
        return directionX;
    }

    public int getDirectionY() {
        return directionY;
    }

    private int x;
    private int y;
    protected int directionX=1;
    protected int directionY=1;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }



    public static int width;
    public static int height;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }



    public static void setWidth(int width) {
        Point.width = width;
    }

    public static void setHeight(int height) {
        Point.height = height;
    }



    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public  void move(){
        this.x = this.x + directionX;
        this.y = this.y + directionY;
    }

    public void flipDirectionY(){
        directionY = directionY - 2 * directionY;
    }

    public void flipDirectionX(){
        directionX = directionX - 2 * directionX;
    }

    public  void move(int x,int y){
        this.x = this.x + x ;
        this.y = this.y + y ;
    }

}
