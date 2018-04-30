
public class Total {
    private int x,y;
    private int total;
    private double average;

    public Total() {
    }

    public Total(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getTotal() {
        return total;
    }

    public double getAverage() {
        return average;
    }

    public int findTotal(){
        total = x + y;
        return total;
    }
    public double findAverage(){
        total = x + y;
        average = (double) total/2;
        return average;
    }

}
