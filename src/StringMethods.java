public class StringMethods {
    String a;
    StringMethods(String s){
        this.a=s;
        System.out.println(a.trim());
        System.out.println(a.substring(1,3));
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.replace('s','a'));
        System.out.println(a.length());
        System.out.println(a.charAt(3));
        System.out.println(a.chars());
        System.out.println(a.codePoints());
        System.out.println(a.concat("Chakraborty"));
        System.out.println(a.compareTo("sagar"));
        System.out.println(a.split("Sou",3));

    }
    public static void main(String[] args) {
        StringMethods obj=new StringMethods("Soumodip");

    }
}
