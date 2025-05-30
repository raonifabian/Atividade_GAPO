package br.com.Avaliacao_Eduardo_Dourado.dao;

import br.com.Avaliacao_Eduardo_Dourado.dto.ApostaDTO;
import br.com.Avaliacao_Eduardo_Dourado.dto.ApostadorDTO;
import java.nio.channels.ClosedByInterruptException;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JTable;

public class ApostaDAO {
    
    public ApostaDAO(){
    
    }

    private ResultSet rs = null;
    Statement stmt = null;
    Statement stmt1 = null;
    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
    
    public boolean inserirAposta(ApostaDTO apostaDTO, ApostadorDTO apostadorDTO, JTable lutas){
        try{
            ConexaoDAO.ConnectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            stmt1 = ConexaoDAO.con.createStatement();
            
            String comando1 = "Insert into aposta (dat_aposta, custo_aposta_combate, " +
                    "id_apo) values ( " 
                    + "to_date ('" + date.format(apostaDTO.getDat_aposta()) + "', 'DD/MM/YYYY'), " +
                    apostaDTO.getCusto_aposta_combate() + ", " + apostadorDTO.getId_apo() + ")";
            
            stmt.execute(comando1.toUpperCase(), Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            rs.next();
            
            for(int cont = 0; cont < lutas.getRowCount(); cont++){
                String comando2 = "Insert into luta_aposta (id_aposta, id_combate, "
                        + "custo_aposta_combate, qtd_apostada) values ( " 
                        + rs.getInt("id_aposta") + ", "
                        + lutas.getValueAt(cont, 0) + ", "
                        + lutas.getValueAt(cont, 2) + ", "
                        + lutas.getValueAt(cont, 3) + "); ";
                stmt1.execute(comando2);
            }            
            
            ConexaoDAO.con.commit();
            stmt.close();
            stmt1.close();
            rs.close();
            
            return true;          
        }
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            
            return false;
        }
        finally{
            ConexaoDAO.CloseDB();
        }
    }
    
}


    
    