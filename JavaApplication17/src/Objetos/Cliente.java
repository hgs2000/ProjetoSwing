package Objetos;

/**
 *
 * @author informatica
 */
public class Cliente {

    private String nome, endereco;
    private int idade;
    boolean sexo;//true : masc, false femi;

    public Cliente(String nome, String endereco, int idade, boolean sexo) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (!nome.isEmpty()) {
            this.nome = nome;
        }else{
            throw new Exception("nome invalido");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) throws Exception {
        if (!endereco.isEmpty()) {
            this.endereco = endereco;
        } else {
            throw new Exception("endereco invalido");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws Exception {
        if ((idade > 17) && (idade < 150)) {
            this.idade = idade;
        } else {
            throw new Exception("idade invalida");
        }
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

}
