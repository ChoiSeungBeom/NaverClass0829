package Java;
import java.util.Scanner;
public class gugudan {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("값을 입력하세요: 2~9 : ");
        int dan = sc.nextInt();
        if(dan >=2 || dan<=9){
            for(int i=1;i<=9;i++){
                int j=i+1;

                int mul = dan*i;
                System.out.println(j+"x" + i + "=" + mul);
            }
            
        }
         
    }
}
