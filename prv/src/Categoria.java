import java.util.ArrayList;
import java.util.List;

public class Categoria {
   private String nomeCategoria;
   private long IdCategoria;
   private List<Filme> lista = new ArrayList<Filme>();

    public List<Filme> getLista() {
        return lista;
    }

    public void setLista(List<Filme> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nomeCategoria='" + nomeCategoria + '\'' +
                ", IdCategoria=" + IdCategoria +
                ", lista=" + lista +
                '}';
    }

    Categoria(){

    }

    public Categoria(String nomeCategoria, long idCategoria) {
        this.nomeCategoria = nomeCategoria;
        IdCategoria = idCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public long getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(long idCategoria) {
        IdCategoria = idCategoria;
    }

}
