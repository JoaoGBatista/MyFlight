package Classes.src;
import java.util.ArrayList;

public class GerenciadorRotas {
   private ArrayList<Rota> rotas;
   private GerenciadorRotas() {
    rotas = new ArrayList<>();
}

private static GerenciadorRotas instance;

public static GerenciadorRotas getInstance() {
    if (instance == null)
        instance = new GerenciadorRotas();

    return instance;

}

public void inserir(Rota rota) {
    rotas.add( rota );
}

public void deletar(Rota rota){
    rotas.remove(rota);
 }
 public int size(ArrayList<Rota> rotas){
     return rotas.size();

}


public Rota pesquisar(Aeroporto aeroporto){
    for(Rota r : rotas){
        if(r.getAeroportoOrg().equals(aeroporto)){
            return r;
        }
}
return null;
 }
public String toString() {

    StringBuilder aux = new StringBuilder("\nCadastro de Rotas\n- - - - - - - - - - -\n");
    for (Rota umaRota : rotas) {
        aux.append( umaRota.toString() + "\n");

    }
    return aux.toString();

}
}

