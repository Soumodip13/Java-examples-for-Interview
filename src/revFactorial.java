public class revFactorial {
    long fact(int n){
        long factorial=1;
        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        revFactorial ob=new revFactorial();
        int a=120;
        System.out.println(ob.fact(6));
        for(int i=1;i<=100;i++){
            if(ob.fact(i)==a)
                System.out.println("Factorial of "+i);
        }

    }
}
