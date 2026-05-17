import java.util.Scanner;

public class ReversePattern{
public static void main(String [] args){

Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter number of rows: ");
    int number = inputCollector.nextInt();

        
   
//        for(int star = 1; star <= rowCount; ++star){
//             System.out.print("*"+ " "+ star);
//     for(int rowCount = 1; rowCount <= number; ++rowCount){
//                System.out.print("row"+ rowCount);
//        }
//        
//            System.out.println( );
//    
//    }
//}
//
//   for(int rowCount = 1; rowCount <= number; ++rowCount){
//        for(int star = 1; star <= number - rowCount; ++star){
//   System.out.print(" ");
//        }
//     for(int star = 1; star <= rowCount; ++star){
//   System.out.print("*"+ " ");
//    }
//    System.out.println( );
//    }
//}
//}
//       this prints a triangle

   for(int rowCount = 1; rowCount <= number; rowCount++){
        for(int space = 1; space <= number- rowCount; space++)
   System.out.print(" ");
        
     for(int star = 1; star <= rowCount; star++)
   System.out.print("*");
    
    System.out.println();
    }
}
}
//       this prints a triangle
  



//
//         for(int i= 1; i<= number; i++){
//
//        for(int j = 1; j <= number - i; j++){
//   System.out.print( "   ");
//        
//    
//    for(int l = 1; l <= i ; l++){
//        System.out.print(" *"+" ");
//
//
//}
//    System.out.println();
//    }
//   
//}
//}


