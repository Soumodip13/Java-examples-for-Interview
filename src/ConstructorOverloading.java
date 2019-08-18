public class ConstructorOverloading {
    ConstructorOverloading(int a){
        System.out.println("Int");

    }
    ConstructorOverloading(float b){
        System.out.println("Float");

    }
    ConstructorOverloading(boolean c){
        System.out.println("Boolean");

    }
    public static void main(String[] args) {
        ConstructorOverloading ob=new ConstructorOverloading(2);
        ConstructorOverloading obj=new ConstructorOverloading(true);
        ConstructorOverloading objj=new ConstructorOverloading((float) 2.0);

    }
}
