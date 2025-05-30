package br.com.Avaliacao_Eduardo_Dourado.dto;

import java.util.Date;

public class LutadorDTO {
    private String nome_lut, apelido_lut, tel_lut, nacionalidade_lut;
    private Date data_cad_lut;
    private int id_lut;

    public String getNome_lut() {
        return nome_lut;
    }

    public void setNome_lut(String nome_lut) {
        this.nome_lut = nome_lut;
    }

    public String getApelido_lut() {
        return apelido_lut;
    }

    public void setApelido_lut(String apelido_lut) {
        this.apelido_lut = apelido_lut;
    }

    public String getTel_lut() {
        return tel_lut;
    }

    public void setTel_lut(String tel_lut) {
        this.tel_lut = tel_lut;
    }

    public String getNacionalidade_lut() {
        return nacionalidade_lut;
    }

    public void setNacionalidade_lut(String nacionalidade_lut) {
        this.nacionalidade_lut = nacionalidade_lut;
    }

    public Date getData_cad_lut() {
        return data_cad_lut;
    }

    public void setData_cad_lut(Date data_cad_lut) {
        this.data_cad_lut = data_cad_lut;
    }

    public int getId_lut() {
        return id_lut;
    }

    public void setId_lut(int id_lut) {
        this.id_lut = id_lut;
    }

    
}
