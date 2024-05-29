package Livraria;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	private List<Livros> livrolist;

	public CatalogoLivros() {
 		this.livrolist = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livrolist.add(new Livros(titulo, autor, anoPublicacao));
	}

    public List<Livros> pesquisaAutor(String autor) {
		List<Livros> livroPorAutor = new ArrayList<>();
    	if (!livrolist.isEmpty()) {
           for (Livros l : livrolist) {
        	   if (l.getAutor().equalsIgnoreCase(autor)) {
        		   livroPorAutor.add(l);
        		}
           }
    	}
    	return livroPorAutor;
    }

    public List<Livros> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
    	List<Livros> livroPorIntervaloAno = new ArrayList<>();
    	if (!livrolist.isEmpty()) {
    		for (Livros l : livrolist) {
    	       if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal  ) {
    	       	   livroPorIntervaloAno.add(l);
    	       	}
    	    }	
    	}
    	
    	return livroPorIntervaloAno;
    }
    	
    
    public Livros pesquisaPorTitulo(String titulo) {
        Livros livrosPorTitulo = null;
    	if (!livrolist.isEmpty()) {
    		for (Livros l : livrolist) {
    	       if (l.getTitulo().equalsIgnoreCase(titulo)) {
    	       	   livrosPorTitulo = l;
    	       	   break;
    	       	}
    	    }	
    	}
       
    	return livrosPorTitulo;
    }
    
    public static void main(String[] args) {
		CatalogoLivros catalogosLivros = new CatalogoLivros();
		
		catalogosLivros.adicionarLivro("Livro1","Autor1", 2015);
		catalogosLivros.adicionarLivro("Livro2","Autor2", 2017);
		catalogosLivros.adicionarLivro("Livro3","Autor1", 2018);
		catalogosLivros.adicionarLivro("Livro4","Autor3", 2020);
		catalogosLivros.adicionarLivro("Livro2","Autor1", 2020);
		
		
	    System.out.println(catalogosLivros.pesquisaAutor("Autor1"));
	    System.out.println(catalogosLivros.pesquisaPorIntervaloAnos(2020,2020));
	    System.out.println(catalogosLivros.pesquisaPorTitulo("Livro4"));

      }
    	
}
