public class palindrome {
    String s,c="";
    palindrome(String a){
        this.s=a;
    }
    String reverse(String s){

        for(int i=s.length();i<=0;i++){
            c.concat(s.substring(i));
        }
       return c;
    }
    boolean equal(){
        if (s.equals(c))
            return true;
        else return false;

    }
    public static void main(String[] args) {
        palindrome ob=new palindrome("WOW");
        boolean b=ob.equal();
        if(b==true){
            System.out.println("Palindrome");
        }else
            System.out.println("Not Palindrome");

    }
}
