public class Viaje {
    private String genero;
    private int edad;
    private int bici;
    private int estacionRetiro;
    private String fechaRetiro;
    private String horaRetiro;
    private int estacionArribo;
    private String fechaArribo;
    private String horaArribo;

    public Viaje(String genero, int edad, int bici, int estacionRetiro, String fechaRetiro, String horaRetiro, int estacionArribo, String fechaArribo, String horaArribo) {
        this.genero = genero;
        this.edad = edad;
        this.bici = bici;
        this.estacionRetiro = estacionRetiro;
        this.fechaRetiro = fechaRetiro;
        this.horaRetiro = horaRetiro;
        this.estacionArribo = estacionArribo;
        this.fechaArribo = fechaArribo;
        this.horaArribo = horaArribo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getBici() {
        return bici;
    }

    public void setBici(int bici) {
        this.bici = bici;
    }

    public int getEstacionRetiro() {
        return estacionRetiro;
    }

    public void setEstacionRetiro(int estacionRetiro) {
        this.estacionRetiro = estacionRetiro;
    }

    public String getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(String fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public String getHoraRetiro() {
        return horaRetiro;
    }

    public void setHoraRetiro(String horaRetiro) {
        this.horaRetiro = horaRetiro;
    }

    public int getEstacionArribo() {
        return estacionArribo;
    }

    public void setEstacionArribo(int estacionArribo) {
        this.estacionArribo = estacionArribo;
    }

    public String getFechaArribo() {
        return fechaArribo;
    }

    public void setFechaArribo(String fechaArribo) {
        this.fechaArribo = fechaArribo;
    }

    public String getHoraArribo() {
        return horaArribo;
    }

    public void setHoraArribo(String horaArribo) {
        this.horaArribo = horaArribo;
    }

    
}
