package br.com.Avaliacao_Eduardo_Dourado.dto;

public class LutaDTO {
    private String nome_combate, cod_combate;
    private double custo_aposta_combate;
    private int id_combate;

    public String getNome_combate() {
        return nome_combate;
    }

    public void setNome_combate(String nome_combate) {
        this.nome_combate = nome_combate;
    }

    public String getCod_combate() {
        return cod_combate;
    }

    public void setCod_combate(String cod_combate) {
        this.cod_combate = cod_combate;
    }

    public double getCusto_aposta_combate() {
        return custo_aposta_combate;
    }

    public void setCusto_aposta_combate(double custo_aposta_combate) {
        this.custo_aposta_combate = custo_aposta_combate;
    }

    public int getId_combate() {
        return id_combate;
    }

    public void setId_combate(int id_combate) {
        this.id_combate = id_combate;
    }
}
