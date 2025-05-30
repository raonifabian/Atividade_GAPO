package br.com.Avaliacao_Eduardo_Dourado.dao;

import java.sql.*;
import br.com.Avaliacao_Eduardo_Dourado.dto.ApostadorDTO;

public class ApostadorDAO {
    
    public  ApostadorDAO() {
    
    }
    
    private ResultSet rs = null;
    private Statement stmt = null;

    public boolean inserirApostador(ApostadorDTO apostadorDTO){
           try{
               ConexaoDAO.ConnectDB();
               stmt = ConexaoDAO.con.createStatement();
               String comando = "Insert into apostador (nome_apo, logradouro_apo, numero_apo, " +
                 "bairro_apo, cidade_apo, estado_apo, cep_apo, cpf_apo) values ( " + 
                 "'" + apostadorDTO.getNome_apo() + "', " +
                 "'" + apostadorDTO.getLogradouro_apo() + "', " +
                 apostadorDTO.getNumero_apo() + ", " +
                 "'" + apostadorDTO.getBairro_apo() + "', " +
                 "'" + apostadorDTO.getCidade_apo() + "', " +
                 "'" + apostadorDTO.getEstado_apo() + "', " +
                 "'" + apostadorDTO.getCep_apo() + "', " +
                 "'" + apostadorDTO.getCpf_apo() + "')";
               
               stmt.execute(comando.toUpperCase());
               ConexaoDAO.con.commit();
               stmt.close();
               return true;
 
           }
           catch(Exception e){
            System.out.println("Problema ao abrir a base de dados! " +
                    e.getMessage());
            return false;
        }
           finally{
               ConexaoDAO.CloseDB();
           }
    }

    public ResultSet consultarApostador(ApostadorDTO apostadorDTO, int opcao){
           try{
               ConexaoDAO.ConnectDB();         
               stmt = ConexaoDAO.con.createStatement();
               String comando = "";
               
               switch(opcao){
                   case 1:
                       comando = "Select c.* " +
                               "from apostador c " + 
                               "where nome_apo like '" + apostadorDTO.getNome_apo() + "%' " + 
                               "order by c.nome_apo";
                       break;
                       
                   case 2:
                       comando = "Select c.* " +
                               "from apostador c " + 
                               "where c.id_apo = " + apostadorDTO.getId_apo();
                       break;
                       
                   case 3:
                       comando = "Select c.id_apo, c.nome_apo " + 
                               "from apostador c ";
                       break;
               }
               rs = stmt.executeQuery(comando.toUpperCase());
               return rs;
               
           }
           catch(Exception e){
            System.out.println(e.getMessage());
            return rs;
        }
    }

    public boolean alterarApostador(ApostadorDTO apostadorDTO){
           try{
               ConexaoDAO.ConnectDB();
               stmt = ConexaoDAO.con.createStatement();
               String comando = "UPDATE apostador SET " +
                 "nome_apo = '" + apostadorDTO.getNome_apo() + "', " +
                 "logradouro_apo = '" + apostadorDTO.getLogradouro_apo() + "', " +
                 "numero_apo = " + apostadorDTO.getNumero_apo() + ", " +
                 "bairro_apo = '" + apostadorDTO.getBairro_apo() + "', " +
                 "cidade_apo = '" + apostadorDTO.getCidade_apo() + "', " +
                 "estado_apo = '" + apostadorDTO.getEstado_apo() + "', " +
                 "cep_apo = '" + apostadorDTO.getCep_apo() + "', " +
                 "cpf_apo = '" + apostadorDTO.getCpf_apo() + "' " +
                 "WHERE id_apo = " + apostadorDTO.getId_apo();
               
               stmt.execute(comando.toUpperCase()); 
               ConexaoDAO.con.commit();
               stmt.close();
               return true;
 
           }
           catch(Exception e){
            System.out.println("Problema ao abrir a base de dados! " +
                    e.getMessage());
            return false;
        }
           finally{
               ConexaoDAO.CloseDB();
           }
    }
    
    public boolean excluirApostador(ApostadorDTO apostadorDTO){
           try{
               ConexaoDAO.ConnectDB();
               stmt = ConexaoDAO.con.createStatement();
               String comando = "Delete from apostador where id_apo =  " + apostadorDTO.getId_apo();
                
               stmt.execute(comando.toUpperCase());
               ConexaoDAO.con.commit();
               stmt.close();
               return true;
 
           }
           catch(Exception e){
            System.out.println("Problema ao abrir a base de dados! " +
                    e.getMessage());
            return false;
        }
           finally{
               ConexaoDAO.CloseDB();
           }
    }

}





       
       
       
       
       
       
       
       
       
       
