public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 50.0 ;
        double valorSaque = 100.0;
    
        if(valorSaque < saldo) {
            saldo = saldo - valorSaque;
            System.out.println("Saque realizado com sucesso! Seu saldo atual é:     " + saldo);

         }   
        else   
            System.out.println("Saldo insuficiente para realizar o saque! Você tem apenas: " + saldo + " reais.");
            
        
    }
}