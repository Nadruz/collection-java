package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    private List<Livro> livroList;

    public CatalagoLivros() {
        this.livroList = new ArrayList<>();
    }
    
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livroPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livroPorIntervaloAnos.add(l);
                }
            }
        }
        return livroPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();
        catalagoLivros.adicionarLivro("livro 1", "Autor 1", 2020);
        catalagoLivros.adicionarLivro("livro 1", "Autor 2", 2021);
        catalagoLivros.adicionarLivro("livro 2", "Autor 3", 2022);
        catalagoLivros.adicionarLivro("livro 3", "Autor 3", 2023);
        catalagoLivros.adicionarLivro("livro 4", "Autor 4", 2024);
        
        System.out.println(catalagoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalagoLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(catalagoLivros.pesquisarPorTitulo("livro 1"));
    }    
}
