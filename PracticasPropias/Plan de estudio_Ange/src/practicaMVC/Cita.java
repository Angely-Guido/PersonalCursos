package practicaMVC;

import java.time.LocalDate;

public class Cita {

    private String nombre;
    private String cedula;
    private LocalDate fecha;
    private String motivo;

    public Cita() {
    }

    public Cita(String nombre, String cedula, LocalDate fecha, String motivo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fecha = fecha;
        this.motivo = motivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return  nombre + "|" + "|"+ cedula + "|" + fecha + "|" + motivo;
    }
}
