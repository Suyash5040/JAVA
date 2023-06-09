import java.util.*;

//Write a program to enter the numbers till the user wants and at the end it
//should display the count of positive, negative and zeros entered.
/*
class main{


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("for continue press Y and for stop press N");
    String a = sc.next();

            int pos = 0, neg = 0, zero = 0;

            while (a.equals("y")){
                System.out.println("enter numbers");
                int num = sc.nextInt();
                if(num>0)
                {pos++;}
               else if(num<0)
                {neg++;}
                else
                {zero++;}

                a = sc.next();
            }


            System.out.println("positive num are" + pos);
            System.out.println("negative num are" + neg);
            System.out.println("zero are" + zero);
        }

    }
*/









//Two numbers are entered by the user, x and n. Write a function to find
//the value of one number raised to the power of another i.e. 𝑥 .
/*
class main{
    public static void power(int x, int n){
        int p = 1;
        for(int i=1; i<=n; i++){
            p = p*x;
        if(n==0){
            p=1;
        }
        }
        System.out.println("x to the power of n is :" + p);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int x = sc.nextInt();
        int n = sc.nextInt();
        power(x, n);
    }
}
*/











// Write a function that calculates the Greatest Common Divisor of 2 numbers.
/*class main{

    public static void gcd(int a, int b){

        while(a != b){
            if(a>b) {
                a = a - b;
            }
            else{
                b = b-a;
        }
        }
        System.out.println("the highest common divisor is :" + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        gcd(a, b);

    }
}
*/













//Write a program to print Fibonacci series of n terms where n is input
//by user :
//0 1 1 2 3 5 8 13 21 .....
//In the Fibonacci series, a number is the sum of the previous 2 numbers that
//came before it.

/*
class main{
    public static void fib(int n) {
        int a = 0, b=1;

        if(n==0){
            return;
        }
        else if(n==1){
            System.out.print(a);
        }
        else if(n==2){
            System.out.print(a+" "+b);
        }


        else {
            System.out.print(a + " " + b + " ");
            for (int i = 2; i < n; i++) {
                int c = a + b;
                a = b;
                b = c;
                System.out.print(c + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        fib(n);
    }
}
*/







