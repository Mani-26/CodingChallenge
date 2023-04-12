import java.util.*;
public class eg
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner (System.in);
       String b=sc.nextLine();
       b=b.toUpperCase();
       
   //String c1[]= b.split(" ");
     //    System.out.print(c1);
      int l=b.length();
    for(int i=0;i<l-1;i++)
    {
       char[] c=b.toCharArray();
       if(c[i].equals(' ')){
           continue;
       }
    
       System.out.print(c+" ");
        
    }

       
    }
}