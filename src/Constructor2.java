public class Constructor2 {
    private int a;
    void getter(int a){
        this.a=a;

    }
    int setter(){
        return a;
    }
    public static void main(String[] args) {
        Constructor2 ob=new Constructor2();
        ob.getter(2);
        int c=ob.setter();
        System.out.println(c);

    }
}
