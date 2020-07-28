public class Cadastro {
    public static void main(String[] args) throws Exception {
        
        Dicionario<String, Carro> dicionario = new Dicionario<>();

        Carro carro = new Carro("KKN2368", "GOL", "2013", "Paulo Roberto Vieira");

        dicionario.adiciona(carro.getPlaca(), carro);

        if (dicionario.retorna(carro.getPlaca()) != null) {
            System.out.println("Carro está no dicionário.");
        } else {
            System.out.println("Carro não existe.");
        }

    }
}
