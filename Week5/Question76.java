import java.util.*;
public class Question76 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        switch(a){
            case"Scissors":{
                System.out.println("Stone");
                break;
            }
            case "Stone":{
                System.out.println("Hand");
                break;
            }
            case "Hand":{
                System.out.println("Scissors");
                break;
            }
            default:{
                System.out.println("Error");
            }
        }
    }    
}