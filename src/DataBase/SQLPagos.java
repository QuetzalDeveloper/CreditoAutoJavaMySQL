package DataBase;

public class SQLPagos {
    
    String sql;

    
    
    public String ComprobarContrato(String contrato){
        sql = "SELECT cliente.paterno, cliente.materno, cliente.nombre, contrato.estatuspago, contrato.total, "
                + "cotizacion.mensualidad, cotizacion.plazo, contrato.fechaprimer "
                + "FROM contrato, cliente, cotizacion WHERE contrato.id = '"+contrato+"' "
                + "AND contrato.idcliente = cliente.id AND contrato.idcotizacion = cotizacion.id";
        return sql;
    }
    
    public String GuardarPago(String contrato, int pago, String fecha, double abono,
            String guia, int plazo, String comentario) {
        sql =  "INSERT INTO pago(idcontrato,numero,fecha,abono,guia,plazo,comentario)"
                + " VALUES('"+contrato+"',"+pago+",'"+fecha+"',"+abono+",'"+guia+"',"+plazo+",'"+comentario+"')";
        return sql;
    }

    public String ObtenerTodosPagos(String contrato) {
        sql = "SELECT * FROM pago WHERE idcontrato = '"+contrato+"' ORDER BY fecha ASC";
        return sql;
    }

    public String CearCuenta(String contrato, double d, double mensualidad, int plazo, String inicio, 
            String fin) {
        sql = "INSERT INTO cuenta VALUES('"+contrato+"',"+d+","+mensualidad+","
                + plazo+",'"+inicio+"','"+fin+"',0.0,0.0,0.0,0)";
        return sql;
    }
    
    public String TodasCuentas(){
        sql = "SELECT * FROM cuenta";
        return sql;
    }

    public String CambiarEstatusCuenta(String contrato, int a) {
        sql = "UPDATE cuenta set estatus = "+a+" WHERE idcontrato = '"+contrato+"'";
        return sql;
    }

    public String ConsultarPagosPlazo(String contrato, int plazo) {
        sql = "SELECT * FROM pago WHERE idcontrato = '"+contrato+"'"
                + " AND plazo = "+plazo;
        return sql;
    }

    public String CambiarEstatusContrato(String contrato, int i) {
        sql = "UPDATE contrato SET estatuspago = "+i+" WHERE id='"+contrato+"'";
        return sql;
    }

    public String CambiarCubiertoPendiente(String contrato, double total, double adeudo) {
        sql = "UPDATE cuenta SET cubierto = "+total+", "
                + "pendiente = "+adeudo+" WHERE idcontrato ='"+contrato+"'";
        return sql;
    }

    public String CuentasActivas() {
        sql = "SELECT * FROM cuenta WHERE estatus = 0";
        return sql;
    }

    public String CuentasFinalizadas() {
        sql = "SELECT * FROM cuenta WHERE estatus = 1";
        return sql;
    }
    
    public String BuscarPago(String contrato, int numero){
        sql = "SELECT * FROM pago WHERE idcontrato = '"+contrato+"' AND numero = "+numero;
        return sql;
    }
    
    public String CambiarPago(String contrato, int pago, String fecha, double abono,
            String guia, int plazo, String comentario) {
        sql =  "UPDATE pago SET fecha = '"+fecha+"', abono = "+abono+", guia = '"+guia+"', plazo = "+plazo+", comentario = '"+comentario+"' "
                + "WHERE idcontrato = '"+contrato+"' AND numero = "+pago;
        return sql;
    }

    public String VerificarCuenta(String contrato) {
        sql = "SELECT idcontrato FROM cuenta WHERE idcontrato = '"+contrato+"'";
        return sql;
    }

    public String CuentaContrato(String text) {
        sql = "select * from cuenta where idcontrato = '"+text+"'";
        return sql;
    }

    public String ObtenerIdsContrato(String folio) {
        sql = "SELECT id, idcotizacion, idauto FROM contrato WHERE id ='"+folio+"'";
        return sql;
    }

    public String EliminarCotizacion(int cotizacion) {
        sql = "DELETE FROM cotizacion WHERE id = "+cotizacion;
        return sql;
    }

    public String EliminarAuto(int auto) {
        sql = "DELETE FROM auto WHERE idauto = "+auto;
        return sql;
    }

    public String EliminarPagoContrato(String folio) {
        sql = "DELETE FROM pago WHERE idcontrato = '"+folio+"'";
        return sql;
    }

    public String EliminarCuentaContrato(String folio) {
        sql = "DELETE FROM cuenta WHERE idcontrato = '"+folio+"'";
        return sql;
    }

    public String EliminarContrato(String folio) {
        sql = "DELETE FROM contrato WHERE id = '"+folio+"'";
        return sql;
    }

    public String CrearCuentaExterna(String contrato, String paterno, String materno, String nombre, double pagare, double mensualidad, int plazo, String inicio) {
        sql = "INSERT INTO viejos VALUES('"+contrato+"','"+paterno+"','"+materno+"','"+nombre+"',0,"+pagare+","+mensualidad+","+plazo+",'"+inicio+"',"+pagare+",0.0,0.0)";
        return sql;
    }

    public String TodasCuentasExtenas() {
        sql = "SELECT * FROM viejos";
        return sql;
    }

    public String CuentasActivasExtenas() {
        sql = "SELECT * FROM viejos WHERE estatus = 0";
        return sql;
    }

    public String CuentasFinalizadasExternas() {
        sql = "SELECT * FROM viejos WHERE estatus = 1";
        return sql;
    }

    public String ComprobarContratoExterno(String contrato) {
        sql = "SELECT * FROM viejos WHERE id = '"+contrato+"'";
        return sql;
    }

    public String CambiarCubiertoPendienteExterno(String contrato, double total, double adeudo) {
        sql = "UPDATE viejos SET cubierto = "+total+", pendiente = "+adeudo+" WHERE id = '"+contrato+"'";
        return sql;
    }

    public String CambiarEstatusCuentaExterna(String contrato, int i) {
        sql = "UPDATE viejos SET estatus = "+i+" WHERE id='"+contrato+"'";
        return sql;
    }

    public String EliminarExterno(String folio) {
        sql = "DELETE FROM viejos WHERE id = '"+folio+"'";
        return sql;
    }

    public String EliminarPagoExterno(String folio) {
        sql = "DELETE FROM pago WHERE idcontrato = '"+folio+"'";
        return sql;
    }

    public String EliminarPago(int num) {
        sql = "DELETE FROM pago WHERE idpago = "+num;
        return sql;
    }

    public String ComentarioPago(int num) {
        sql = "SELECT comentario FROM pago WHERE idpago = "+num;
        return sql;
    }
    
    public String TotalAbono(String contrato) {
        sql = "SELECT SUM(abono) FROM pago WHERE idcontrato = '"+contrato+"' ORDER BY fecha ASC";
        return sql;
    }
}
