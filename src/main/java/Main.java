import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Uncomment this block to pass the first stage
//        System.out.println("Making your own command shell using java");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while(true){
            System.out.println("$ " + input + ": command not found");
        }
    }
}
