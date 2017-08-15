package mygetclass;


import java.util.Scanner;
 
class MyGetClass {
 
 
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
 
        int testCaseCounter = 1;
        int testCase = 0;
        testCase = in.nextInt();
 
        while(testCaseCounter <= testCase) {
            int originalNumber = in.nextInt();
            int counter = 0;
            boolean isPalindrome = false;
            while(isPalindrome == false) {
                int reversedNumber = reverseNumber(originalNumber);            
                int sum = originalNumber + reversedNumber;
                int tempSum = sum;
                counter++;
                if( isPalindrome(sum) ) {
                    System.out.println(counter+" "+sum);
                    isPalindrome = true;
                } else {
                    originalNumber = tempSum;
                    reversedNumber = 0;
                }
            }
            testCaseCounter++;
        }
        in.close();
    }
 
    public static int reverseNumber(int originalNumber) {
        int reversedNumber = 0;
        while(originalNumber != 0) {
            int remainder = originalNumber % 10;
            reversedNumber = 10*reversedNumber + remainder;
            originalNumber /= 10;
        }
        return reversedNumber;
    }
 
    public static boolean isPalindrome(int summedNumber) {
        int palindromeNumber = 0;
        int tempPalindrome = summedNumber;
        while( summedNumber != 0 ) {
            int remainder = summedNumber % 10;
            palindromeNumber = 10*palindromeNumber + remainder;
            summedNumber /= 10;
        }
        if(tempPalindrome == palindromeNumber) {
            return true;
        } else {
            return false;
        }
    }
}