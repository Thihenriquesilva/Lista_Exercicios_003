public class Ex002 {
    public static void main(String[] args) {
        int i =100;
        for(int count =100; count>= 0;count--){
            System.out.printf(count + " ");
        }
        System.out.println("\n\n");
        while(i >=0){
            System.out.printf(i + " ");
            i--;
        }
        System.out.println("\n\n");
        i = 100;
        do{
            System.out.printf(i + " ");
            i--;
        }while(i >=0);
    }
}
