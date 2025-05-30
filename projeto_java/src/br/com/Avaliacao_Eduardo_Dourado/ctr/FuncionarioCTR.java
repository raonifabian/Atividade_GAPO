package br.com.Avaliacao_Eduardo_Dourado.ctr;

import java.sql.ResultSet;
import br.com.Avaliacao_Eduardo_Dourado.dto.FuncionarioDTO;
import br.com.Avaliacao_Eduardo_Dourado.dao.FuncionarioDAO;
import br.com.Avaliacao_Eduardo_Dourado.dao.ConexaoDAO;

public class FuncionarioCTR {
    
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    
    public FuncionarioCTR(){
    }
    
    public String inserirFuncionario(FuncionarioDTO funcionarioDTO){
        try {
            if (funcionarioDAO.inserirFuncionario(funcionarioDTO)) {
                return "Funcionario Cadastrado com sucesso!";
            } else {
                return "Funcionario Não Cadastrado!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Funcionario NÃO Cadastrado!!!";
        }
    }

    public String alterarFuncionario(FuncionarioDTO funcionarioDTO) {
        try {
            if (funcionarioDAO.alterarFuncionario(funcionarioDTO)) {
                return "Funcionario Alterado com sucesso!!!";
            } else {
                return "Funcionario NÃO Alterado!!!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Funcionario NÃO Alterado!!!";
        }
    }
    
    public ResultSet consultarFuncionario(FuncionarioDTO funcionarioDTO, int opcao) {
        ResultSet rs = null;
        rs = funcionarioDAO.consultarFuncionario(funcionarioDTO, opcao);
        return rs;
    }
    
    public String logarFuncionario(FuncionarioDTO funcionarioDTO){
        return funcionarioDAO.logarFuncionario(funcionarioDTO);
    }
    
    public String excluirFuncionario(FuncionarioDTO funcionarioDTO) {
    try {
        if (funcionarioDAO.excluirFuncionario(funcionarioDTO)) {
            return "Funcionário Excluído com Sucesso!!!";
        } else {
            return "Funcionário NÃO Excluído!!!";
        }
    }
    catch (Exception e) {
        System.out.println(e.getMessage());
        return "Funcionário NÃO Excluído!!!";
    }
}

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
    
}


