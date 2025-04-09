public class LoopWhileLojaDoces {

    public static void main(String[] args) {
        int quantidadeDoces = 0;
        int totalDoces = 0;
        double valorDoce = 0.50;
        double valorTotal = 0.0;

        while (quantidadeDoces < 10) {
            quantidadeDoces++;
            totalDoces += quantidadeDoces;
            valorTotal += valorDoce * quantidadeDoces;
        }

        System.out.println("Quantidade total de doces: " + totalDoces);
        System.out.println("Valor total a ser pago: R$ " + valorTotal);
    }

    
}