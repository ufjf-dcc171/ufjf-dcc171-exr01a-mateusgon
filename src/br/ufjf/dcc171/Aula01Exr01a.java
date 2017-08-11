package br.ufjf.dcc171;

import javax.swing.JOptionPane;

public class Aula01Exr01a {

    public static void main(String[] args) {
        Float largura;
        Float comprimento;
        Float altura;
        String l = JOptionPane.showInputDialog("Digite a largura");
        String c = JOptionPane.showInputDialog("Digite o comprimento");
        String a = JOptionPane.showInputDialog("Digite a altura");
        largura = Float.parseFloat(l);
        comprimento = Float.parseFloat (c);
        altura = Float.parseFloat (a);
        JOptionPane.showMessageDialog(null, "O volume de " + largura + " * " + comprimento + " * " + altura + " é " + (largura * altura * comprimento) , "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
