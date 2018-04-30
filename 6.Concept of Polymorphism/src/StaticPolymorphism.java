public class StaticPolymorphism {

    public int  add(int x,int y){
        System.out.println(x+y);
        return x+y;
    }
    public int  add(int x,int y,int z){
        System.out.println(x + y + z);
        return x+y+z;
    }
    public int  add(double x,int y){
        System.out.println((int)x+y);
        return (int)x+y;
    }
    public int  add(int x,double y){
        System.out.println(x+(int)y);
        return x+(int)y;
    }
}
