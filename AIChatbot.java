import java.util.Scanner;

public class AIChatbot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      AI CHATBOT");
        System.out.println("Type 'bye' to exit");
        System.out.println("================================");

        while (true) {

            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("bye")) {
                System.out.println("Bot: Goodbye! Have a great day.");
                break;
            }
            else if (input.contains("hello") || input.contains("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            }
            else if (input.contains("name")) {
                System.out.println("Bot: I am a Java AI Chatbot.");
            }
            else if (input.contains("java")) {
                System.out.println("Bot: Java is a popular programming language.");
            }
            else if (input.contains("codealpha")) {
                System.out.println("Bot: CodeAlpha provides internship opportunities for students.");
            }
            else if (input.contains("time")) {
                System.out.println("Bot: Please check your system clock for the current time.");
            }
            else if (input.contains("how are you")) {
                System.out.println("Bot: I am fine. Thank you!");
            }
            else {
                System.out.println("Bot: Sorry, I don't understand that question.");
            }
        }

        scanner.close();
    }
}