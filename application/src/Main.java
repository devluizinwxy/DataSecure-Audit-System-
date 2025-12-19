
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           Auditoria auditoriaDeSeguranca = new AuditoriaDeSeguranca();
           Auditoria auditoriaFinanceira = new AuditoriaFinanceira();
           try {
               auditoriaDeSeguranca.gerarRelatorio("sistema.log");
               auditoriaFinanceira.gerarRelatorio("sistema.log");
           } catch (RuntimeException e) {
               System.out.println("Erro "+ e.getMessage());
               e.printStackTrace();
           }
        sc.close();
    }
}
