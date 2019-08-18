public class ObjEquality1 {
    int a,b;
    ObjEquality1(int a,int b){
        this.a=a;
        this.b=b;

    }
    public static void main(String[] args) {
        ObjEquality1 ob=new ObjEquality1(2,3);
        ObjEquality1 obj;
        obj=ob;
        obj.a=5;
        System.out.println(ob.a);
        System.out.println(ob.b);
        System.out.println(obj.a);
        System.out.println(obj.b);

    }
}
