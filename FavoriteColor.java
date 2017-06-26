import java.io.Console;

public class FavoriteColor {
  public static void main(String[] args) {
    Console myConsole = System.console();




    System.out.println("What is your number?");
    Integer number = Integer.parseInt(myConsole.readLine());

    System.out.println("enter second number");
    Integer numberTwo = Integer.parseInt(myConsole.readLine());
    Integer addNumber = number + numberTwo;

      System.out.println(addNumber);

  }
}
/*import java.util.Scanner;
public class FavoriteColor{
  public static void main(String[]args){

    System.out.println("What is your favorite color?");
    Scanner scanIn = new Scanner(System.in);
    String inputString = scanIn.nextLine();

    scanIn.close();
    System.out.println("Color entered" + inputString);
  }
}*/
