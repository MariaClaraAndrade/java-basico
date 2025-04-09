public class ResultadoEscolar {
    public static void main(String[] args) {
        // Forma mais avançada e simplificada de fazer a mesma coisa
        // int nota = 6;
        // string resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação": "Reprovado";
        // System.out.println(resultado);


        double notaAluno = 6;

        if ( notaAluno >=7){ 
            System.out.println("Aprovado");
        }
        else if (notaAluno >= 5 && notaAluno < 7) {
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Reprovado");
        }
    }
   
}
