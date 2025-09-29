// Classe abstrata Animal
abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }
}

// Classe concreta Cachorro
class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está latindo: Au Au!");
    }
}

// Classe pública Main (arquivo deve se chamar Main.java)
public class Main {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Yumi"); // <-- aqui
        System.out.println("Nome do meu animal de estimação: " + meuCachorro.getNome());
        meuCachorro.emitirSom();
    }
}
