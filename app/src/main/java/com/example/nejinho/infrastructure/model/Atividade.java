package com.example.nejinho.infrastructure.model;
import com.orm.SugarRecord;

import java.util.Date;

public class Atividade extends SugarRecord{
    private int Id;
    private String Nome;
    private String Enunciado;
    private Date Data;
    private String Guid;

    public int getIdAtividade() {
        return Id;
    }
    public void setIdAtividade(int id) {
        Id = id;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getEnunciado() {
        return Enunciado;
    }
    public void setEnunciado(String enunciado) {
        Enunciado = enunciado;
    }
    public Date getData() {
        return Data;
    }
    public void setData(Date data) {
        Data = data;
    }
    public void setGuid(String guid) {
        Guid = guid;
    }
    public String getGuid() {
        return Guid;
    }
}
