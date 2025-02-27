import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Uncomment this block to pass the first stage
        String[] commands = {"echo","type","exit"};
        System.out.print("$ ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // takes the first input

        // so the below do while is performed till the input is empty
        do{
            if(input.equals("exit 0")){
                break;
            }else if(input.startsWith("echo ")){
                if (Arrays.asList(commands).contains(input.substring(5))){
                    System.out.println(input.substring(5));
                } else{
                    System.out.println(input + ": not found");
                }
            } else if (input.startsWith("type ")){
                String typeSubstring = input.substring(5);
                if (Arrays.asList(commands).contains(typeSubstring)){
                    System.out.println(typeSubstring + " is a shell builtin");
                } else{
                    System.out.println(typeSubstring + ": not found");
                }
            } else{
                System.out.println(input + ": not found");
            }

            System.out.print("$ ");
            input = scanner.nextLine();

        }
        while(!input.matches("")); // regex matching
        scanner.close();
    }
}
