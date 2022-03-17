import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int primo, count =0;
        System.out.println("Digite um numero inteiro maior que 0");
        primo = scn.nextInt();

        for(int i = 1; i <= primo;i++){
            if(primo % i == 0){
                count ++;
            }
        }

        if(count == 2)
            System.out.println("É primo!");
        else
            System.out.println("Ele não é primo");

        scn.close();
    }
}
