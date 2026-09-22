public class Celda {
    private String codigo;
    private boolean ocupada;
    private Vehiculo vehiculo;

    public Celda(String codigo) {
        this.codigo = codigo;
        this.ocupada = false; // La celda nace siempre libre
        this.vehiculo = null;
    }

    public boolean ocupar(Vehiculo v) {
        if (this.ocupada) {
            System.out.println("Error: La celda " + this.codigo + " ya esta ocupada.");
            return false;
        }
        this.vehiculo = v;
        this.ocupada = true;
        System.out.println("Exito: Celda " + this.codigo + " asignada al vehiculo con placa " + v.getPlaca() + ".");
        return true;
    }

    public boolean liberar() {
        if (!this.ocupada) {
            System.out.println("Error: La celda " + this.codigo + " ya estaba libre. No se puede liberar.");
            return false;
        }
        System.out.println("Éxito: Celda " + this.codigo + " ha sido liberada.");
        this.vehiculo = null;
        this.ocupada = false;
        return true;
    }

    public String estado() {
        if (this.ocupada && this.vehiculo != null) {
            return "Celda " + this.codigo + ": OCUPADA -> [" + this.vehiculo.descripcion() + "]";
        } else {
            return "Celda " + this.codigo + ": LIBRE";
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}