
package Classes.src;
import java.util.ArrayList;
public class GerenciadorAeroportos {
   private ArrayList<Aeroporto> aeroportos;

   private GerenciadorAeroportos() {
    aeroportos = new ArrayList<>();
}

private static GerenciadorAeroportos instance;

public static GerenciadorAeroportos getInstance() {
    if (instance == null)
        instance = new GerenciadorAeroportos();

    return instance;

}

public void inserir(Aeroporto aeroporto) {
    aeroportos.add( aeroporto );
}

public void deletar(Aeroporto aeroporto){
   aeroportos.remove(aeroporto);
}
public int size(ArrayList<Aeroporto> aeroportos){
    return aeroportos.size();

}

public Aeroporto pesquisar(String cod) {
    for (Aeroporto aeroporto: aeroportos) {
        if (aeroporto.getCodigoComp().equals(cod)){
            return aeroporto;
        }
}
return null;
 }

public String toString() {

    StringBuilder aux = new StringBuilder("\nCadastro de Aeroportos\n- - - - - - - - - - -\n");
    for (Aeroporto umAeroporto : aeroportos) {
        aux.append( umAeroporto.toString() + "\n");

    }
    return aux.toString();

}


}
