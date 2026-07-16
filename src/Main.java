import br.com.desafio.models.Automovel;
import br.com.desafio.models.Estacionamento;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    static void main(String[] args) {
        int escolha = 0;
        String menu = "====ESTACIONAMENTO====\n\n1 - Entrada\n2 - Saída\n3 - Listar carros\n4 - Mostrar vagas\n5 - Sair\n\nInforme uma das opções:\n";
        Scanner scanner = new Scanner(System.in);
        Estacionamento estacionamento = new Estacionamento(10);

        while(escolha != 5) {
            System.out.print(menu);
            escolha = scanner.nextInt();
            scanner.nextLine();
            if (escolha == 1) {
                System.out.println("Informe o modelo do carro: ");
                String modelo = scanner.nextLine();
                System.out.println("Informe a cor do carro: ");
                String cor = scanner.nextLine();
                System.out.println("Informe a placa do carro: ");
                String placa = scanner.nextLine();
                Automovel carro = new Automovel(modelo, cor, placa);
                estacionamento.entradaCarro(carro);
            }
        }

    }
}
