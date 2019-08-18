public class ObjAsParam {
    int len,facto=1;
    ObjAsParam(String s){
        this.len=s.length();

    }
    int Fact(int a){
        for(int i=1;i<=a;i++){
            facto=facto*i;
        }
        return facto;
    }
    int show(ObjAsParam a){
        int x=a.len;
        System.out.println(Fact(x));
        return 0;
    }
    public static void main(String[] args) {
        ObjAsParam ob=new ObjAsParam("Ant");
        ob.show(ob);

    }
}
