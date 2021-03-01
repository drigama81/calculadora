import java.util.Scanner;
import java.text.DecimalFormat;

public class TotalCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 1 - Ciclo do while para controlar a opção do utilizador

        int opcao = 0;

        do {
            opcoesUtilizador();

            opcao = scanner.nextInt();

            verificarOpcao(opcao);
            if (opcao != 0) {
                operacoes(opcao);
            }

        } while (opcao != 0);

        scanner.close();
    }

    // 2 - Menu: Escolhe a operação: 1 - Soma.....
    // Tech: método para apresentarMenu
    public static void opcoesUtilizador() {
        System.out.println(" ");
        System.out.println("----Bem-vindo(a) à Calculadora!----");
        System.out.println("Escolha uma das seguintes opções: ");
        System.out.println("Prima 1 para soma");
        System.out.println("Prima 2 para subtração");
        System.out.println("Prima 3 para multiplicação");
        System.out.println("Prima 4 para divisão ");
        System.out.println("Prima 0 para sair ");
    }

    // 3 - Verificar opção - método para validar opção dentro do esperado
    public static void verificarOpcao(int opcao) {
        if (opcao < 0 || opcao > 4) {
            System.out.println("Opcao invalida. Selecione outra opcao.");
        }
    }

    // 4 - Método para controlar operações - criar método com switch and case para
    // começar a execução da operação
    public static void executarOpcao(int opcao, double primeiroAlgoritmo, double segundoAlgoritmo) {

        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = primeiroAlgoritmo + segundoAlgoritmo;
                break;
            case 2:
                resultado = primeiroAlgoritmo - segundoAlgoritmo;
                break;
            case 3:
                resultado = primeiroAlgoritmo * segundoAlgoritmo;
                break;
            case 4:
                resultado = primeiroAlgoritmo / segundoAlgoritmo;
                break;
            default:
                break;
        }
        DecimalFormat decimalFormat = new DecimalFormat("######.##");

        // Aqui aplicas o formato ao que tu queres -> Faltava-te isso
        String format = decimalFormat.format(resultado);

        System.out.println("O resultado da operação é = " + format);
    }

    // 5 - Pedir 1º algoritmo/validar 1º algoritmo; Pedir 2º algoritmo/validar
    // 2ºalgoritmo
    public static void operacoes(int opcao) {
        System.out.println("Insira o primeiro número");
        double primeiroAlgoritmo = scanner.nextDouble();

        System.out.println("Insira o segundo número");
        double segundoAlgoritmo = scanner.nextDouble();

        executarOpcao(opcao, primeiroAlgoritmo, segundoAlgoritmo);
    }

}