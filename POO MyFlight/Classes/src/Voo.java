package Classes.src;
import java.time.LocalDateTime;
import java.time.Duration;

public class Voo {
   public enum Status { CONFIRMADO, ATRASADO, CANCELADO };

   private LocalDateTime datahora;
   private Duration duracao;
   private Rota rota;
   private Status status;

   public Voo(LocalDateTime umaData,Duration umaDuracao,Rota umaRota) {
    this.datahora = umaData;
    this.duracao = umaDuracao;
    this.rota = umaRota;
    this.status = Status.CONFIRMADO;

}

public LocalDateTime getLocalDateTime() {
    return datahora;
}

public Duration getDuration() {
    return duracao;
}

public Rota getRota() {
    return rota;
}

public Status getStatus() {
    return status;
}
public void setStatus(Status novo) {
    this.status = novo;
}

public String toString() {
    return "Voo{" +
            "LocalDateTime=" + getLocalDateTime() +
            ", Duraçao='" + getDuration() + '\'' +
            ", Rota='" + getRota() + '\'' +
            ", Status='" + getStatus() + '\'' +
            '}';
}
}
