package br.com.Avaliacao_Eduardo_Dourado.ctr;

import java.sql.ResultSet;
import br.com.Avaliacao_Eduardo_Dourado.dto.ApostadorDTO;
import br.com.Avaliacao_Eduardo_Dourado.dao.ApostadorDAO;
import br.com.Avaliacao_Eduardo_Dourado.dao.ConexaoDAO;

public class ApostadorCTR {
    
    ApostadorDAO apostadorDAO = new ApostadorDAO();
    
    public ApostadorCTR(){
        
    }
    public String inserirApostador(ApostadorDTO apostadorDTO){
        try{
            if (apostadorDAO.inserirApostador(apostadorDTO)){
                return "Apostador Cadastrado com sucesso";
            }
            else{
                return "Apostador não cadastrado";
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Apostador NÃO cadastrado";
        }
    }
    
    public ResultSet consultarApostador(ApostadorDTO apostadorDTO, int opcao){
        ResultSet rs = null;
        rs = apostadorDAO.consultarApostador(apostadorDTO, opcao);
        return rs;
    }
    
    public void CloseDB(){
        ConexaoDAO.CloseDB();
    }
    
    public String alterarApostador(ApostadorDTO apostadorDTO){
        try{
            if (apostadorDAO.alterarApostador(apostadorDTO)){
                return "Apostador Alterado com sucesso!!!";
            } else{
                return "Apostador NÃO ALTERADO!!!";
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Apostador NÃO alterado";
        }
    }
    
    public String excluirApostador(ApostadorDTO apostadorDTO){
        try{
            if (apostadorDAO.excluirApostador(apostadorDTO)){
                return "Apostador excluído com sucesso!!!";
            } else{
                return "Apostador NÃO EXCLUÍDO!!!";
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Apostador NÃO excluído";
        }
    }
    
}
