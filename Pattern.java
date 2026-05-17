import java.util.Scanner;

public class Pattern{
public static void main(String [] args){

Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter number of rows: ");
    int number = inputCollector.nextInt();


    for(int rowCount = 1; rowCount <= number; ++rowCount){
        for(int star = 1; star <= rowCount; ++star){
   System.out.print("*"+ " ");
        }
    
    System.out.println( );
    }
}
}

