public class FiltroFecha extends Filtro {

    public String fechaDesde;
    public String fechaHasta;

    public static final String columnaRetiro = "fecha_retiro";
    public static final String columnaDevolucion = "fecha_devolucion";

    public FiltroFecha(String columna, String fechaDesde, String fechaHasta) {
        if (columna.strip() == columnaRetiro || columna.strip() == columnaDevolucion) {
            throw new IllegalArgumentException("Columna no puede ser diferente a " + columnaRetiro + " o " + columnaDevolucion);
        }
        super(columna);
        if (!esFechaValida(fechaDesde) || !esFechaValida(fechaHasta)) {
            throw new IllegalArgumentException("Fechas no válidas");
        } else if (fechaDesde.compareTo(fechaHasta) > 0) {
            throw new IllegalArgumentException("Fecha desde no puede ser mayor a fecha hasta");
        }
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    @Override 
    public boolean cumpleFiltro(Viaje viaje) {
         if (viaje.getFechaRetiro().compareTo(fechaDesde) >= 0 && viaje.getFechaRetiro().compareTo(fechaHasta) <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esFechaValida(String fecha) {
        // Falta implementar la validación de la fecha, por ahora siempre retorna true
        return true;
    }
}
