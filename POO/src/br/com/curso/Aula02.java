package br.com.curso;

import br.com.curso.aula03.Caneta03;
import br.com.curso.aula03.VideoGame03;

public class Aula02 {

	public static void main(String[] args) {
								//(criando novo objeto)
		//(classe) (objeto) = (new=construtor) (classe)		
			Caneta02 	c1 		= 		new 		Caneta02();
			
			// colocando os atributos
//(objeto.atributo) = ("caracteristica do novo objeto")
			c1.cor = "Azul";
			//c1.ponta = 0.5;
			c1.carga = 90.0;
			c1.tampar();
			c1.status();// estado dela que esta declarado na classe Caneta;
			c1.rabiscar();
			
			System.out.println();
			
			Caneta02 c2 = new Caneta02();
			c2.modelo = "BIC";
			c2.cor = "Preta";
			//c2.ponta = 0.7;
			c2.carga = 10;
			c2.destampar();
			c2.status();
			c2.rabiscar();
			
			System.out.println();
			
			VideoGame02 ps = new VideoGame02();
			
			ps.modelo = "Ps5";
			ps.cor = "Branco";
			ps.desligar();
			ps.status();
			ps.jogar();
			
			
			
			
	}

}
