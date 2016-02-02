
public class Livro {
	String nome;
	String descricao;
	double valor;
	String isbn;
	Autor autor;
	boolean ex;
	
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
	
	public void aplicaDesconto(double porcentagem) {
		this.valor -= this.valor * porcentagem;
	}
	
	boolean temAutor() {
		return this.autor != null;
	}
}

