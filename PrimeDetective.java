import java.util.*;


public class PrimeDetective {
    public boolean isPrime(int number) {
        if (number == 2) {
            System.out.println(number + " it is prime!");
            return true;
        } else if (number < 2) {
            System.out.println(number + " it is not prime!");
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(number + " it is not prime!");
                return false;
            }
        }
        System.out.println(number + " it is prime!");
        return true;

    }

    public ArrayList<Integer> onlyPrime(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                primes.add(numbers[i]);
            }
        }
        System.out.println("Primes numbers are :");
        for (int i = 0; i < primes.size(); i++)
            System.out.println(primes.get(i));
        return primes;
    }

    /* This method returns an ArrayList of even numbers if the flag = true.
       This method will return an ArrayList of odd numbers if the flag = false.
     */
    public ArrayList<Integer> oddOrEven(int[] numbers, boolean flag) {
        ArrayList<Integer> evenNum = new ArrayList<Integer>();
        ArrayList<Integer> oddNum = new ArrayList<Integer>();

        if (flag == true) {
            System.out.println("Even numbers are ");

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    evenNum.add(numbers[i]);
                    System.out.println(numbers[i]);
                }
            }
            return evenNum;
        } else {
            System.out.println("Odd numbers are ");
            for(int i = 0; i < numbers.length; i++){
                if (numbers[i] % 2 == 1) {
                    oddNum.add(numbers[i]);
                    System.out.println(numbers[i]);
                }
            }
            return oddNum;
        }
    }

    public ArrayList<Integer> oddEven (int[] numbers, boolean flag) {
        ArrayList<Integer> myNum = new ArrayList<Integer>();
        if (flag == true){
            System.out.println("Even numbers are ");

            for (int i = 0; i < numbers.length; i++){
                if (numbers[i] % 2 == 0) {
                    myNum.add(numbers[i]);
                    System.out.println(numbers[i]);
                }
            }
        }
        else {
            System.out.println("Odd numbers are ");
            for (int i = 0; i < numbers.length; i++){
                if (numbers[i] % 2 == 1) {
                    myNum.add(numbers[i]);
                    System.out.println(numbers[i]);
                }
            }
        }
        return myNum;
    }
}





