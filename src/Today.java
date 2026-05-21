import java.util.Scanner;

public class Today {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =n;i>=1;i--){
            char a ='A';
            for(int j =1;j<=i;j++){
                System.out.print(a++ + " ");
            }

            System.out.println();



        }




    }

}