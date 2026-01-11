import java.time.LocalDate;
import java.util.Date;

public class Ticket {
    int id;
    String requisitante;
    int prioridade;
    String descrição;
    String mensagem;
    LocalDate dataCriacao;
    String situacao;
    int aux = 1;

    public Ticket(String requisitante, int prioridade, String descrição, String mensagem) {
        this.requisitante = requisitante;
        this.prioridade = prioridade;
        this.descrição = descrição;
        this.mensagem = mensagem;
        this.id = aux;
        aux+=1;
        this.dataCriacao = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public String getRequisitante() {
        return requisitante;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public String getDescrição() {
        return descrição;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setRequisitante(String requisitante) {
        this.requisitante = requisitante;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
