package Classes.src;
import java.util.ArrayList;
import java.time.LocalDateTime;
public class GerenciadorVoos {
   private ArrayList<Voo> voos;

   private GerenciadorVoos() {
    voos = new ArrayList<>();
}

private static GerenciadorVoos instance;

public static GerenciadorVoos getInstance() {
    if (instance == null)
        instance = new GerenciadorVoos();

    return instance;

}

public void inserir(Voo voo) {
    voos.add( voo );
}

public void deletar(Voo voo){
    voos.remove(voo);
}
public int size(ArrayList<Voo> voos){
    return voos.size();
}

public Voo pesquisar(LocalDateTime date){
    for(Voo d : voos){
        if(d.getLocalDateTime().equals(date)){
            return d;
        }
}
return null;
 }

public String toString() {

    StringBuilder aux = new StringBuilder("\nCadastro de Voos\n- - - - - - - - - - -\n");
    for (Voo umVoo : voos) {
        aux.append( umVoo.toString() + "\n");

    }
    return aux.toString();

}
}