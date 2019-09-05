import java.util.Scanner;

public class Names{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter first name:");
String name1 = input.nextLine();

System.out.print("Enter second name:");
String name2 = input.nextLine();

String name = name1 + name2;

System.out.printf("name is: " + name);

}
}
