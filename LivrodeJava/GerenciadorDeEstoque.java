contrutoresEsetter.java



import java.util.Scanner;

// Supondo que a classe Produto já existe como no exemplo anterior
// com construtor, getters e setters.

public class GerenciadorDeEstoque {
    public static void main(String[] args) {

        // --- ETAPA 1: COLETA DOS DADOS ---
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        String codigoDoUsuario = teclado.nextLine();

        System.out.print("Digite o nome do produto: ");
        String nomeDoUsuario = teclado.nextLine();
        
        System.out.print("Digite o preço de tabela do produto: ");
        double precoDoUsuario = teclado.nextDouble();
        
        // --- ETAPA 2: CRIAÇÃO COM O CONSTRUTOR ---
        // O objeto nasce com o preço original que o usuário digitou.
        // O construtor é chamado aqui.
        Produto produtoDoUsuario = new Produto(codigoDoUsuario, nomeDoUsuario, precoDoUsuario, 0); // Começa com 0 no estoque
        
        System.out.println("\nProduto cadastrado com o preço de tabela: R$ " + produtoDoUsuario.getPreco());

        // --- ETAPA 3: ATUALIZAÇÃO COM O SETTER ---
        // Agora que o objeto JÁ EXISTE, vamos modificá-lo.
        // Regra de negócio: Aplicar desconto de 10% no cadastro.
        System.out.println("Aplicando desconto de boas-vindas de 10%...");
        
        // Primeiro, lemos o preço atual com o getter para calcular o desconto
        double precoAtual = produtoDoUsuario.getPreco();
        double novoPrecoComDesconto = precoAtual * 0.90; // Calcula 90% do valor

        // Agora, usamos o SETTER para ATUALIZAR o preço no objeto.
        produtoDoUsuario.setPreco(novoPrecoComDesconto);
        
        System.out.println("Preço final com desconto: R$ " + produtoDoUsuario.getPreco());
        
        // Outra atualização usando setter para um dado opcional
        System.out.println("\nAdicionando 10 unidades ao estoque inicial...");
        produtoDoUsuario.setQuantidadeEmEstoque(10);
        
        System.out.println("Estoque atual: " + produtoDoUsuario.getQuantidadeEmEstoque());
        
        teclado.close();
    }
}
