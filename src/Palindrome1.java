public class Palindrome1 {
    public static void main(String[] args) {
        String s="soumodip",c="";
        for(int i=s.length()-1;i>=0;i--){
            c=c+s.charAt(i);
        }
        System.out.println(c);
        if(s.equals(c)){
            System.out.println("Palindrome");
        }
    }
}
