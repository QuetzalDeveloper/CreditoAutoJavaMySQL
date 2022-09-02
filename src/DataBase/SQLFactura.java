package DataBase;

public class SQLFactura {
    
    private String sql;

    public String DatosFactura(String contrato) {
        sql = "SELECT cliente.paterno, cliente.materno, cliente.nombre, auto.distribuidor, "
                + "auto.marca, auto.tipo, auto.ano, auto.color, auto.nserie, auto.nmotor, contrato.precio "
                + "FROM contrato, cliente, auto "
                + "WHERE contrato.id = '"+contrato+"' "
                + "AND contrato.idcliente = cliente.id "
                + "AND contrato.idauto = auto.idauto";
        return sql;
    }
    
    public String ObtenerSerie(String serie){
        sql = "select contrato.id, cliente.paterno, cliente .materno, cliente.nombre, "
                + "auto.marca, auto.tipo, auto.nserie, auto.nmotor, contrato.total "
                + "from auto, contrato, cliente where auto.nserie LIKE '"+serie+"%' "
                + "AND auto.idauto = contrato.idauto AND contrato.idcliente = cliente.id";
        return sql;
    }
    
    public String ObtenerNombre(String nombre){
        sql = "select contrato.id, cliente.paterno, cliente .materno, cliente.nombre, "
                + "auto.marca, auto.tipo, auto.nserie, auto.nmotor, contrato.total "
                + "from auto, contrato, cliente where cliente.nombre LIKE '"+nombre+"%' "
                + "AND cliente.id = contrato.idcliente AND contrato.idauto = auto.idauto";
        return sql;
    }
    
}
