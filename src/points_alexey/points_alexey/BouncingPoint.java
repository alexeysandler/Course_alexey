package points_alexey.points_alexey;

public class BouncingPoint extends Point {

    public BouncingPoint(int x, int y) {
        super(x,y);
    }
    public BouncingPoint(){
        super();
    }
    @Override
    public void move(){

        super.move();

        int myX = getX();
        int myY = getY();

        if(myX==width|| myX==0){
            flipDirectionX();
            }
        if (myY==height || myY==0){
                flipDirectionY();
            }
        System.out.println(super.toString());

    }
    @Override
    public void move(int nextX, int nextY) {
        int currentX=getX();
        int currentY=getY();

        moveXpoint(currentX,nextX);
        moveYpoint(currentY,nextY);



        System.out.println(super.toString());
    }

    private void moveYpoint(int currentY, int nextY) {
        for(int i=0; i < nextY; i++){
            if(currentY == height || currentY == 0){
                flipDirectionY();
            }
            currentY = currentY + directionY;
          //  System.out.println(currentY);
        }
        setY(currentY);
    }


    private void moveXpoint(int currentX,int nextX) {
        for(int i=0; i < nextX; i++){
            if(currentX == width || currentX == 0 ){
                flipDirectionX();
            }
            currentX = currentX + directionX;
           // System.out.println(currentX);
        }
        setX(currentX);
    }

    private int calculateY(int nextY) {
        return  (height - (Math.abs(height-(getY()+nextY)))- getY());
    }

    private int calculateX(int nextX) {
        return  (width - (Math.abs(width-(getX()+nextX)))-getX());
    }

}
