public class Main {
    public static void printFactors (int number){
        int count = 1;
        if (number < 1){
            System.out.println("Invalid value");
        }else {
            while (count <= number) {
                if (number % count == 0){
                    System.out.print(count + " ");
                }
                count++;
            }
        }
        System.out.println( );
    }

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }
}