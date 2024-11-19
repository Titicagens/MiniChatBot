import java.util.Scanner;

public class MiniChatBot {

    private Respostas respostas;

    public MiniChatBot() {
        respostas = new Respostas();
    }

    public void iniciarConversa() {
        Scanner scanner = new Scanner(System.in);
        String entrada;

        System.out.println("Olá! Eu sou o MiniChatbot. Como posso te ajudar hoje?");

        while (true) {
            System.out.print("Você: ");
            entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                System.out.println("MiniChatbot: Tchau! Até a próxima.");
                break;
            }

            String resposta = respostas.getResposta(entrada);
            System.out.println("MiniChatbot: " + resposta);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        MiniChatBot chatbot = new MiniChatBot();
        chatbot.iniciarConversa();
    }
}