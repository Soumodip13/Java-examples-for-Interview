public class PalindromeNumber {
    public static void main(String[] args) {
        int num=13431,temp,rev_num=0;
        int temp_num=num;
        while(num>0){
            temp=num%10;
            num=num/10;
            rev_num=rev_num*10+temp;
        }
        System.out.println(rev_num);
        if(temp_num==rev_num)
            System.out.println("Palindrome");

    }
}
