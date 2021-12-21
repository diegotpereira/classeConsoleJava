import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            GregorianCalendar data = new GregorianCalendar();
            data.setLenient(false);
            // ano
            data.set(GregorianCalendar.YEAR, 2008);
            
            // mês
            data.set(GregorianCalendar.MONTH, 11);

            // dia inválida
            data.set(GregorianCalendar.DATE, 32);

            // validação da data
            Date temp = data.getTime();

        } catch (Exception e) {
            System.out.println("Data inválida.");
            e.printStackTrace();
        }
    }
}
