import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int fat,i;
        System.out.println("Digite um numero:");
        fat = scn.nextInt();
        System.out.println("\n\n");
        i = fat;
        if(fat == 0)
            fat = 1;
        else if(fat == 1)
            fat =1;
        else{
            while(fat > 1){
                System.out.println(fat);
                i = i *(fat - 1);
                fat--;
            }
        }
        System.out.println("O resultado é" + i);
        scn.close();
        
    }
}
