import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Categoria Cat = new Categoria();
        String nome = "";
        double duracao = 0;
        criarCategoria(nome, Cat);
        CriarFilme(nome, duracao, Cat);
        System.out.println(Cat);



    }
    static void CriarFilme(String nome, double duracao, Categoria Cat){
        Scanner le = new Scanner(System.in);
        int op = 0;
        long i = 0;
        while (true){
            System.out.println("Insira um nome para o filme");
            nome = le.nextLine();
            System.out.println("Insira a duração do filme:");
            duracao = le.nextDouble();
            le.nextLine();
            System.out.println("Filme será adicionado a categoria : " + Cat.getNomeCategoria());
            Filme filme = new Filme(nome, i, duracao, true);
            Cat.getLista().add(filme);
            i++;
            System.out.println("Deseja continuar adicionando ? ");
            op = le.nextInt();
            le.nextLine();
            if(op == 2){
                break;
            }
        }
    }
    static void criarCategoria(String nome, Categoria Cat){
        Scanner le = new Scanner(System.in);
        int i = 0;
        System.out.println("Insira o nome da Categoria : ");
        nome = le.nextLine();
        Cat.setNomeCategoria(nome);
        Cat.setIdCategoria(i);
    }
}
