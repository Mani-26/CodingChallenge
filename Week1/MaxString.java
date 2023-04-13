import java.util.*;
public class MaxString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();
        int max=0;
        List<String> list1 = new ArrayList<>();
        if(inp.equals("-1"))
            System.out.println("No string given");
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
            for(int i=0;i<list1.size();i++){
                String str=list1.get(i);
                int len=str.length();
                if(max<len){
                    max=len;
                }
            }
            for (int i = 0; i < list1.size(); i++) {
                String str=list1.get(i);
                int len=str.length();
                if (max==len) {
                    System.out.print(str+" ");
                }
            }
        }
    }
}