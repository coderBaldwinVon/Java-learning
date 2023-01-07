import java.util.Objects;
import java.util.Scanner;

public class TestDemo {
    public static void login(String password){
        for (int count = 1; count <=3 ; count++) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if(input.equals(password)){
                System.out.println("Login succeeded!");
                break;
            }else{
                if(count < 3){
                    System.out.println("Login failed. You have logged in incorrectly"+count+"times");
                }
                if(count == 3){
                    System.out.println("Login failed, exit the program");
                }
            }
        }
    }

    public static void main(String[] args) {
        //Write code to simulate the scenario of three password entries. You can enter the password for up to three times.
        //If the password is correct, you will be prompted "Login succeeded".
        //If the password is incorrect, you can re-enter it for up to three times.
        //If all three times are wrong, you will be prompted to exit the program
        String password = "hello bit";
        login(password);
    }




    public static void main8(String[] args) {
        //Write a program to count how many digits 9 appear in all integers from 1 to 100.
        int count = 0;
        for (int i = 1; i <= 100 ; i++) {
            if(i % 10 ==9){
                count++;
            }
            if(i / 10 ==9){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main7(String[] args) {
        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
        double sum=0.0;
        for (int num = 1; num <= 100 ; num++) {
        if(num % 2 == 0){
            sum = sum - 1.0/num;//注意：一定要用1.0/num 否则会导致变成整数除法，不会保留浮点数
        }else {
            sum = sum +1.0/num;
        }
        }
        System.out.println(sum);
    }


    public static void revise1(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = num1 % num2;
        while(num3 != 0){
            num1 = num2;
            num2 = num3;
            num3 = num1%num2;
        }
        System.out.println("The greatest common divisor of two positive integers is"+num2);
    }

    public static void main6(String[] args) {
        //Finding the greatest common divisor of two positive integers
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int judge = 0;
        int ret = 1;
        if(num1 <= num2){
            judge = num1;
        }else{
            judge = num2;
        }
        for (int i = 2; i <= judge ; i++) {
            if(num1 % i ==0 && num2 % i ==0 ) {
                ret = i;
            }
        }
        System.out.println(ret);
    }


    public static void main5(String[] args) {
        //Output multiplication formula table
        for (int mul1 = 1; mul1 <= 9 ; mul1++) {
            for (int mul2 = 1; mul2 <=9 ; mul2++) {
                System.out.printf(mul1+"*"+mul2+"="+mul1*mul2+" ");
            }
            System.out.println();
        }
    }


    public static void main4(String[] args) {
        //Output all leap years between 1000 and 2000
        for (int year = 1000; year <= 2000 ; year++) {
            if(year % 4 == 0 && year % 100 !=0 || year % 400 ==0 ){
                System.out.println(year+"是闰年");
            }
        }
    }


    public static void main3(String[] args) {
        //Print all prime numbers between 1 - 100
        boolean flg = true;
        for (int num = 1; num <= 100 ; num++) {
            for (int i = 2; i < num ; i++) {
                flg = true;
                if(num % i ==0){
                    flg = false;
                    break;
                }
            }
            if(flg == true){
                System.out.println(num);
            }
        }
    }




    public static void main2(String[] args) {
        //Determine whether a number is prime
        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();
        boolean flg = true;//默认是素数
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0){
                flg = false;
                break;
            }
        }
        if(flg == true){
            System.out.println(num+"is prime number");
        }else{
            System.out.println(num+"is not prime number");
        }
    }


    public static void main1(String[] args) {
        //According to the age, print out that the current age is juvenile (below 18),
        // young (19-28), middle-aged (29-55), and old (above 56)
        Scanner scanner=new Scanner(System.in);
        int age = scanner.nextInt();
        if(age <= 18){
            System.out.println("juvenile");
        } else if (age >= 19 && age <= 28) {
            System.out.println("youth");
        } else if (age >= 29 && age <= 55) {
            System.out.println("middle-aged person");
        }else {
            System.out.println("the old");
        }
    }
}