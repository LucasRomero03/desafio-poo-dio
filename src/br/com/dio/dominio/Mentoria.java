package br.com.dio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria() {

    }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo,descricao);
        this.data = data;
    }

    @Override
    public Double CalcularXP() {
        return XP_PADRAO + 10d;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
