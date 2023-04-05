package Classes.src;
import java.util.ArrayList;
public class GerenciadorCias {

   private ArrayList<CiaAerea> empresas;

   private GerenciadorCias() {
      empresas = new ArrayList<>();
}

private static GerenciadorCias instance;

public static GerenciadorCias getInstance() {
    if (instance == null)
        instance = new GerenciadorCias();

    return instance;

}

public void inserir(CiaAerea empresa) {
   empresas.add( empresa );
}

public void deletar(CiaAerea empresa){
    empresas.remove(empresa);
 }
 public int size(ArrayList<CiaAerea> empresa){
     return empresas.size();
}


public CiaAerea pesquisar(String cod) {
    for (CiaAerea empresa: empresas) {
        if (empresa.getCodigoComp().equals(cod)){
            return empresa;
        }
}
return null;
 }

public String toString() {

    StringBuilder aux = new StringBuilder("\nCadastro de Cias Aereas\n- - - - - - - - - - -\n");
    for (CiaAerea umaCiaAerea : empresas) {
        aux.append( umaCiaAerea.toString() + "\n");

    }
    return aux.toString();

}


}