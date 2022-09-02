package DataBase;

public class SQLEmpleados {
    
    private String sql;
    
    public String TodoEmpleados(){
        sql = "SELECT * FROM usuario";
        return sql;
    }
    
    public String ConsultarClave(String clave){
        sql = "SELECT * FROM usuario WHERE id = '"+clave+"'";
        return sql;
    }
    
    public String GuardarEmpleado(String cu, String pa, String ma, String no, String te, int ca, String co){
        pa = pa.toUpperCase();
        ma = ma.toUpperCase();
        no = no.toUpperCase();
        sql = "INSERT INTO usuario VALUES('"+cu+"','"+pa+"','"+ma+"','"+no+"','"+te+"',"+ca+",'"+co+"')";
        return sql;
    }
    
    public String ConsultarEmpleado(String clave){
        sql = "SELECT * FROM usuario WHERE id = '"+clave+"'";
        return sql;
    }
    
    public String EditarEmpleado(String cu, String ncu, String pa, String ma, String no, String te, int ca, String co){
        pa = pa.toUpperCase();
        ma = ma.toUpperCase();
        no = no.toUpperCase();
        sql = "UPDATE usuario SET id = '"+ncu+"', paterno = '"+pa+"', materno = '"+ma+"',"
                + "nombre = '"+no+"', telefono = '"+te+"',cargo = "+ca+", password = '"+co+"' WHERE id = '"+cu+"'";
        return sql;
    }

    public String EliminarEmpleado(String cuenta) {
        sql = "DELETE FROM usuario WHERE id = '"+cuenta+"'";
        return sql;
    }

    public String EliminarCuentaEmpleado(String cuenta) {
        sql = "DROP USER '"+cuenta+"'@'%'";
        return sql;
    }

    public String GenerarCuentaMysql(String clave, String password) {
        sql = "CREATE USER '"+clave+"'@'%' IDENTIFIED BY '"+password+"'";
        return sql;
    }

    public String PermisosCuentaMysql(String clave, String password) {
        sql = "GRANT ALL ON *.* TO '"+clave+"'@'%' IDENTIFIED BY '"+password+"' WITH GRANT OPTION";
        return sql;
    }
    
}
