public class RepeticaoForArray {
    public static void main(String[] args) {
        
         String alunos [] = { "Lucas", "Ana", "Pedro", "Maria", "João" };

        // for (int i = 0; i < alunos.length; i++) {
            // System.out.println("Aluno " + (i + 1) + ": " + alunos[i]);

       // }

       for (String aluno: alunos){  //Forma mais limpa de fazer o mesmo que foi feito acima
        System.out.println("Aluno: " + aluno);
       }
        
        
}
}
