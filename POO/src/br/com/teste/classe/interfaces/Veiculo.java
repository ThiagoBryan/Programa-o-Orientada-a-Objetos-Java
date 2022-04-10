//Interface vai obrigar os atributos serem o que foram específicados e também obriga a 
//implementar todos os métodos que tiver;
package br.com.teste.classe.interfaces;

public interface Veiculo {
			
		//metodos
		public void andar();
		public void desligar();
}



//A interface é um recurso muito utilizado em Java, bem como na maioria das linguagens orientadas 
//a objeto, para “obrigar” a um determinado grupo de classes a ter métodos ou propriedades em comum 
//para existir em um determinado contexto, contudo os métodos podem ser implementados em cada classe 
//de uma maneira diferente. Pode-se dizer, a grosso modo, que uma interface é um contrato que quando 
//assumido por uma classe deve ser implementado.
