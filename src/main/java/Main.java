import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Uncomment this block to pass the first stage
//        System.out.println("Making your own command shell using java");
//        System.out.print("$ ");
//
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine(); // takes the first input
//
//        // so the below do while is performed till the input is empty
//        do{
//            System.out.println(input + ": command not found");
//            System.out.print("$ ");
//            input = scanner.nextLine();
//        }
//        while(!input.matches("")); // regex matching
//        scanner.close();

        while (true) {
            System.out.println("$ ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine(); // takes the first input

            if (input.equals("exit 0")) {
                break;
            }
            System.out.println(input + ": command not found");
        }
    }
}
