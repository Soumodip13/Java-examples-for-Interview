public class Constructor1 {
    int a,b,c;
    Constructor1(){
        System.out.println("Hey");
    }
    Constructor1(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;

    }
    void Show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a*b*c);
    }
    public static void main(String[] args) {
        Constructor1 obj=new Constructor1(1,2,3);
        obj.Show();

    }
}
