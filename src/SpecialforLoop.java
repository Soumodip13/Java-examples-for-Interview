public class SpecialforLoop {
    public static void main(String[] args) {
        int sum=0;
        int a[]=new int[5];


        for(int i:a){
            a[i]=i+1;
            sum=sum+a[i];

        }
        System.out.println(sum);
    }
}
