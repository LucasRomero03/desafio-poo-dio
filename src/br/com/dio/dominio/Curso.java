package br.com.dio.dominio;

public class Curso  extends  Conteudo{

    private int cargaHorario;

    public Curso() {
    }

    public Curso(String titulo, String descricao, int cargaHorario) {
        super(titulo, descricao);
        this.cargaHorario = cargaHorario;
    }

    @Override
    public Double CalcularXP() {
        return XP_PADRAO * this.cargaHorario;
    }

    public int getCargaHorario() {
        return cargaHorario;
    }

    public void setCargaHorario(int cargaHorario) {
        this.cargaHorario = cargaHorario;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHorario=" + cargaHorario +
                '}';
    }
}
