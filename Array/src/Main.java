import java.util.*;


//Find the maximum & minimum number in an array of integers.
/*
class main{

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        //array
        int[] marks = new int[size];

        //input
        for(int i = 0; i < size; i++){
            System.out.println("enter marks");
            marks[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //output
        for (int i = 0; i < marks.length; i++) {
          if(marks[i]>max){
              max = marks[i];
          }
          if(marks[i]<min){
              min = marks[i];
          }
        }
        System.out.println("max : "+ max + " min : "+ min);



    }
}

*/














//Take an array of numbers as input and check if it is an array sorted in
//ascending order.
/*
class main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        //array
        int[] marks = new int[size];

        //input
        for (int i = 0; i < size; i++) {
            System.out.println("enter marks");
            marks[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i = 0; i<marks.length-1; i++){

            //condition ofor descinding order
            if (marks[i]>marks[i+1]) {
                isAscending = false;

            }
        }


        if(isAscending){
            System.out.println("list is in ascending order");

        }
        else
            System.out.println("list is not in ascending order");
    }
}
*/








// 2D ARRAY


// take input and print output
/*
class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter no. of rows and cols");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        //input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //search number
        System.out.println("enter search number");
        int x = sc.nextInt();
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
            if(matrix[i][j]==x){
                System.out.println("x found at: ("+ i+ ", " + j+ ")");
            }
        }
        }

    }
}
*/















//For a given matrix of N x M, print its transpose.

/*
class main {
 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();


        int matrix[][] = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }


        System.out.println("The transpose is : ");
        //To print transpose
        for(int j=0; j<m ;j++) {
            for(int i=0; i<n; i++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
*/








class main{
    @SuppressWarnings("DataFlowIssue")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and col");
int n = sc.nextInt();
int m = sc.nextInt();

int matrix[][] = new int[n][m];

//input
        System.out.println("enter numbers");

for(int i=0; i<n; i++){
    for(int j=0; j<m; j++)
    {
        matrix[i][j] = sc.nextInt();
    }
}


        System.out.println("The spiral ouput is: ");
int rowStart = 0;
int colStart = 0;
int rowEnd = n - 1;
int colEnd = m - 1;

//to print spiral order matrix
while(rowStart <= rowEnd && colStart <= colEnd){

    //1
for(int col=colStart; col <= colEnd; col++){
    System.out.println(matrix[rowStart][col]+ " ");
}
rowStart++;

//2
for(int row=rowStart; row <= rowEnd; row++){
    System.out.println(matrix[row][colEnd]+ " ");
}
colEnd--;

//3
for(int col=colEnd; col >= colStart; col--){
    System.out.println(matrix[rowEnd][col]+" ");
}
rowEnd--;

//4
for(int row=rowEnd; row >= rowStart; row--){
    System.out.println(matrix[row][colStart]+" ");
}
colStart++;


}

    }
}



























