import java.util.Scanner;

public class AppIngrediente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // chiedo di inserire tutti i dati di un ingrediente di un ristorante

        System.out.println("Salva un nuovo ingrediente.");

        System.out.println("Nome");
        String nome = sc.nextLine();

        System.out.println("Descrizione");
        String descrizione = sc.nextLine();

        System.out.println("Tipologia");
        System.out.println ("1- Pasta 2- Legume 3- Verdura");
        Byte tipologia = sc.nextByte();
        sc.nextLine();

        System.out.println("È disponibile? true/false");
        Boolean disponibile = sc.nextBoolean();

        System.out.println("Costo");
        Double costo = sc.nextDouble();
        sc.nextLine();

        System.out.println("Allergeni");
        String allergene = sc.nextLine();

        System.out.println("Modalita conservazione");
        String conservazione = sc.nextLine();

        System.out.println("Foto");
        String foto = sc.nextLine();     


        // mostro i dati ----------------------------------------------------


        System.out.println("Hai salvato il seguente ingrediente:");
        System.out.println("Nome: " +nome);
        System.out.println("Descrizione: " +descrizione);
        System.out.println("Tipologia:" +tipologia);
        System.out.println("Disponibilità:" +disponibile);
        System.out.println("Costo: " +costo);
        System.out.println("Allergeni" +allergene);
        System.out.println("Variazioni:" +conservazione);
        System.out.println("Foto:" +foto);

        sc.close();
    }
    
}
