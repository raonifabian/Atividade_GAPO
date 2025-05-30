package br.com.Avaliacao_Eduardo_Dourado.ctr;

import java.sql.ResultSet;
import br.com.Avaliacao_Eduardo_Dourado.dto.LutadorDTO;
import br.com.Avaliacao_Eduardo_Dourado.dao.LutadorDAO;
import br.com.Avaliacao_Eduardo_Dourado.dao.ConexaoDAO;

public class LutadorCTR {
    LutadorDAO lutadorDAO = new LutadorDAO();
    
    public LutadorCTR(){
        
    }
    
    public String inserirLutador(LutadorDTO lutadorDTO) {
        try{
            //chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if(lutadorDAO.inserirLutador(lutadorDTO)){
                return "Lutador Cadastro com Sucesso!!";
            }else{
                return "Lutador NÃO cadastrado";
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Lutador NÃO cadastrado!!";
        }
    }
    
    public ResultSet consultarLutador(LutadorDTO lutadorDTO, int opcao) {
        
        ResultSet rs = null;
        
        rs = lutadorDAO.consultarLutador(lutadorDTO, opcao);
        
        return rs;
    }
    
    public void CloseDB(){
        ConexaoDAO.CloseDB();
    }

    public String alterarLutador(LutadorDTO lutadorDTO) {
        try{
            //chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if(lutadorDAO.alterarLutador(lutadorDTO)){
                return "Lutador Alterado com Sucesso!!";
            }else{
                return "Lutador NÃO Alterado";
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Lutador NÃO alterado!!";
        }
    }

    public String excluirLutador(LutadorDTO lutadorDTO) {
        try{
            //chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if(lutadorDAO.excluirLutador(lutadorDTO)){
                return "Lutador Excluído com Sucesso!!";
            }else{
                return "Lutador NÃO Excluído";
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Lutador NÃO deletado!!";
        }
    }
}
