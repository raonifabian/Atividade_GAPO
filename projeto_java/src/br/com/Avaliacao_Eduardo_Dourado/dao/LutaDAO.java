package br.com.Avaliacao_Eduardo_Dourado.dao;

import java.sql.*;
import br.com.Avaliacao_Eduardo_Dourado.dto.LutaDTO;
import br.com.Avaliacao_Eduardo_Dourado.dto.LutadorDTO;
import java.text.SimpleDateFormat;

public class LutaDAO {
    
    public LutaDAO() {
    
    }

    private ResultSet rs = null;
    private Statement stmt = null;

    public boolean inserirProduto(LutaDTO lutaDTO, LutadorDTO lutador1, LutadorDTO lutador2){
    try{
        ConexaoDAO.ConnectDB();
        
        stmt = ConexaoDAO.con.createStatement();
        
        String comando = "Insert into luta (nome_combate, cod_combate, "
                + "custo_aposta_combate, id_lutador1, id_lutador2) values( "
                +"'"+ lutaDTO.getNome_combate()+"', "
                +"'"+ lutaDTO.getCod_combate()+"', "
                +lutaDTO.getCusto_aposta_combate()+", "
                +lutador1.getId_lut()+", "
                +lutador2.getId_lut()+") ";
        
        stmt.execute(comando.toUpperCase());
            
        ConexaoDAO.con.commit();
        stmt.close();
         return true;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        finally{
            ConexaoDAO.CloseDB();
        }
    }

    public boolean alterarProduto (LutaDTO lutaDTO, LutadorDTO lutador1, LutadorDTO lutador2){
    try{
        ConexaoDAO.ConnectDB();
        
        stmt = ConexaoDAO.con.createStatement();
        
        String comando = "Update luta set "
                +"nome_combate = '"+lutaDTO.getNome_combate()+"', "
                +"cod_combate = '"+lutaDTO.getCod_combate()+"', "
                +"custo_aposta_combate = "+lutaDTO.getCusto_aposta_combate()+", "
                +"id_lutador1 = "+lutador1.getId_lut()+", "
                +"id_lutador2 = "+lutador2.getId_lut()+" "
                +"where id_combate = "+lutaDTO.getId_combate();
   
        stmt.execute(comando.toUpperCase());

        ConexaoDAO.con.commit();
        stmt.close();
        return true;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        finally{
            ConexaoDAO.CloseDB();
        }
    }

    public boolean excluirProduto(LutaDTO lutaDTO){
        try{
        ConexaoDAO.ConnectDB();
        
        stmt = ConexaoDAO.con.createStatement();
        
        String comando = "Delete from luta where id_combate = "+lutaDTO.getId_combate();
        
        stmt.execute(comando);
            
        ConexaoDAO.con.commit();
        stmt.close();
        return true;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        finally{
            ConexaoDAO.CloseDB();
        }
    }
    
    public ResultSet consultarProduto(LutaDTO lutaDTO, int opcao){

    try{
        ConexaoDAO.ConnectDB();
        stmt = ConexaoDAO.con.createStatement();
        String comando = "";
        
        switch(opcao){
            case 1:
                comando = "Select p.* "
                        + "from luta p "
                        + "where p.nome_combate ilike '"+lutaDTO.getNome_combate()+"%' "
                        + "order by p.nome_combate";
            break;
            case 2:
                comando = "SELECT p.*, "
                        + "l1.nome_lut AS lutador1_nome, l1.id_lut AS lutador1_id, "
                        + "l2.nome_lut AS lutador2_nome, l2.id_lut AS lutador2_id "
                        + "FROM luta p "
                        + "JOIN lutador l1 ON p.id_lutador1 = l1.id_lut "
                        + "JOIN lutador l2 ON p.id_lutador2 = l2.id_lut "
                        + "WHERE p.id_combate = " + lutaDTO.getId_combate();
            break;

        }
        
        rs = stmt.executeQuery(comando.toUpperCase());
        return rs;
    }
    catch (Exception e){
        System.out.println(e.getMessage());
        return rs;
    }
    }
    
}






    




