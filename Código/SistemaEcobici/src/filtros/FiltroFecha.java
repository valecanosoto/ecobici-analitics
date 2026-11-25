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
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    @Override 
    public boolean cumpleFiltro(Viaje viaje) {
         if (viaje.) {
            
            return false;
        } else {
            return false;
        }
    }

    public boolean esFechaValida(String fecha) {
        // Implement date validation logic here
        return true;
    }
}
