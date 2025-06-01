import java.util.Scanner;
public class JavaProject {
    String information = "Buzz Lightyear is great";

    public static void main(String[] args) {
    Scanner nameOfUser = new Scanner(System.in);
    System.out.println("enter username:");

    String username = nameOfUser.nextLine();
    System.out.println("""
                       
                       Welcome,
                       """ + username);
    
    
    
    Scanner Numbers = new Scanner(System.in);
    System.out.println("""
                       
                       Enter two numbers:
                       """);
    int number = Numbers.nextInt();
    int number2 = Numbers.nextInt();
    

    System.out.println(number + " plus " + number2 + " is equal to:");
    System.out.println(number + number2);
    
    JavaProject reallyReal = new JavaProject();
    System.out.println(reallyReal.information);
    
    uselessCode newObj = new uselessCode();
    System.out.println(newObj.text);
    
    info soon = new info();
    System.out.println(soon.ending);
    }

    private static class uselessCode {
     String text;
     String elseText;
    
    public uselessCode() {
    if (5 + 2 == 7) {
      text = """
             
             It's true.
             
             Trust me.
             """;
    } else {
    elseText = """
               It isn't true.
               
               My bad, guys.
               """;
    }
    }
        
    }
}
