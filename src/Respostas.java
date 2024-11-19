public class Respostas {

    public String responderSaudacao() {
        return "Olá! Como posso ajudar?";
    }
    public String responderNome() {
        return "Eu sou o MiniChatbot, seu assistente virtual!";
    }
    public String responderEstado() {
        return "Estou funcionando perfeitamente, obrigado!";
    }
    public String respostaPadrao() {
        return "Desculpe, não entendi sua pergunta. Pode reformular?";
    }
    public String getResposta(String entrada) {
        if (entrada.toLowerCase().contains("oi")) {
            return responderSaudacao();
        } else if (entrada.toLowerCase().contains("qual é o seu nome")) {
            return responderNome();
        } else if (entrada.toLowerCase().contains("como você está")) {
            return responderEstado();
        } else {
            return respostaPadrao();
        }
    }
}
