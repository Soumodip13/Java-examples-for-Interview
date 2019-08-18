public class BoxArea {
    float h,l;
    BoxArea(){

    }
    BoxArea(float a,float b){
        this.h=a;
        this.l=b;

    }
    BoxArea(float l){
        this.l=l;
        this.h=l;
    }
    float Area(){
        System.out.println(l*h);
        return 0;
    }
    public static void main(String[] args) {

        BoxArea ob=new BoxArea(2.3f,5.6f);
        BoxArea obj=new BoxArea(9.9f);
        ob.Area();
        obj.Area();
        BoxVolume obb=new BoxVolume();
        obb.getVolume(2.3f);
    }
}
