public class SistemaMedida {
    public static void main(String[] args)  {
        String sigla = "G";
    switch (sigla) {
        case "P":{
            System.out.println("PEQUENO");
            break;  
        }
        case "M":{
            System.out.println("MÉDIO");        
            break; 
        }
        case "G":{
            System.out.println("GRANDE");        
            break; 
        }
        
        default:
            break;
    }
        
    //Same same but different
        
        //String sigla = "G";

       // if (sigla == "M"){
           // System.out.println("MÉDIO");
      //  }
        //else if (sigla == "G"){
          //  System.out.println("GRANDE");
        //}
        //else if (sigla == "P"){
         //   System.out.println("PEQUENO");
        //}
  
        //else {
          //  System.out.println("SIGLA INVÁLIDA!");
        //}
    //}
}
}