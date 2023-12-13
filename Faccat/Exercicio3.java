package Faccat;


/** Os pares de instruções abaixo produzem o mesmo resultado?
A (4/2)+(2/4) e A 4/2+2/4
B 4/(2+2)/4 e B 4/2+2/4
C (4+2)*2-4 e C 4+2*2-4 **/

public class Exercicio3 {
   public static void main(String[] args) {
	   double A, B, C;
	   
	   A = (4/2) + (2/4);
	   System.out.println("A: " + A);
	   
	   A = 4/2 + 2/4;
	   System.out.println("Verificação de A: " + A);
	   //A dá o mesmo resultado
	   System.out.println("____________________________________");
	   
	   B = 4/(2+2)/4;
	   System.out.println("B:" + B);
	   
	   B = 4/ 2+2 / 4;
	   System.out.println("Verificação de B: " + B);
	   //B não dá o mesmo resultado
	   System.out.println("____________________________________");
	   
	   C = (4+2)* 2 - 4;
	   System.out.println("C:" + C);
	   
	   C = 4 + 2 * 2 - 4;
	   System.out.println("Verificação de C:" + C);
	   //C não dá o mesmo resultado
	   System.out.println("____________________________________");
   }
}
