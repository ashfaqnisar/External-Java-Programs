import java.util.*;

public class Tokenizer {
    public static void main(String[] args){
        StringTokenizer St= new StringTokenizer("Mohammed Ashfaq Nisar here!!!");

        while (St.hasMoreTokens()){
            System.out.println("The Next token is " + St.nextToken());
        }
        System.out.println("The count of tokens is" + St.countTokens());

    }
}
