package OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(Set<Convidado> convidadoSet) {
        this.convidadoSet = new HashSet<>();
    }
    
    public void adicionarConvidadoSet(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        
        conjuntoConvidados.adicionarConvidadoSet("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidadoSet("Convidado 2", 1233);
        conjuntoConvidados.adicionarConvidadoSet("Convidado 3", 1234);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

    }
        
    }
