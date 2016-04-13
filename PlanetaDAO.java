
package etech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PlanetaDAO {
    
    public Planeta getPlaneta (String nomePlaneta) throws SQLException{
        String sql = "SELECT * FROM Planeta WHERE nome = ?";
        Connection conexao = DriverManager.getConnection(null);
        PreparedStatement estato = conexao.prepareStatement(sql);
        estato.setString(1, nomePlaneta);
        ResultSet resultado = estato.executeQuery();
        Planeta novo = null;
        if(resultado.next()){
            int[] coordenadas = new int[3];
            coordenadas[0] = resultado.getInt("x");
            coordenadas[1] = resultado.getInt("y");
            coordenadas[2] = resultado.getInt("z");
            novo = new Planeta(resultado.getString("nomePlaneta"), resultado.getString("tipo"), coordenadas);
        }
        resultado.close();
        estato.close();
        conexao.close();
        return novo;
    }
    
}
