package br.com.Avaliacao_Eduardo_Dourado.ctr;

import br.com.Avaliacao_Eduardo_Dourado.dto.LutaDTO;
import br.com.Avaliacao_Eduardo_Dourado.dto.LutadorDTO;
import br.com.Avaliacao_Eduardo_Dourado.dao.LutaDAO;
import br.com.Avaliacao_Eduardo_Dourado.dao.ConexaoDAO;
import java.sql.ResultSet;

public class LutaCTR {
    
    LutaDAO lutaDAO = new LutaDAO();
    
    public LutaCTR(){
    
    }
    
    public String inserirLuta(LutaDTO lutaDTO, LutadorDTO lutador1, LutadorDTO lutador2) {
    try {
        if (lutaDAO.inserirProduto(lutaDTO, lutador1, lutador2)) {
            return "Luta Cadastrada com Sucesso!!";
        } else {
            return "Luta NÃO cadastrada";
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
        return "Luta NÃO cadastrada!!";
    }
}

    
    
    
    public String alterarLuta(LutaDTO lutaDTO, LutadorDTO lutador1, LutadorDTO lutador2) {
    try {
        if (lutaDAO.alterarProduto(lutaDTO, lutador1, lutador2)) {
            return "Luta Alterada com Sucesso!!";
        } else {
            return "Luta NÃO Alterada";
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
        return "Luta NÃO alterada!!";
    }
}

    
    public String excluirLuta(LutaDTO lutaDTO){
        try {
            // chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if (lutaDAO.excluirProduto(lutaDTO)) {
                return "Luta excluida com Sucesso!!";
            } else {
                return "Luta NÃO excluida";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Luta NÃO excluida!!";
        }
    }

    
    
    public ResultSet consultarLuta(LutaDTO lutaDTO, int opcao) {
        
        ResultSet rs = null;
        
        rs = lutaDAO.consultarProduto(lutaDTO, opcao);
        
        return rs;
    }
    
    public void CloseDB(){
        ConexaoDAO.CloseDB();
    }
    
}
