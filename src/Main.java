import java.util.Scanner;

public class Main {
    private double salario;
    private double valorAplicado;
    private double salarioRestante;
    private String nome;
    private String cpf;
    private String s;
    private double creditoGanho;

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("          INVESTIMENTO NA EMPRESA     ");
        System.out.println("=====================================");

        System.out.println("Language:");
        System.out.println("1. Portuguese");
        System.out.println("2. English");

        int idioma = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado

        if (idioma == 1) {
            System.out.println("Estamos gratificados com o seu interesse em investir na empresa!");

            System.out.print("Qual o seu nome? ");
            nome = scanner.nextLine();
            System.out.print("Qual o seu salário? ");
            salario = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer do teclado
            System.out.print("Qual o seu CPF? ");
            cpf = scanner.nextLine();
            System.out.print("Qual será o valor investido? ");
            valorAplicado = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer do teclado
            System.out.print("Qual a sua intenção ao aplicar? ");
            s = scanner.nextLine();

            salarioRestante = salario - valorAplicado;
            creditoGanho = (valorAplicado * salario) / 1000;

            printRecibo();
        } else if (idioma == 2) {
            System.out.println("Hello, did you know that by investing in our company you will earn credits with us?");
            System.out.println("Do you want to apply?");

            System.out.println("Press 1 for apply or 2 for not: ");
            int resposta = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            if (resposta == 1) {
                System.out.print("What's your name? ");
                nome = scanner.nextLine();
                System.out.print("What's your wage? ");
                salario = scanner.nextDouble();
                scanner.nextLine(); // Limpar o buffer do teclado
                System.out.print("What's your CPF? ");
                cpf = scanner.nextLine();
                System.out.print("How much do you want to invest? ");
                valorAplicado = scanner.nextDouble();
                scanner.nextLine(); // Limpar o buffer do teclado
                System.out.print("What's your intention for this application? ");
                s = scanner.nextLine();

                salarioRestante = salario - valorAplicado;
                creditoGanho = (valorAplicado * salario) / 1000;

                printRecibo();
            } else {
                System.out.println("Ok! Goodbye.");
            }
        }

        System.out.println("=====================================");
        scanner.close();
    }

    public void printRecibo() {
        System.out.println("Recibo:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Intenção: " + s);
        System.out.println("Renda restante: " + String.format("%.2f", salarioRestante));
        System.out.println("Créditos ganhos: " + String.format("%.2f", creditoGanho));
        System.out.println("Obrigado por usar a aplicação de investimento!");
    }

    public static void main(String[] args) {
        Main appInvestimento = new Main();
        appInvestimento.start();
    }
}
