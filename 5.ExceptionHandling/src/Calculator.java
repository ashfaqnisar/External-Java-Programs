public class Calculator {
    private int x,y;
    private double result;

    public void division(int x, int y){
        try {
            result  = x / y;
            System.out.println("Result = " + result);
        }catch (ArithmeticException e){
            System.out.println("Error : Cannot Be Divided By Zero");
        }
    }
}
