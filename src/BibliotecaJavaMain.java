
public class BibliotecaJavaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Autor autor = new Autor();
		autor.nome = "Rodrigo Turini";
		autor.email = "rodrigo@hotmail.com";
		
		Livro livro = new Livro();
		livro.nome="Java 8";
		livro.descricao = "Novos Paradigmas";
		
		//exemplo de encapsulamento. atributo valor é private.
		livro.adicionaValor(59.99);
		
		livro.isbn="978-85-00000-00-0";
		livro.autor = autor;
		
		livro.mostrardetalhes();
		
		Livro outroLivro = new Livro();
		outroLivro.nome = "Logica";
		outroLivro.descricao = "Do Básico ao Avançado";
		
		outroLivro.mostrardetalhes();
		
	}

}

