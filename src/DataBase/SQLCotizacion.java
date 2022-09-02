package DataBase;

public class SQLCotizacion {
    
    private String sql;
    
    public String CabeceraAnexo(String contrato){
        sql = "SELECT contrato.precio, contrato.financiamiento, contrato.enganche, cotizacion.mensualidad, cotizacion.plazo, cliente.paterno, cliente.materno, cliente.nombre, cotizacion.tasi, contrato.idcotizacion, contrato.intereses FROM contrato, cotizacion, cliente WHERE contrato.id = '"+contrato+"' AND cotizacion.id = contrato.idcotizacion AND cliente.id = contrato.idcliente;";
        return sql;
    }
    
    public String ObtenerCotizacion(int folio){
        sql = "SELECT * FROM cotizacion WHERE id = "+folio;
        return sql;
    }
    
    public String ComisionCero(){
        sql = "Select * from adicionales where id = 2";
        return sql;
    }
    
    public String EliminarCotizacion(int id){
        sql = "DELETE FROM cotizacion where id = "+id;
        return sql;
    }
    
    public String EliminarAuto(int id){
        sql = "DELETE FROM auto where idauto = "+id;
        return sql;
    }
    
    public String ConsultarCotizacionesAntesFecha(String fecha){
        sql = "SELECT * FROM cotizacion WHERE fecha <= '"+fecha+"'";
        return sql;
    }
    
    public String ConsultarFolioCotizacion(int x){
        sql = "SELECT cotizacion.id, cliente.paterno, cliente.materno, cliente.nombre, auto.marca, auto.tipo, auto.ano, cotizacion.fecha, cotizacion.mensualidad, cotizacion.plazo "
                + "FROM cotizacion, cliente, auto "
                + "WHERE cotizacion.id = "+x+" "
                + "&& cotizacion.idCliente = cliente.id "
                + "&& cotizacion.idAuto = auto.idauto";
        return sql;
    }
    
    public String ConsultarClienteCotizacion(String x){
        sql = "SELECT cotizacion.id, cliente.paterno, cliente.materno, cliente.nombre, auto.marca, auto.tipo, auto.ano, cotizacion.fecha, cotizacion.mensualidad, cotizacion.plazo "
                + "FROM cotizacion, cliente, auto "
                + "WHERE cotizacion.idCliente = cliente.id "
                + "&& cotizacion.idAuto = auto.idauto "
                + "&& (cliente.paterno LIKE '"+x+"%' OR cliente.materno LIKE '"+x+"%' OR cliente.nombre LIKE '"+x+"%')";
        return sql;
    }
    
    public String ConsultarFechaCotizacion(String x){
        sql = "SELECT cotizacion.id, cliente.paterno, cliente.materno, cliente.nombre, auto.marca, auto.tipo, auto.ano, cotizacion.fecha, cotizacion.mensualidad, cotizacion.plazo "
                + "FROM cotizacion, cliente, auto "
                + "WHERE cotizacion.fecha = '"+x+"' "
                + "&& cotizacion.idCliente = cliente.id "
                + "&& cotizacion.idAuto = auto.idauto";
        return sql;
    }
    
    public String ConsultarTodoCotizaciones(){
        sql = "SELECT cotizacion.id, cliente.paterno, cliente.materno, cliente.nombre, auto.marca, auto.tipo, auto.ano, cotizacion.fecha, cotizacion.mensualidad, cotizacion.plazo FROM cotizacion, cliente, auto WHERE cotizacion.idCliente = cliente.id && cotizacion.idAuto = auto.idauto";
        return sql;
    }
    
    public String CambiarVariablesCotizacion(double t12, double t24, double t30, double t36, double t48, double t54, double t60, double i, double c, double s) {
        sql = "UPDATE variables SET tafsiva = "+t12+", iva = "+i+", comision = "+c+", sva = "+s+", tafsiva24 = "+ t24 +", tafsiva36 = "+ t36 +", tafsiva48 = "+ t48 +", tafsiva54 = "+ t54 +", tafsiva60 = "+ t60+", tafsiva30 = "+t30;
        return sql;
    }
    
    public String CambiarVariablesCotizacion(double t, double i, double c, double s){
        sql = "UPDATE variables SET tafsiva = "+t+", iva = "+i+", comision = "+c+", sva = "+s;
        return sql;
    }
    
    public String ObtenerVariablesCotizacion(){
        sql = "SELECT * FROM variables";
        return sql;
    }
    
    public String GuardraAutoParcial(String ma, String ti, String tr, String an){
        sql = "INSERT INTO auto (marca, tipo, transmision, ano) VALUES('"+ma+"','"+ti+"','"+tr+"','"+an+"')";
        return sql;
    }
    
    public String ObtenerIDAuto(String ma, String ti, String tr, String an){
        sql = "SELECT idauto FROM auto WHERE marca = '"+ma+"' AND tipo = '"+ti+"' AND transmision = '"+tr+"' AND ano = '"+an+"'";
        return sql;
    }
    
    public String GuardarClienteParcial(String p, String m, String n, String t){
        sql = "INSERT INTO cliente (paterno, materno, nombre, telefono) VALUES('"+p+"','"+m+"','"+n+"','"+t+"')";
        return sql;
    }
    
    public String ObtenerIDCliente(String p, String m, String n, String t){
        sql = "SELECT id from cliente where paterno = '"+p+"' AND "
                + "materno = '"+m+"' AND nombre = '"+n+"' AND telefono = '"+t+"'";
        return sql;
    }
    
    public String ObtenerUltimaCotizacion(){
          sql = "SELECT * FROM cotizacion ORDER BY id DESC LIMIT 1";
          return sql;
    }
    
    public String ClientesXNombre(String n){
        n = n.toUpperCase();
        sql = "SELECT id, paterno, materno, nombre, telefono, cp, rfc FROM cliente"
                + " WHERE paterno LIKE '"+n+"%' OR materno LIKE '"+n+"%' OR nombre LIKE '"+n+"%' ORDER BY paterno DESC";
        return sql;
    }
    
    public String ClientesXTelefono(String t){
        sql = "SELECT id, paterno, materno, nombre, telefono, cp, rfc FROM cliente"
                + "WHERE telefono = '"+t+"' ORDER BY paterno DESC";
        return sql;
    }
    
    public String ClientesXTodos(){
        sql = "SELECT id, paterno, materno, nombre, telefono, cp, rfc FROM cliente ORDER BY paterno DESC";
        return sql;
    }

    public String GuardarCotizacion(int folio, int idA, double pA, double eA, double financiamiento, double mensualidad, int mA, double comision, double seguro, double tasi, int idC, String date, String idE, String fecha, double cat) {
        sql = "INSERT INTO cotizacion VALUES("+folio+","+idA+","+pA+","+eA+","+financiamiento+","+mensualidad+","+mA+","+comision+","+seguro+","+tasi+","+idC+",'"+date+"','"+idE+"','"+fecha+"', "+cat+")";
        return sql;
    }
    
    public String ConsultarCotizacion(int cotizacion){
        sql = "SELECT * FROM cotizacion WHERE id = "+cotizacion;
        return sql;
    }

    public String ConsultarClienteParcial(int idCliente) {
        sql = "SELECT paterno, materno, nombre, telefono FROM cliente WHERE id = "+idCliente;
        return sql;
    }

    public String ConsultarAutoParcial(int idAuto) {
        sql = "SELECT marca, tipo, transmision, ano FROM auto WHERE idauto = "+idAuto;
        return sql;
    }

    public String EditarClienteParcial(int id, String paterno, String materno, String nombre, String telefono) {
        sql = "UPDATE cliente SET paterno = '"+paterno+"', materno = '"+materno+"', nombre = '"+nombre+"', telefono = '"+telefono+"' WHERE id = "+id;
        return sql;
    }

    public String EditarAutoParcial(int id, String marca, String tipo, String transmision, String ano) {
        sql = "UPDATE auto SET marca = '"+marca+"', tipo = '"+tipo+"', transmision = '"+transmision+"', ano = "+ano+" WHERE idauto = "+id;
        return sql;
    }

    public String EditarCotizacion(int folio, int idA, double pA, double eA, double financiamiento, double mensualidad,
            int mA, double comision, double seguro, double tasi, int idC, String date, String idE, String fecha, double cat) {
        sql = "UPDATE cotizacion SET precioA = "+idA+", "
                + "enganche = "+eA+", "
                + "financiamiento = "+financiamiento+", "
                + "mensualidad = "+mensualidad+", "
                + "plazo = "+mA+", "
                + "comision = "+comision+", "
                + "seguro = "+seguro+", "
                + "tasi = "+tasi+", "
                + "fecha = '"+date+"', "
                + "cotizacioncol = '"+fecha+"', "
                + "cat = "+cat+" "
                + "WHERE id = "+folio;
        return sql;
    }

    public String ObtenerCotizacionContrato(int folio) {
        sql = "SELECT idcotizacion FROM contrato WHERE idcotizacion = "+folio;
        return sql;
    }

}
