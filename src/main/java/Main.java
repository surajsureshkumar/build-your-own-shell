import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Uncomment this block to pass the first stage
        System.out.print("$ ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // takes the first input

        // so the below do while is performed till the input is empty
        do{
            if(input.equals("exit 0")){
                break;
            }
            if(input.startsWith("echo ")){
                System.out.println(input.substring(5));
            } else{
                System.out.println(input + ": command not found");
            }

            if(input.startsWith("type ")){
                System.out.println(input.substring(5) + "is a shell builtin");
            } else{
                System.out.println(input + ": command not found");
            }

            System.out.print("$ ");
            input = scanner.nextLine();

        }
        while(!input.matches("")); // regex matching
        scanner.close();
    }
}
