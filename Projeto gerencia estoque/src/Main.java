import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorEstoque estoque = new GerenciadorEstoque();
        estoque.menu();
    }
}

// Melhorias a se fazer:

// 1. Tratamento de exceções: Adicione tratamento de exceções para lidar com possíveis erros durante a execução do programa, como entrada inválida do usuário.

// 2. Validação de entrada: Implemente validações para garantir que os valores fornecidos pelo usuário sejam válidos e dentro das expectativas. Por exemplo, verifique se os valores são números positivos, se os códigos dos produtos são únicos, etc.

// 3. Modularização: Separe as diferentes responsabilidades do código em métodos mais específicos e utilize boas práticas de design modular. Isso tornará o código mais organizado e fácil de entender.

// 4. Adicionar comentários.