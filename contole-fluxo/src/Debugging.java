public class Debugging {

   public static void main(String[] args) {
        System.out.println("Iniciado o método main");
        a();
        System.out.println("Finalizado o método main");
   }

    static void a() {
        System.out.println("Iniciado o método a");
        b();
        System.out.println("Finalizado o método a");    
    }

    static void b() {
        System.out.println("Iniciado o método b");
        for (int i = 0; i <= 4; i++) System.out.println("i = " + i);
        c();
        System.out.println("Finalizado o método b");    
    }

    static void c (){
        System.out.println("Iniciado o método c");
        System.out.println("Finalizado o método c");    
    
}
}
