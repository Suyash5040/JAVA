import java.util.*;

//Tower Of Hanoi

/*

class main{

    public static void towerOfHanoi(int  n, String src, String helper, String dest) {
        if(n==1){
            System.out.println("transfer disk "+ n + " from " + src + " `to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk " + n +" from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }


    public static void main(String[] args) {
        int  n=2;
        towerOfHanoi(n, "S", "H", "D`");

    }
}

 */








//print string in reverse
/*
class main{

    public static void printString(String str, int idx) {
       if(idx == 0){
           System.out.print(str.charAt(idx));
           return;
       }
        System.out.print(str.charAt(idx));
        printString(str, idx-1);

    }
    public static void main(String[] args) {
        String str ="abcd";
        printString(str, str.length()-1);

    }
}
 */












//find the first and last occurence of string
class main{
    public static int first = -1;
    public static int last = -1;
    public static void findOccurence(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr = str.charAt(idx);
        if(curr==element){
            if(first==-1){
                first = idx;
            }
            else {
                last = idx;
            }
        }
        findOccurence(str, idx+1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
                findOccurence(str, 0, 'a');
    }
}