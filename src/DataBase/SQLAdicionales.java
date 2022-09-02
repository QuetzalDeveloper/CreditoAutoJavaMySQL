package DataBase;

public class SQLAdicionales {
    
    private String sql;
    
    public String CambiarValor(int a, double b){
        sql = "UPDATE adicionales SET valor = "+b+" WHERE id = "+a;
        return sql;
    }
    
    public String ConsultarFacturaSaldo(){
        sql = "SELECT * FROM adicionales";
        return sql;
    }
    
}
