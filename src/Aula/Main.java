package Aula;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
	   funcoes f = new funcoes();
	   int a, b, resultado;
    a = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de A: "));
    
    b = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de B: "));
    resultado = f.SomarScanner(a, b);
    JOptionPane.showMessageDialog(null, "A soma retronou um resultado que é: "+resultado);
  
    
	}

}
