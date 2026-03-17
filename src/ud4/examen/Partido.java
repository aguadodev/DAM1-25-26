package ud4.examen;

import java.time.LocalDateTime;

public class Partido {
    private Equipo local;
    private Equipo visitante;
    private Arbitro arbitro;
    private LocalDateTime fechaHora;
    private String pista;
    private int puntosLocal;
    private int puntosVisitante;
    
    public Partido(Equipo local, Equipo visitante) {
        if (local == null || visitante == null)
            throw new IllegalArgumentException("Parámetros nulos");
        this.local = local;
        this.visitante = visitante;
    }

    public void setDetalles(Arbitro arbitro, LocalDateTime fechaHora, String pista) {
        this.arbitro = arbitro;
        this.fechaHora = fechaHora;
        this.pista = pista;
    }

    public void setResultado(int puntosLocal, int puntosVisitante) {
        if (puntosLocal < 0 || puntosVisitante < 0)
            throw new IllegalArgumentException("Los puntos no pueden ser negativos");
        if (puntosLocal == puntosVisitante)
            throw new IllegalArgumentException("El partido no puede acabar en empate");        
        this.puntosLocal = puntosLocal;
        this.puntosVisitante = puntosVisitante;
    }

    @Override
    public String toString() {
        String str = "";
        if (puntosLocal == 0 && puntosVisitante == 0) {
            str += local.getNombre() + " VS " + visitante.getNombre();
            if (arbitro != null)
                str += "\nÁrbitro: " + arbitro;
            if (fechaHora != null)
                str += "\nFecha y hora: " + fechaHora;
            if (pista != null) {
                str += "\nPista: " + pista;
            }
        } else {
            str += local.getNombre() + " " + puntosLocal + " - ";
            str += puntosVisitante + " " + visitante.getNombre();
            str += "\nPartido Finalizado!";
        }
        return str;
    }



    


}
