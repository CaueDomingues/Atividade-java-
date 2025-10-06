// Classe abstrata Animal
abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    // Método abstrato (será sobrescrito nas subclasses)
    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    // Polimorfismo por SOBRECARGA (mesmo nome, parâmetros diferentes)
    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public void comer(String comida) {
        System.out.println(nome + " está comendo " + comida + ".");
    }
}

// Classe concreta Cachorro
class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    // Polimorfismo por SOBRESCRITA (reescreve o método da classe abstrata)
    @Override
    public void emitirSom() {
        System.out.println(nome + " está latindo: Au Au!");
    }

    // Sobrescrita também pode ser aplicada aqui:
    @Override
    public void comer() {
        System.out.println(nome + " está comendo ração de cachorro.");
    }
}

// Classe concreta Peixe
class Peixe extends Animal {
    public Peixe(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " não faz som perceptível.");
    }

    @Override
    public void comer() {
        System.out.println(nome + " está comendo algas.");
    }
}

// Classe pública Main (arquivo deve se chamar Main.java)
public class Main {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Yumi");
        Peixe meuPeixe = new Peixe("Nemo");

        System.out.println("Nome do meu cachorro: " + meuCachorro.getNome());
        meuCachorro.emitirSom();
        meuCachorro.comer();
        meuCachorro.comer("biscoito");

        System.out.println("\nNome do meu peixe: " + meuPeixe.getNome());
        meuPeixe.emitirSom();
        meuPeixe.comer();
    }
}
