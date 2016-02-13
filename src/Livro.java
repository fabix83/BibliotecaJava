
public class Livro {
	String nome;
	String descricao;
	private double valor;
	String isbn;
	private Autor autor;
	boolean ex;
	
	public Livro (Autor autor) {
		this.autor = autor;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	void mostrardetalhes() {
		String mensagem = "Mostrando detalhes do livro: ";
		System.out.println(mensagem);
		System.out.println(nome);
		System.out.println(descricao);
		
		if(this.temAutor()) {
			autor.mostrarDetalhes();	
		}
		
		System.out.println("--");
	}
	
	public boolean aplicaDesconto(double porcentagem) {
		if (porcentagem > 0.3){
			System.out.println("desconto maior que 30%");
			return false;
		} else {
			this.valor -= this.valor * porcentagem;
			return true;
		}
	}
	
	boolean temAutor() {
		return this.autor != null;
	}
	
	//funcao set
	void adicionaValor(double valor){
		this.valor = valor;
	}
	//funcao get
	double retornaValor(){
		return this.valor;
	}
}

