import java.util.Scanner;

//pacote padrão: java.lang: importado automaticamente
public class SomaDoisNumeros{
    public static void main(String [] args){
    //declaração de variáveis

    Scanner leitor = new Scanner(System.in);
    double PrimeiroOperando;

    double SegundoOperando;
    double resultado;

    //Entrada
        System.out.println("Digite o primeiro operando");
        PrimeiroOperando = leitor.nextDouble();

        System.out.println("Digite o segundo operando");
        SegundoOperando = leitor.nextDouble();

    //Processamento
        resultado = PrimeiroOperando + SegundoOperando;

    //Saída
    System.out.print(resultado);
 }
}