package br.com.Avaliacao_Eduardo_Dourado.dao;

import br.com.Avaliacao_Eduardo_Dourado.dto.LutadorDTO;
import java.sql.*;
import java.text.SimpleDateFormat;

public class LutadorDAO {
    
    SimpleDateFormat data_format = new SimpleDateFormat("dd/mm/yyyy");
    private ResultSet rs = null;
    private Statement stmt = null;
    
    public boolean inserirLutador(LutadorDTO lutadorDTO){
        try{
            
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
        
            String comando = "Insert into lutador (nome_lut, nacionalidade_lut, apelido_lut, tel_lut, "
                    +"data_cad_lut) values ( "
                    +"'"+lutadorDTO.getNome_lut()+"', "
                    +"'"+lutadorDTO.getNacionalidade_lut()+"', "
                    +"'"+lutadorDTO.getApelido_lut() +"', "
                    +"'"+lutadorDTO.getTel_lut() +"', "
                    +"to_date('" + data_format.format(lutadorDTO.getData_cad_lut())+"','dd/MM/yyyy')) ";
        
            
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

    public ResultSet consultarLutador(LutadorDTO lutadorDTO, int opcao){

    try{
        ConexaoDAO.ConnectDB();
        stmt = ConexaoDAO.con.createStatement();
        String comando = "";
        switch(opcao){
            case 1:
                comando = "Select f.id_lut, f.nome_lut "
                        + "from lutador f "
                        + "where f.nome_lut like '"+lutadorDTO.getNome_lut()+"%' "
                        + "order by f.nome_lut";
            break;
            case 2:
                comando = "Select f.nome_lut, f.apelido_lut, f.nacionalidade_lut, f.tel_lut, "
                        + "to_char(f.data_cad_lut, 'dd/MM/yyyy') as data_cad_lut "
                        + "from lutador f "
                        + "where f.id_lut = "+lutadorDTO.getId_lut();
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

    public boolean alterarLutador(LutadorDTO lutadorDTO){
        
        try{
        ConexaoDAO.ConnectDB();
        
         stmt = ConexaoDAO.con.createStatement();
        
        String comando = "Update lutador set "
                + "nome_lut = '"+lutadorDTO.getNome_lut()+"', "
                + "nacionalidade_lut = '"+lutadorDTO.getNacionalidade_lut()+"', "
                + "apelido_lut = '"+lutadorDTO.getApelido_lut()+"', "
                + "tel_lut = '"+lutadorDTO.getTel_lut()+"', "
                + "data_cad_lut = to_date('"+data_format.format(lutadorDTO.getData_cad_lut())+"','dd/MM/yyyy') "
                + "where id_lut = "+lutadorDTO.getId_lut();
        
        
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
    
    public boolean excluirLutador(LutadorDTO lutadorDTO){
        try{
        ConexaoDAO.ConnectDB();
        
        stmt = ConexaoDAO.con.createStatement();
        
        String comando = "Delete from lutador where id_lut = "+lutadorDTO.getId_lut();
        
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
    
}




     
   
    
    