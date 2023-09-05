import javax.swing.JOptionPane;

//pacote padrão: java.lang: importado automaticamente
public class SomaDoisNumeros{
    public static void main(String [] args){
    //declaração de variáveis

    double PrimeiroOperando;
    double SegundoOperando;
    double resultado;

    //Entrada
        PrimeiroOperando = Double.parseDouble(JOptionPane.
        showInputDialog("Digite o primeiro operando"));

        SegundoOperando = Double.parseDouble(JOptionPane.showInputDialog
        ("digite o segundo operando"));

    //Processamento
        resultado = PrimeiroOperando + SegundoOperando;

    //Saída
    JOptionPane.showMessageDialog(null, resultado);
 }
}