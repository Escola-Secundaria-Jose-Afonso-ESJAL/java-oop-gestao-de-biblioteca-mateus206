package src.main.java.com.example;

import java.util.ArrayList;

public class Biblioteca {
    private static final int MAX_LIVROS = 100; // Variável de classe
    private ArrayList<Livro> livros; // Variável de instância
    
    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public boolean adicionarLivro(Livro livro) {
        if (livros.size() >= MAX_LIVROS){
            System.out.println("a biblioteca tá cheia");
            return false;
        }
        
        for (Livro l : livros){
            if(l.getTitulo().equals(livro.getTitulo())){
                System.out.println("o livro foi adicionado");
                return false;
            }
        }
        
        livros.add(livro);
        return true;
    }
        
    public boolean removerLivro(String titulo) {
        for (Livro l : livros){
            if(l.getTitulo().equals(titulo)){
                System.out.println("diz o nome do livro");
                livros.remove(l);
                return true;
            }
        }
        return false;
    }

    public void listarLivros() {
        if(livros.size() == 0){
            System.out.println("este livro não tá na lista");
            return;
        }
        for(Livro l : livros){
            System.out.println(l.getTitulo() + "-" + l.getAutor() + "-" 
                + l.getAno()
            );
        }
    }
}
