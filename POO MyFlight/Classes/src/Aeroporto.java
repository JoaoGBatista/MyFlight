package Classes.src;
public class Aeroporto {

    private String codigo;
    private String nome;
    private Geo loc;
    
     

    public Aeroporto(String umCodigo, String umNome, Geo umaloc) {
        this.codigo = umCodigo;
        this.nome = umNome;
        this.loc = umaloc;
    }
    
    public String getNomeComp() {
        return nome;
    }

    public String getCodigoComp() {
        return codigo;
    }

    public Geo getLoc() {
        return loc;
    }

    

    @Override
    public String toString() {
        return "Companhia Aérea{" +
                "codigo=" + getCodigoComp() +
                ", nome='" + getNomeComp() + '\'' +
                "Geo Loc=" + getLoc() +
                '}';
    }
}