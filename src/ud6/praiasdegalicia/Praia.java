package ud6.praiasdegalicia;

public class Praia implements Comparable<Praia> {
    private int id;
    private String nome;
    private String concello;
    private String provincia;
    private double lat;
    private double lon;

    public Praia() {
    }

    public Praia(int id) {
        this.id = id;
    }

    public Praia(int id, String nome, String concello, String provincia) {
        this.id = id;
        this.nome = nome;
        this.concello = concello;
        this.provincia = provincia;
    }

    public Praia(int id, String nome, String concello, String provincia, double lat, double lon) {
        this.id = id;
        this.nome = nome;
        this.concello = concello;
        this.provincia = provincia;
        this.lat = lat;
        this.lon = lon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConcello() {
        return concello;
    }

    public void setConcello(String concello) {
        this.concello = concello;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getUrlPrediccionMeteogalicia() {
        return "https://servizos.meteogalicia.gal/mgrss/predicion/jsonPredPraia.action?idPraia=" + id;
    }

    // SOLUCIONES
    public static void imprimirLista(Praia[] praias, int i) {
        for (int j = 0; j < i; j++) {
            praias[j].mostrarDetalles();
        }
    }

    @Override
    public int compareTo(Praia o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return nome + " (" + concello + ")";
    }

    public void mostrarDetalles() {
        String str =  id + " - " + nome + " - " + concello + " - " + provincia + " - ("
                + lat + ", " + lon + ")";
                System.out.println(str);
    }  

}
