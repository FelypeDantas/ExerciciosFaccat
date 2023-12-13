package Faccat;

import javax.swing.JOptionPane;

/**Escreva um algoritmo para ler um valor (do teclado) 
 * e escrever (na tela) o seu antecessor. **/

public class Exercicio5 {
  public static void main(String args[]) {
	  int Valor;
	  
	  Valor = Integer.parseInt(JOptionPane.showInputDialog("Escreva um valor"));
	  
	  System.out.println("O seu antecessor:" + (Valor - 1));
  }
}
