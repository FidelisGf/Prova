import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nomeFilme;
    private long Id;
    private double duracao;
    private boolean situacaoFilme;
    public Filme(String nomeFilme, long id, double duracao, boolean situacaoFilme) {
        this.nomeFilme = nomeFilme;
        Id = id;
        this.duracao = duracao;
        this.situacaoFilme = situacaoFilme;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public boolean isSituacaoFilme() {
        return situacaoFilme;
    }

    public void setSituacaoFilme(boolean situacaoFilme) {
        this.situacaoFilme = situacaoFilme;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nomeFilme='" + nomeFilme + '\'' +
                ", Id=" + Id +
                ", duracao=" + duracao +
                ", situacaoFilme=" + situacaoFilme +
                '}';
    }
}
