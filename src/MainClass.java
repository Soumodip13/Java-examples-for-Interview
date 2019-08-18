public class MainClass {
    public int a;
    void show(){
        System.out.println("Hey Parent");
    }
    public static void main(String[] args) {
        SecondChildClass obb=new SecondChildClass();
        ChildClass ob=new ChildClass();
        MainClass obj=new MainClass();
        obb.show();
        ob.show();
        obj.show();
        ob.set(5);
        obb.print();



    }
}
