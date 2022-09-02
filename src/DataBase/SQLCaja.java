package DataBase;

public class SQLCaja {

    private String sql;
    
    // Categoria:   0 = ingreso, 1 = gasto
    // Origen;    0 = Efectivo, 1 = tarjeta
    
    public String ConsultarCaja() {
        sql = "SELECT * FROM caja";
        return sql;
    }

    public String Obtener20Movimientos() {
        sql = "SELECT * FROM gastos ORDER BY numero DESC LIMIT 20";
        return sql;
    }

    public String ConsultarTodo() {
        sql = "SELECT * FROM gastos ORDER BY fecha ASC";
        return sql;
    } 

    public String TodoIngresos() {
        sql = "SELECT * FROM gastos WHERE categoria = 0 ORDER BY fecha ASC";
        return sql;
    }

    public String TodoGastos() {
        sql = "SELECT * FROM gastos WHERE categoria = 1 ORDER BY fecha ASC";
        return sql;
    }

    public String TodoInicio(String ini) {
        sql = "SELECT * FROM gastos WHERE fecha >= '"+ini+"' ORDER BY fecha ASC";
        return sql;
    }

    public String TodoFinal(String fin) {
        sql = "SELECT * FROM gastos WHERE fecha <= '"+fin+"' ORDER BY fecha ASC";
        return sql;
    }

    public String InicioFinal(String ini, String fin) {
        sql = "SELECT * FROM gastos WHERE fecha BETWEEN '"+ini+"' AND '"+fin+"' ORDER BY fecha ASC";
        return sql;
    }

    public String InicioIngresos(String ini) {
        sql = "SELECT * FROM gastos WHERE categoria = 0 and fecha >= '"+ini+"' ORDER BY fecha ASC";
        return sql;
    }

    public String FinalIngresos(String fin) {
        sql = "SELECT * FROM gastos WHERE categoria = 0 and fecha <= '"+fin+"' ORDER BY fecha ASC";
        return sql;
    }

    public String InicioFinalIngresos(String ini, String fin) {
        sql = "SELECT * FROM gastos WHERE categoria = 0 AND fecha BETWEEN '"+ini+"' AND '"+fin+"' ORDER BY fecha ASC";
        return sql;
    }

    public String InicioGastos(String ini) {
        sql = "SELECT * FROM gastos WHERE categoria = 1 and fecha >= '"+ini+"' ORDER BY fecha ASC";
        return sql;
    }

    public String FinalGastos(String fin) {
        sql = "SELECT * FROM gastos WHERE categoria = 1 and fecha <= '"+fin+"' ORDER BY fecha ASC";
        return sql;
    }

    public String InicioFinalGastos(String ini, String fin) {
        sql = "SELECT * FROM gastos WHERE categoria = 1 AND fecha BETWEEN '"+ini+"' AND '"+fin+"' ORDER BY fecha ASC";
        return sql;
    }       

    public String GuardarIngreso(String fecha, int i, String concepto, String recibo, double cantidad, int origen) {
        sql = "INSERT INTO gastos(fecha,categoria,concepto,recibo,cantidad,origen) values('"+fecha+"',"+i+",'"+concepto+"','"+recibo+"',"+cantidad+","+origen+")";
        return sql;
    }

    public String GuardarTotal(double total, double efectivo, double tarjeta) {
        sql = "UPDATE caja SET total="+total+", efectivo ="+efectivo+", tarjeta = "+tarjeta;
        return sql;
    }

    public String GuardarGasto(String fecha, int i, String concepto, String recibo, double cantidad, int origen) {
        sql = "INSERT INTO gastos(fecha,categoria,concepto,recibo,cantidad,origen) values('"+fecha+"',"+i+",'"+concepto+"','"+recibo+"',"+cantidad+","+origen+")";
        return sql;
    }

    public String ReiniciarGastos() {
        sql = "DELETE FROM gastos";
        return sql;
    }

    public String ConsultarMovimiento(int num) {
        sql = "SELECT * FROM gastos WHERE numero = "+num;
        return sql;
    }

    public String EliminarMovimiento(int num) {
        sql = "DELETE FROM gastos WHERE numero = "+num;
        return sql;
    }
}
