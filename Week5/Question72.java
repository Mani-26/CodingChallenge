import java.util.Scanner;
public class Question72{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sc.close();
        int floor = 0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='(')
                floor++;
            else
                floor--;
            }
        System.out.print(floor);
    }
}