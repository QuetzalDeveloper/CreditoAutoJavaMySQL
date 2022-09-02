package DataBase;

public class SQLContrato {
    
    private int dia=0;
    private String sql;
    
    public String ObtenerAdicionales(){
        sql = "SELECT * FROM adicionales";
        return sql;
    }
    
    public String ClienteCotizacion(int folio){
        sql = "SELECT cliente.* FROM cliente, cotizacion WHERE cotizacion.id = "+folio+" AND cotizacion.idCliente = cliente.id";
        return sql;
    }
    
    public String ComprobarCotizacion(int folio){
        sql = "SELECT * FROM cotizacion where id = "+folio;
        return sql;
    }
    
    public String ComprobarCotizacionContrato(int folio){
        sql = "SELECT * FROM contrato WHERE idcotizacion = "+folio;
        return sql;
    }

    public String AutoCotizacion(int id) {
        sql = "SELECT auto.* FROM auto,cotizacion WHERE cotizacion.id = "+id+" AND auto.idauto=cotizacion.idauto";
        return sql;
    }

    public String GuardarAutoCompleto(int idV, String marca, String tipo, String transmision, String color, String serie, String motor, int ano, String distribuidor, String uso) {
        sql = "UPDATE auto SET marca = '"+marca+"', tipo = '"+tipo+"', transmision = '"+transmision+"', color = '"+color+"', "
                + "nserie = '"+serie+"', nmotor = '"+motor+"', ano = "+ano+", distribuidor = '"+distribuidor+"', uso = '"+uso+"' WHERE idauto = "+idV;
        return sql;
    }

    public String GuardarAvalCompleto(int id, String pat, String mat, String nom, String nac, String pro, String cal, 
            String inte, String exte, String col, String mun, int cp, String edo, String tel, String rfc, String calT,
            String exteT, String inteT, String colT, String munT, int cpT, String edoT, String telT, int edad, String edocivil,
            String curp, String correo, int residencia, String empresa, String puesto, String ingreso) {
        sql = "UPDATE aval SET paterno = '" + pat + "', materno = '" + mat + "', nombre = '" + nom + "',  telefono = '" 
                + tel + "',rfc = '" + rfc + "', nacionalidad = '" + nac + "', profesion = '" + pro + "',"
                + " calle = '" + cal + "', interior = '" + inte + "', exterior = '" + exte + "', colonia = '" + col + "', "
                + "municipio = '" + mun + "',estado = '" + edo + "', cp = " + cp + ", calleT = '" + calT + "', interiorT = '" 
                + inteT + "', exteriorT = '" + exteT + "', coloniaT = '" + colT + "', municipioT = '" + munT + "', estadoT = '" 
                + edoT + "', cpT = " + cpT + ", telefonoT = '" + telT + "', edad = "+edad+", edocivil = '"+edocivil
                +"', residencia = "+residencia+", curp = '"+curp+"', correo = '"+correo+"', empresa = '"+empresa
                +"', ingreso = '"+ingreso+"', puesto = '"+puesto+"' "
                + "WHERE id = " + id;
        return sql;
    }
    
    public String GuardarGarantia(int id, String ubicacion, String denominacion, String datos, 
            String folio, String lugar, String registro) {
        sql = "UPDATE aval SET ubicaciongar = '"+ubicacion+"', nombregar = '"+denominacion+"', "
                + "folio = '"+folio+"', fechagar = '"+registro+"', lugargar = '"+lugar+"', "
                        + "datosgar = '"+datos+"' WHERE id = "+id;
        return sql;
    }

    public String ComprobarAval(int id) {
        sql = "SELECT * FROM aval WHERE id = "+id;
        return sql;
    }

    public String AltaAval(int id) {
        sql = "INSERT INTO aval(id) VALUES("+id+")";
        return sql;
    }

    public String ObtenerUltimoContrato() {
        sql = "SELECT id FROM contrato ORDER BY id DESC LIMIT 1";
        return sql;
    }

    public String GuardarContrato(String contrato, int idC, int idV, int idcotizacion,
            double precio, double enganche, double financiamiento, double intereses,
            double total, double seguro, double comision, double factura, double saldo,
            int plazo,String fecha, String fechaMes, int dia, String beneficiario) {
        sql = "INSERT INTO contrato VALUES('" + contrato + "'," + idcotizacion + "," + idC + ","
                + idC + "," + idV + "," + precio + "," + enganche + "," + financiamiento + ","
                + intereses + "," + total + "," + seguro + "," + comision + "," + factura + ","
                + saldo + ",'" + fecha + "','" + fechaMes + "',"+dia+",'"+beneficiario+"',0)";
        return sql;
    }

    public String GuardarClienteCompleto(int id, String pat, String mat, String nom, 
            String nac, String pro, String cal, String inte, String exte, String col, 
            String mun, int cp, String edo, String tel, String rfc, String calT, 
            String exteT, String inteT, String colT, String munT, int cpT, String edoT, 
            String telT, 
            int edad, String correo, String curp, String civil, int residencia, 
            String empresa, String puesto, String ingreso) {
        sql = "UPDATE cliente SET paterno = '"+pat+"', materno = '"+mat+"', "
                + "nombre = '"+nom+"', nacionalidad = '"+nac+"', profesion = '"+pro+"',"
                + " calle = '"+cal+"', interior = '"+inte+"', exterior = '"+exte+"', "
                + "colonia = '"+col+"', municipio = '"+mun+"', cp = "+cp+", "
                + "estado = '"+edo+"', telefono = '"+tel+"', rfc = '"+rfc+"', "
                + "calletra = '"+calT+"', esteriortra = '"+exteT+"', interiortra = '"+inteT+"', "
                + "coloniatra = '"+colT+"', municipiotra = '"+munT+"', cptra = "+cpT+", "
                + "estadotra = '"+edoT+"', telefonotra = '"+telT+"', edad = "+edad+", "
                + "correo = '"+correo+"', curp = '"+curp+"', civil = '"+civil+"', "
                + "residencia = "+residencia+", empresa = '"+empresa+"', puesto = '"+puesto+"', "
                + "ingreso = '"+ingreso+"' WHERE id = "+id;
        return sql;
    }

    public String ConsultarTodoContrato() {
        sql = "SELECT contrato.id, cliente.paterno, cliente.materno, cliente.nombre, auto.marca,auto.tipo,auto.ano,contrato.fecha,contrato.total "
                + "FROM contrato, auto, cliente "
                + "WHERE contrato.idcliente = cliente.id AND contrato.idauto = auto.idauto";
        return sql;
    }

    public String ConsultarFolioContrato(String x) {
        sql = "SELECT contrato.id, cliente.paterno, cliente.materno, cliente.nombre, auto.marca,auto.tipo,auto.ano,contrato.fecha,contrato.total "
                + "FROM contrato, auto, cliente "
                + "WHERE contrato.id = '"+x+"' AND "
                + "contrato.idcliente = cliente.id AND contrato.idauto = auto.idauto";
        return sql;
    }

    public String ConsultarClienteContrato(String x) {
         sql = "SELECT contrato.id, cliente.paterno, cliente.materno, cliente.nombre, auto.marca,auto.tipo,auto.ano,contrato.fecha,contrato.total "
                + "FROM contrato, auto, cliente "
                + "WHERE contrato.idcliente = cliente.id "
                 + "AND contrato.idauto = auto.idauto "
                 + "AND (cliente.paterno LIKE '"+x+"%' OR cliente.materno LIKE '"+x+"%' OR cliente.nombre LIKE '"+x+"%')";
        return sql;
    }

    public String ConsultarFechaContrato(String fecha) {
        sql = "SELECT contrato.id, cliente.paterno, cliente.materno, cliente.nombre, auto.marca,auto.tipo,auto.ano,contrato.fecha,contrato.total "
                + "FROM contrato, auto, cliente "
                + "WHERE contrato.fecha ='"+fecha+"' "
                 + "AND contrato.idcliente = cliente.id "
                 + "AND contrato.idauto = auto.idauto";
        return sql;
    }
    
    public String ConsultarContrato(String id){
        sql = "SELECT * FROM contrato WHERE id = '"+id+"'";
        return sql;
    }

    public String obtenerTasi(int id) {
        sql = "SELECT tasi,plazo,cat FROM cotizacion WHERE id = "+id;
        return sql;
    }

    public String CambiarBeneficiario(String id, String beneficiario) {
        sql = "UPDATE contrato SET beneficiario = '"+beneficiario+"' WHERE id = '"+id+"'";
        return sql;
    }

    public String ConsultarPorcentajeComision() {
        sql = "SELECT comision FROM variables";
        return sql;
    }

}
