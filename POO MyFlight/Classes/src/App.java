package Classes.src;
import java.time.LocalDateTime;
import java.time.Duration;
public class App {public static void main(String[] args) {
    System.out.println("\fTestando");
    
//Cias

    CiaAerea c1 = new CiaAerea ("AA","Linha aerea Azul");
    CiaAerea c2 = new CiaAerea ("BB","Linha aerea Vermelho");
    CiaAerea c3 = new CiaAerea ("CC","Linha aerea Verde");
    CiaAerea c4 = new CiaAerea ("DD","Linha aerea Amarelo");

    GerenciadorCias companias = GerenciadorCias.getInstance();
    companias.inserir(c1);
    companias.inserir(c2);
    companias.inserir(c3);
    companias.inserir(c4);

    System.out.println("Companhias:"+companias.toString());
    
    
//Aeronaves

    Aeronave ar1 = new Aeronave("111","Boeing ",140);
    Aeronave ar2 = new Aeronave("222","Boeing ",126);
    Aeronave ar3 = new Aeronave("333","Airbus ",644);
    Aeronave ar4 = new Aeronave("444","Boeing ",304);

    
    GerenciadorAeronaves naves = GerenciadorAeronaves.getInstance();
    naves.inserir(ar1);
    naves.inserir(ar2);
    naves.inserir(ar3);
    naves.inserir(ar4);

    
    System.out.println("Aéronaves :"+"\n"+naves.toString()); 


    Geo airport1 = new Geo(-29.9939,-51.1711);
    Geo airport2 = new Geo(-23.4356,-46.4731);
    Geo airport3 = new Geo(38.7742 ,-9.1342);
    Geo airport4 = new Geo(25.7933,-80.2906);
    Geo airport5 = new Geo(-22.8089,-43.2436);

    Aeroporto port1 = new Aeroporto("POA","Salgado intlApt ", airport1);
    Aeroporto port2 = new Aeroporto(" GRU","São Paulo Guarulhos Intl Apt ", airport2);
    Aeroporto port3 = new Aeroporto("LIS","Lisbon ",airport3);
    Aeroporto port4 = new Aeroporto("MIA","Miami Internarional Apt ",airport4);
    Aeroporto port5 = new Aeroporto("GIG","Aeroporto Internacional Tom Jobim ",airport5);

     
    GerenciadorAeroportos  airManager = GerenciadorAeroportos.getInstance();
    airManager.inserir(port1);
    airManager.inserir(port2);
    airManager.inserir(port3);
    airManager.inserir(port4);
    airManager.inserir(port5);

    System.out.println("Aéroporto :"+"\n"+airManager.toString()); 
    System.out.println("\n+-+-+-+-+-+-+-\n"+companias.toString());



    Rota Rota1 = new Rota(c4,port1,port2,ar2);
    LocalDateTime dataHora = LocalDateTime.of(2023,04,03,13,44);
    Duration duracao = Duration.ofMinutes(120);

    GerenciadorRotas linhas = GerenciadorRotas.getInstance();
    linhas.inserir(Rota1);
    
    System.out.println("Rotas :"+"\n"+linhas.toString()); 



    Voo v1 = new Voo(dataHora,duracao,Rota1);
    System.out.println("Voos "+Rota1.toString());
    System.out.println(v1.toString());

    GerenciadorVoos caminhos = GerenciadorVoos.getInstance();
    caminhos.inserir(v1);
    
    System.out.println("Voos :"+"\n"+caminhos.toString()); 

}

}
