import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
          Scanner sc= new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=0;
        if (a<b){
               c = b-a ;
            System.out.println(c);
        } else if (a>=b) {
               c = a-b;
            System.out.println(c);
        }
        }
    }