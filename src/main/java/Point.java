public class Point {

    private int x=5;
    private int y=5;
    private boolean selected=false;

    public Point(int x, int y, boolean selected) {
        this.x = x;
        this.y = y;
        this.selected=selected;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(){}

    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public boolean GetSelected(){
        return this.selected;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
}
