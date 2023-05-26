import java.util.Scanner;
public class part2 {
     public static void main (String[] args){
        boolean cont = false;
        do {
            try{
                Scanner sc = new Scanner(System.in);
                String s = "";
                String pattern = "SE123";
                System.out.println("Enter the string: ");
                s = sc.nextLine();
                if(!s.matches(pattern)){
                    throw new Exception();
                }
                System.out.println("The string is: " + s);
                cont = false;
            }catch(Exception e){
                System.out.println("The string is invalid ");
                cont = true;
            }
        } while (cont);
        
    }
}
