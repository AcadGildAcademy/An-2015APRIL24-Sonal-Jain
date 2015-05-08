/**
* program to print prime no. between 1 to 100
* @version 1.0 03-05-2015
* @author Sonal Jain
*/ 


public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean isPrime = true;
        for(int i = 1; i <= 100; i++) {
            for(int j = 2; j <= i / 2; j++) {
                if(i % j == 0) { 
                    isPrime = false;
                    break;
                }
            }
            if(i >= 1 && isPrime) { System.out.println(i);}
            isPrime = true;
        }
    }
  }

