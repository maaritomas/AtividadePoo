class Animal {
String nome;
int idade;

Animal() {}

public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public int getIdade() {

    return idade;
}
public void setIdade(int idade) {
    this.idade = idade;
}
void nadameEmitemsom() {}
}

class Peixe extends Animal {
    String tipo;
    Peixe() {}

    void emitirSom() {
        System.out.println( idade + tipo + nome );
        System.out.println("Peixes são animais que nadam"  + " e emitem som de acordo com o tipo de peixe");

    }
}

public class Main {
    public static void main(String[] args) {
        Peixe peixe = new Peixe();
        peixe.emitirSom();
    }
}
