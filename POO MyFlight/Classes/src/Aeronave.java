package Classes.src;

public class Aeronave {
    private String codigo;
    private String descricao;
    private int capacidade;

    public Aeronave(String umCodigo, String umaDescricao, int umaCapacidade) {
        this.codigo = umCodigo;
        this.descricao = umaDescricao;
        this.capacidade = umaCapacidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getCapacidade() {
        return capacidade;
    }

    @Override
    public String toString() {
        return "Aeronave{" +
                "Codigo=" + getCodigo() +
                ", Descrição='" + getDescricao() + '\'' +
                ", Capacidade='" + getCapacidade() + '\'' +
                '}';
    }
}