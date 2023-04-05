package Classes.src;

public class Rota {
    private CiaAerea cia;
    private Aeroporto origem;
    private Aeroporto destino;
    private Aeronave aeronave;

    public Rota(CiaAerea umaCia,Aeroporto umaOrigem,Aeroporto umDestino,Aeronave umaAeronave) {
        this.cia = umaCia;
        this.origem = umaOrigem;
        this.destino = umDestino;
        this.aeronave = umaAeronave;
    }


    public CiaAerea getCiaAerea() {
        return cia;
    }

    public Aeroporto getAeroportoOrg() {
        return origem;
    }

    public Aeroporto getAeroportoDest() {
        return destino;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public String toString() {
        return "Rota{" +
                "CiaAerea=" + getCiaAerea() +
                ", Origem='" + getAeroportoOrg() + '\'' +
                ", Destino='" + getAeroportoDest() + '\'' +
                ", Aeronave='" + getAeronave() + '\'' +
                '}';
    }

 }