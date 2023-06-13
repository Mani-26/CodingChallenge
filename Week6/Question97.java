import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a[]=new double[n];
        double b[]=new double[n];
        double d[]=new double[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextDouble();
            b[i]=sc.nextDouble();
        }  
         for(int i=0;i<n;i++){
            d[i]=Math.sqrt((a[i]*a[i])+(b[i]*b[i]));
        }double min=d[0];
        double x=a[0];double y=b[0];
        for(int i=0;i<n;i++){
          if(d[i]<min){
             x=a[i];y=b[i]; 
          }  
        }System.out.print((int)x+" "+(int)y);
        
    }
}