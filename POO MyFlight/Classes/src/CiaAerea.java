package Classes.src;
public class CiaAerea {
    private String codigo;
    private String nome;

    public CiaAerea(String umCodigo, String umNome) {
        this.codigo = umCodigo;
        this.nome = umNome;
    }

    public String getNomeComp() {
        return nome;
    }

    public String getCodigoComp() {
        return codigo;
    }

    

    @Override
    public String toString() {
        return "Companhia Aérea{" +
                "codigo=" + getCodigoComp() +
                ", nome='" + getNomeComp() + '\'' +
                '}';
    }
}
