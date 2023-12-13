package Faccat;

import javax.swing.JOptionPane;

public class Exercicio6 {
  public static void main(String args[]) {
	  double base, alt, area;
	  
	  base = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da Base: "));
	  alt = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da altura: "));
	  
	  area = (base * alt)/ 2;
	  
	  System.out.println("a area do triangulo é: " + area);
  }
}
