package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public void ordenarAscendente() {
    } 

    public List<Pessoa> ordernarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);  
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);    
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura; 
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.78);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 22, 1.88);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 18, 1.64);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 45, 1.67);

        System.out.println(ordenacaoPessoa.pessoaList);

        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.ordernarPorIdade());
    }
}