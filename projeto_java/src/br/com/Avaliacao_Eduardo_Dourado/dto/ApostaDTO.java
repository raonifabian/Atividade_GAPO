package br.com.Avaliacao_Eduardo_Dourado.dto;

import java.util.Date;

public class ApostaDTO {
    private int id_aposta;
    private double custo_aposta_combate;
    private Date dat_aposta;

    public int getId_aposta() {
        return id_aposta;
    }

    public void setId_aposta(int id_aposta) {
        this.id_aposta = id_aposta;
    }

    public double getCusto_aposta_combate() {
        return custo_aposta_combate;
    }

    public void setCusto_aposta_combate(double custo_aposta_combate) {
        this.custo_aposta_combate = custo_aposta_combate;
    }

     
    

    public Date getDat_aposta() {
        return dat_aposta;
    }

    public void setDat_aposta(Date dat_aposta) {
        this.dat_aposta = dat_aposta;
    }
}
