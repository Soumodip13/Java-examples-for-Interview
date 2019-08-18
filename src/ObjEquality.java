public class ObjEquality {
    int a,b;
    ObjEquality(int a,int b){
        this.a=a;
        this.b=b;
    }
    boolean equals(ObjEquality a,ObjEquality b){
        if(a.a==b.a && a.b==b.b){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        ObjEquality ob=new ObjEquality(2,3);
        ObjEquality obj;
        obj=ob;
        boolean b=ob.equals(ob,obj);
        if(b=true){
            System.out.println("True");
        }else System.out.println("False");
    }
}
