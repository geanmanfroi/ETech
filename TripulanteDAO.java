/**
 *
 * @author André
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TripulanteDAO {
    
     public Tripulante getTripulante (String nomeTripulante) throws SQLException{
        String sql = "SELECT * FROM Tripulante WHERE nomeTripulante = ?";
        Connection conexao = DriverManager.getConnection(null);
        PreparedStatement estato = conexao.prepareStatement(sql);
        estato.setString(1, nomeTripulante);
        ResultSet resultado = estato.executeQuery();
        Tripulante novo = null;
        if(resultado.next()){
          
          
            novo = new Tripulante(resultado.getString("nomeTripulante"), resultado.getString("funcao"), resultado.getString("endereco"), resultado.getInt("classificacao"), resultado.getInt("cpf"), resultado.getInt("rg"));
            
            
        }
        resultado.close();
        estato.close();
        conexao.close();
        return novo;
    }
    
    
    
}
