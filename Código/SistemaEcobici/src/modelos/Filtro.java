public abstract class Filtro {

    public String columna;

    public Filtro(String columna) {
        this.columna = columna;
    }

    public abstract boolean cumpleFiltro(Viaje viaje);

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }
}
