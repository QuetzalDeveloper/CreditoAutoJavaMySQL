package DataBase;

public class SQLLoggin {
    
    private String sql;
    
    public String VerificarUsuario(String us){
        sql = "SELECT password, cargo FROM usuario WHERE id = '"+us+"'";
        return sql;
    }
    
}
