import java.util.Scanner;
public class MenuDrivenProgram {
  public static void displayMenu(){
    System.out.println("Menu: ");
    System.out.println("1.Greet User");
    System.out.println("2.Check Even/Odd");
    System.out.println("3.Exit");

  }

  public static void greetUser(){
    System.out.println("Hello! Welcome!");
  }

  public static void checkEvenOrOdd(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int userNum = input.nextInt();
    
    if (userNum % 2 == 0) {
      System.out.println(userNum + " is an even number.");
    }else{
      System.out.println(userNum + " is an odd number.");
    }
  }

  public static void handleMenuChoice(int choice){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your choice (1-3): ");
    int userChoice = input.nextInt();
    if (userChoice == 1){
      greetUser();
    }
    
    else if(userChoice == 2){
      checkEvenOrOdd();
    }

    else{
      System.out.println("Exiting program. Goodbye!");
      System.exit(userChoice);
    }

  }

  public static void main(String[] args) {
    while (true){
      displayMenu();
      handleMenuChoice(0);
      
    }
  }

  
}