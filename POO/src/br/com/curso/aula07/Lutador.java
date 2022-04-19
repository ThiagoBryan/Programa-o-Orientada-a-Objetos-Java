package br.com.curso.aula07;


public class Lutador {
	//ATRIBUTOS
	
	private String nome;
	private String nacionalidade;
	private Integer idade;
	private double altura;
	private double peso;
	private String categoria;
	private Integer vitorias;
	private Integer derrotas;
	private Integer empates;
	
	//GETTERS AND SETTERS
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(Integer altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria(categoria);// assim vai para escolher um tipo de categoria linha 53;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		if(this.peso < 52.2) {
			this.categoria = "Inv�lido";
		}else if(this.peso <= 70.3) {
			this.categoria= "leve";
		}else if(this.peso <= 83.9) {
			this.categoria = "M�dio";
		}else if(this.peso <= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Inv�lido";
		}
	}
	public Integer getVitorias() {
		return vitorias;
	}
	public void setVitorias(Integer vitorias) {
		this.vitorias = vitorias;
	}
	public Integer getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(Integer derrotas) {
		this.derrotas = derrotas;
	}
	public Integer getEmpates() {
		return empates;
	}
	public void setEmpates(Integer empates) {
		this.empates = empates;
	}
	//CONSTRUTOR
	public Lutador(String nome, String nacionalidade, Integer idade, double altura, double peso,
			Integer vitorias, Integer derrotas, Integer empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		//ERROthis.peso = peso;
		this.setPeso(peso); //Vai para o setPeso;
		//this.categoria = categoria; vai escolher pelo peso; esta no setCategoria;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	
	//M�TODOS
	
	public void apresentar() {
		System.out.println("Nome: " + getNome());
		System.out.println("Nacionalidade:" + getNacionalidade());
		System.out.println("Idade: " + getIdade());
		System.out.println("Altura: " + getAltura());
		System.out.println("Peso: " + getPeso());
		System.out.println("Categoria: " + getCategoria());
		System.out.println("Vit�rias: " + getVitorias());
		System.out.println("Derrotas: " + getDerrotas());
		System.out.println("Empates: " + getEmpates());
 
	}
	
	public void status() {
		System.out.println("\t\t\t===Dados===\n");
		System.out.println(getNome());
		System.out.println("Peso: " + getPeso());
		System.out.println("� da categoria: " + getCategoria());
		System.out.println(getVitorias() + " vit�rias.");
		System.out.println(getDerrotas() + " derrotas.");
		System.out.println(getEmpates() + " empates.");
		}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
		
	}
	@Override
	public String toString() {
		return "Lutador [Nome: " + nome + ", Nacionalidade: " + nacionalidade + ", Idade: " + idade + ", Altura: " + altura
				+ ", Peso: " + peso + ", Categoria: " + getCategoria() + " Vitorias: " + vitorias + ", Derrotas: " + derrotas
				+ ", Empates: " + empates + "]";
	}
	
}

