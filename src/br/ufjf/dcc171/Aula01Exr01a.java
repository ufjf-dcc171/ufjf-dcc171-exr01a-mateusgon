package br.ufjf.dcc171;

import javax.swing.JOptionPane;

public class Aula01Exr01a {

    public static void main(String[] args) {
        try{
        Float largura;
        Float comprimento;
        Float altura;
        String l = JOptionPane.showInputDialog("Digite a largura em cm");
        String c = JOptionPane.showInputDialog("Digite o comprimento em cm");
        String a = JOptionPane.showInputDialog("Digite a altura em cm");
        largura = Float.parseFloat(l);
        comprimento = Float.parseFloat (c);
        altura = Float.parseFloat (a);
        JOptionPane.showMessageDialog(null, "O volume de " + largura + " * " + comprimento + " * " + altura + " é " + (largura * altura * comprimento) + "cm³" , "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null, "Digite um número no lugar correto, qualquer outro caractere não será aceito", "Entrada Inválida", JOptionPane.ERROR_MESSAGE);
        }
    }
}
