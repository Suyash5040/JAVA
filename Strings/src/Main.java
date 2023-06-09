import java.util.*;

//Take an array of Strings input from the user & find the cumulative (combined)
//length of all those strings.
/*class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();
        int totLength=0;
        String array[] = new String[size];

        for(int i=0;i<size;i++){
            array[i] = sc.next();
            totLength += array[i].length();
        }
        System.out.println(totLength);

    }
}
*/








//Input a string from the user. Create a new string called ‘result’ in which you will
//replace the letter ‘e’ in the original string with letter ‘i’.

/*class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any text");
        String original = sc.next();

        String result=" ";

        for(int i=0;i<original.length();i++){
            if(original.charAt(i) =='e'){
                result +='i';
            }
            else {
                result += original.charAt(i);
            }

        }
        System.out.println(result);
        }

}
*/








//Input an email from the user. You have to create a username from the email by
//deleting the part that comes after ‘@’. Display that username to the user.

/*
class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your email add.");
        String email = sc.next();
        String result="";
        for(int i=0; i<email.length(); i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else{
                result += email.charAt(i);
            }
        }
        System.out.println("Your user Name is: "+ result);

    }
}
*/









//String Builder

class main{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");

        for (int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar= sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);

            }
}




