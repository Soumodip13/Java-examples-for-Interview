import java.math.*;
public class sqrt {
    public static void main(String[] args) {
        float a=0.0f;
        int b=64;
        while(a*a<b){
            a+=0.01;
        }
        System.out.println(Math.round(a));


    }
}
