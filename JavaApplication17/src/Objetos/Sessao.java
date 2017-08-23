package Objetos;

    import java.sql.SQLException ;
    import java.util.logging.Level ;
    import java.util.logging.Logger ;

public class Sessao {

    //não sei o que fazer com aqueles itens Filme e Sala, então vou fazer o que 
    //eu tives certezxa como se faz
    //SUGESTÃO: troca aquela coisa no hora de início por dois fields de número e 
    //valida hora e minuto separado.

    private SessaoDAO dao;
    private float preco;
    private int hora, minuto;

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) throws Exception {
        if((preco > 0) && (preco < 1000)){
        this.preco = preco;
        } else {
            throw new Exception("preço inválido.");
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) throws Exception {
        if((hora > -1) && (hora < 23)){
        this.hora = hora;
        } else {
            throw new Exception("hora inválida.");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) throws Exception {
        if((minuto > -1) && (minuto < 59)){
        this.minuto = minuto;
        } else {
            throw new Exception("minutos inválidos.");
        }
    }
    
    public Sessao (float preco, int hora, int minuto){
        this.preco = preco;
        this.hora = hora;
        this.minuto = minuto;
        this.dao = new SessaoDAO(this);
    }
    
    public void sendToBD(){
        try {
            dao.adicionaSessao();
        } catch (SQLException ex) {
            Logger.getLogger(Sessao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro do SQL!");
        }
    }   
    
}
