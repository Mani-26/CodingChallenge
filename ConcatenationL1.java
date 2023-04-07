import java.util.*;
public class ConcatenationL1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();
        List<String> list1 = new ArrayList<>();
        if(inp.equals("-1"))
            System.out.println("Invalid Input");
        else{
            list1.add(inp);
            while (true) {
                inp=sc.nextLine();
                if (inp.equals("-1")) {
                    break;
                }
                else{
                    list1.add(inp);
                }
            }
            sc.close();
        }
        if(list1.size()>2){
            for(int i=0;i<2;i++){
                System.out.print(list1.get(i));
            }
        }
        else
            System.out.print("Invalid Input");
    }
}