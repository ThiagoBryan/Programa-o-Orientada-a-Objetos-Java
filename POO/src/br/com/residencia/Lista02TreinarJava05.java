//5.	O sistema �Fa�o parte� vai te mostrar um hist�rico da trajet�ria de nossa cidade. 
//O resultado apresentado na tela ser�: �Teres�polis tem X anos. Desses, Y foram antes de mim.
//Mas os �ltimos Z anos contaram comigo!�. Cada letra mai�scula do texto ser� uma vari�vel, 
//sendo que �x� e �z� s�o valores fixos, e �y� ir� conter uma express�o.
package br.com.residencia;

import java.util.Scanner;

public class Lista02TreinarJava05 {

	public static void main(String[] args) {
	
			int x = 204, z, y;
			Scanner leia = new Scanner(System.in);
			System.out.println("\t====FA�O PARTE====\n");
			
			System.out.println("Digite sua idade: ");
			z = leia.nextInt();
			leia.close();
			
			y = x - z;
			System.out.println("Nova Firburgo tem " + x + " Desses " + y + " foram antes de mim.\n");
			System.out.println("Mas os �ltimos " + z + " anos, contaram comigo!");
			
	}

}
