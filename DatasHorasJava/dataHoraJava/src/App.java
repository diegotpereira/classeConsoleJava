import java.text.*;
import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {

        try {
            
            // primeira data
        DateFormat fm = new 
        SimpleDateFormat("dd/MM/yyy");

        Date data1 = (Date)fm.parse("21/12/2021");

        // segunda data
        fm = new SimpleDateFormat("dd/MM/yyyy");
        Date data2 = (Date)fm.parse("01/01/2022");

        // obtendo diferença entre dias 
        long diferenca = data2.getTime() - 
           data1.getTime();

        // exibir resultados
        System.out.println("Primeira data: " + data1.toString());
        System.out.println("Segunda data: " + data2.toString());

        System.out.println("Diferença em, dias = "
            + diferenca / (1000 * 60 * 60 * 24));

        } catch (Exception e) {
            
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
