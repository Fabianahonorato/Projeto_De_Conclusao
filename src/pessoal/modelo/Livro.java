package pessoal.modelo;

public class Livro extends Item {
   private String isbn;
   private int anoPublicacao;
   
   public Livro(String titulo, String autorArtista, Categoria categoria, String isbn, int anoPublicado) {
	   super(titulo, autorArtista, categoria);
	   this.isbn = isbn;
	   this.anoPublicacao = anoPublicacao;
	   
   }
   
   public String getIsbn() {
	   return isbn;
   }
  
   @Override
   public String getTipo() {
	   return "Livro";
   }
   @Override 
   public String toString() {
	  return super.toString() + ", Tipo: Livro, ISBN: " + isbn + ", Ano: " + anoPublicacao;
  }
}


