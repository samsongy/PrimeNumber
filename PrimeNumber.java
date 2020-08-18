/**
 * PrimeNumber
 * 
 * Method to print first 100 prime numbers
 */
public class PrimeNumber {

    public static void main(String[] args) {
        int count = 0;
        int num = 1;

        while(count < 100) {
            boolean primeNumber = true;
            for(int i=1; i<num; i++) {
                if(num % i == 0 && i != 1) {
                    primeNumber = false;
                }
            }

            if(primeNumber==true && num != 1){
                System.out.println(num);
                count++;
            }

            num++;
        }
        
    }
}