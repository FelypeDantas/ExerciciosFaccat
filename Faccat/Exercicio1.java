package Faccat;


/**
 * Escreva um algoritmo que armazene o valor 10 em uma variável 
 * A e o valor 20 em uma variável B.
A seguir (utilizando apenas atribuições entre variáveis) 
troque os seus conteúdos fazendo com que o
valor que está em A passe para B e vice-versa. 
Ao final, escrever os valores que ficaram armazenados
nas variáveis.
 * **/

public class Exercicio1 {

public static void main(String args[]) {
	   int A = 10, B = 20, aux;
	   
	   aux = A;
	   A = B;
	   B = aux;
	   
	   System.out.println("Agora o valor de A:" + A + " e o valor de B:" + B);
   }
}
