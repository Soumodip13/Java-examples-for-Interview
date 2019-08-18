public class Inheritance1 {
    int a;
    int setter(int a){
        this.a=a;
        return this.a;
    }
    void getter(){
        System.out.println(this.a);
    }
    public static void main(String[] args) {
        extension obj=new extension();
        Inheritance1 obb=new Inheritance1();
        obj.setter(5);
        System.out.println(obj.a);
        obb.getter();

    }
}
