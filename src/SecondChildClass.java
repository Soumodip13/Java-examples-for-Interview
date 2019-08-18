public class SecondChildClass extends ChildClass{
    int c=a;

    void show(){
        super.show();
    }
    void print(){
        System.out.println(c);
        System.out.println(super.a);

    }
}
