public class ChildClass extends MainClass{
    /*void show(){
        System.out.println("Hey Child");

    }*/

    void show(){
        super.show();
    }
    void set(int a){
        this.a=a;
        System.out.println(a);
    }


}
