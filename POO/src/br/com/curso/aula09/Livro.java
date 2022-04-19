package br.com.curso.aula09;

public class Livro implements Publicacao {
	// ATRIBUTOS

	private String titulo;
	private String autor;
	private Integer totalPaginas;
	private Integer paginaAtual;
	private boolean aberto;
	private String leitor;

	// METODOS esta no To String
//		public void detalhes() {
//			
//		}
//		
	// GETTERS AND SETTERS

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(Integer totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public Integer getPaginaAtual() {
		return paginaAtual;
	}

	public void setPaginaAtual(Integer paginaAtual) {
		this.paginaAtual = paginaAtual;
	}

	public boolean getAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public String getLeitor() {
		return leitor;
	}

	public void setLeitor(String leitor) {
		this.leitor = leitor;
	}

	// CONSTRUTOR
	public Livro(String titulo, String autor, Integer totalPaginas, Integer paginaAtual, boolean aberto,
			String leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.paginaAtual = paginaAtual;
		this.aberto = aberto;
		this.leitor = leitor;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Livro [Titulo: " + titulo + ", Autor: " + autor + ", TotalPaginas: " + totalPaginas + ", PaginaAtual: "
				+ paginaAtual + ", Aberto: " + aberto + ", Leitor: " + leitor + "]";
	}

	// INTERFACE

	@Override
	public void abrir() {
		this.aberto = true;

	}

	@Override
	public void fechar() {
		this.aberto = false;

	}

	@Override
	public void folhear(Integer pagina) {
		if (pagina > this.totalPaginas) {
			System.out.println(this.paginaAtual = 0);
			System.out.println("Não existe esse numero de páginas.");
		} else {
			this.paginaAtual = pagina;
		}

	}

	@Override
	public void avancarPagina() {
		this.setPaginaAtual(getPaginaAtual() + 1);
		System.out.println("Você avançou uma página.");
	}

	@Override
	public void voltarPagina() {
		this.setPaginaAtual(getPaginaAtual() - 1);
		System.out.println("Você voltou uma página.");
	}
}
