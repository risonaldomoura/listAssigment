package com.gabidev.listadetarefas.model;

import java.io.Serializable;

public class Tarefa implements Serializable {

    public static Long id;
    public String nomeTarefa;

    public Tarefa() {}

    public Tarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public static Long getId() {
        return id;
    }

    public static void setId(Long id) {
        Tarefa.id = id;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }
}
