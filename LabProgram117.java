import java.util.Scanner;

public class LabProgram117 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userList = new int[20];   // List of numElement integers specified by the user
      int numElements;                // Number of integers in user's list
      // Add more variables as needed
      
      System.out.println("Enter number of elements");
      numElements = scnr.nextInt();   // Input begins with number of integers that follow
      
      for (int i=0; i<numElements;i++){
          System.out.println("Enter the elements now:");
          userList[i] = scnr.nextInt();
      }
      /*
      for (int i=numElements-1; i>=0;i--){
         System.out.print(userList[i] + ",");
      }      
      */
      //alternative
      for (int i=0; i<numElements; i++) {
    	  System.out.print(userList[numElements-1-i] + ",");
      }
   }
}
