package pessoal.repositorio;

import pessoal.modelo.Item;
import java.util.List;

public interface ItemRepository {
  void adicionarItem(Item item);
  List<Item> listarTodosItens();
  List<Item> listarItensPorCategoria(String categoria);
  boolean removerItem(String titulo);
	
	
	
	
	
	
}
