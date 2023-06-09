import java.util.*;

//Get Bit :- know bit number
/*
class main{
    public static void main(String[] args){
        int n = 5;//0101
        int pos = 2;
        int bitmask = 1<<pos;
        //perform AND
        if ((bitmask & n) == 0){
            System.out.println("bit is zero");
        }
        else
        System.out.println("bit is one");
    }
}
*/








//Set Bit :- set bit to 1
/*
class main{
    public static void main(String[] args) {
        int n = 5;//0101
        int pos = 1;
        int bitmask = 1<<pos;

        //perform OR
        int newNumber = bitmask | n;
        System.out.println(newNumber);

    }
}
*/










//Clear Bit :- set bit to zero
/*
class main{
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;

        //perform AND with NOT operation
        int notBitMask = ~bitMask;
        int newNumber = notBitMask & n;
        System.out.println(newNumber);

    }
}
*/








//update bit :- change bit to another bit
/*
class main{
    public static void main(String[] args){
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;


        if ((bitMask & n) == 0){
            int newNumber = bitMask | n;
            System.out.println(newNumber);

        }
        else {
            int notBitMask = ~bitMask;
            int newNumber = notBitMask & n;
            System.out.println(newNumber);
        }
    }
}
 */







//Write a program to find if a number is a power of 2 or not
/*
class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n =  sc.nextInt();

        if(n%2 == 0)
            System.out.println("number is power of 2");
        else
            System.out.println("it is not power of 2");
    }
}
*/










//Write a program to count the number of 1’s in a binary representation
//of the number.
/*
class main{
    public static void main(String args[]) {
        System.out.println("Testing our countBits() method with bit sequences");
        String[] input = {"000000", "001000", "101", "111", "1110001", "111110000"};
        for(int i=0; i<input.length; i++){
            int binary = Integer.parseInt(input[i], 2);
            int count = countBits(binary);
            System.out.println("bit sequence : " + input[i] + ", number of 1s : " + count);
        }
    }
    public static int countBits(int number) {
        if (number == 0) {
            return number;
        }
        int count = 0;
        while (number != 0) {
            number &= (number - 1);
            count++;
        }
        return count;
    }
}
*/









//Write 2 functions => decimalToBinary() & binaryToDecimal() to convert
//a number from one number system to another.

class main{


    public static void decimalToBinary(int num2) {

        String binary = Integer.toBinaryString(num2);
        System.out.println(" decimal to binary: " + binary );
    }
    public static void binaryToDecimal(String num1){

        int decimal = Integer.parseInt(String.valueOf(num1), 2);
        System.out.println("binary to decimal: "+ decimal);

    }
    public static void main(String[] args) {
        String num1 = "101010011";
        int num2 = 1;
    decimalToBinary(num1);
    binaryToDecimal(num2);
    }
}