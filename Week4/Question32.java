import java.util.*;
public class Question32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        sc.close();
        int i=0,count1=0,count2=0;
        try{
        for (char s : ch) {
            if(s==')'&&i==0){
                System.out.println(false);
                throw new RuntimeException();
            }
            if (s=='(')
                count1++;
            else
                count2++;
            i++;
        }
        if(count1==count2)
            System.out.println(true);
        else    
            System.out.println(false);
    }
    catch (Exception e) {}
    }
}
