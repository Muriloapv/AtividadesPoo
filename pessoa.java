//Crie uma classe Java (versão 17) Pessoa com os atributos Nome, Data de Nascimento e Idade.
//Crie no mínimo três Construtores e métodos (getters e setters).

package org.example.domain;

import org.example.domain.enums.EstadoCivil;

public abstract class Pessoa {

    private String nome;
    private EstadoCivil estadoCivil;

    public Pessoa(String nome, EstadoCivil estadoCivil) {
        this.nome = nome;
        this.estadoCivil = estadoCivil;
    }

    public String getNome() {
        return nome;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }
}
