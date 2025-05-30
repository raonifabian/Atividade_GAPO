package br.com.Avaliacao_Eduardo_Dourado.ctr;

import br.com.Avaliacao_Eduardo_Dourado.dao.ConexaoDAO;
import br.com.Avaliacao_Eduardo_Dourado.dao.ApostaDAO;
import br.com.Avaliacao_Eduardo_Dourado.dto.ApostaDTO;
import br.com.Avaliacao_Eduardo_Dourado.dto.ApostadorDTO;
import javax.swing.JTable;

public class ApostaCTR {

    private final ApostaDAO apostaDAO = new ApostaDAO();

    public ApostaCTR() {
    }

    public String inserirAposta(ApostaDTO apostaDTO, ApostadorDTO apostadorDTO, JTable lutas) {
        try {
            if (apostaDAO.inserirAposta(apostaDTO, apostadorDTO, lutas)) {
                return "Aposta feita com sucesso!";
            } else {
                return "Aposta não realizada.";
            }
        } catch (Exception e) {
            System.out.println("Erro ao inserir aposta: " + e.getMessage());
            return "Erro: Aposta não realizada.";
        }
    }

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
}
