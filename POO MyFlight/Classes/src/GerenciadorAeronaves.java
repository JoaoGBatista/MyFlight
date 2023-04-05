package Classes.src;
import java.util.ArrayList;
public class GerenciadorAeronaves {
   private ArrayList<Aeronave> aeronaves;

   private GerenciadorAeronaves() {
    aeronaves = new ArrayList<>();
}

private static GerenciadorAeronaves instance;

public static GerenciadorAeronaves getInstance() {
    if (instance == null)
        instance = new GerenciadorAeronaves();

    return instance;

}

public void inserir(Aeronave aviao) {
    aeronaves.add( aviao );
}

public void deletar(Aeronave aviao){
    aeronaves.remove(aviao);
 }
 public int size(ArrayList<Aeronave> aeronaves){
     return aeronaves.size();
}

public Aeronave pesquisar(String cod) {
        for (Aeronave aeronave: aeronaves) {
            if (aeronave.getCodigo().equals(cod)){
                return aeronave;
            }
    }
    return null;
     }

public String toString() {

    StringBuilder aux = new StringBuilder("\nCadastro de Aeronaves\n- - - - - - - - - - -\n");
    for (Aeronave umaAeronave : aeronaves) {
        aux.append( umaAeronave.toString() + "\n");

    }
    return aux.toString();

}


}