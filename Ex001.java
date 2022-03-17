/**
 * Ex001
 */
public class Ex001 {

    public static void main(String[] args) {
        int i =0;
        for(int count =0; count <=100;count++){
            System.out.printf(count + " ");
        }

        while(i <=100){
            System.out.printf(i + " ");
            i++;
        }
        System.out.println();
        i =0;
        do{
            System.out.printf(i + " ");
            i++;
        }while(i <=100);
        
    }
}