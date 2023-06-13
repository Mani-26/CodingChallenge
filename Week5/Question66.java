import java.util.*;
public class Question66{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
        String c[] = b.split(" ");
        int count = 0;
        for(int i=0;i<c.length;i++){
            if(!a.contains(c[i])){
            	System.out.print(c[i]+" ");
            }
            else{
                count++;
            }
        }
        if(count==c.length){
            System.out.print("none");
        }
    }
}