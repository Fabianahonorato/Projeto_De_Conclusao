package pessoal.repositorio;

import pessoal.modelo.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class ItemRepositoryImpl implements ItemRepository {
	private List<Item> itens;

    public ItemReposityImpl() {
    	this.itens = new ArrayList<>();
    	
    }

    @Override 
    public void adicionarItem(Item item) {
    	this.itens.add(item);
    }

    @Override 
    public List<Item> listarTodosItens(){
    	return new ArrayList<>(this.itens);
    	
    }
    
    @Override
    public boolean removerItem(String titulo) {
    	return this.itens.removeIf(item -> item.getTitulo(). equalsIgnoreCase(titulo));
    }
}

