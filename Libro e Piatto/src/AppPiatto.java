import java.util.Scanner;

public class AppPiatto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // chiedo di inserire tutti i dati di un piatto di un ristorante

        System.out.println("Salva un nuovo piatto.");

        System.out.println("Nome del piatto");
        String nome = sc.nextLine();

        System.out.println("Descrizione");
        String descrizione = sc.nextLine();

        System.out.println("Foto");
        String foto = sc.nextLine();

        System.out.println("Tipologia");
        System.out.println ("1- Piatto del giorno 2- Menù serale 3- Menù pranzo domenicale");
        Byte tipologia = sc.nextByte();
        sc.nextLine();

        System.out.println("Allergeni");
        String allergene = sc.nextLine();

        System.out.println("Prezzo");
        Double prezzo = sc.nextDouble();

        System.out.println("Calorie");
        Short caloria = sc.nextShort();
        sc.nextLine();

        System.out.println("Variazioni");
        String variazione = sc.nextLine();

        System.out.println("È disponibile? true/false");
        Boolean disponibile = sc.nextBoolean();


        // mostro i dati ----------------------------------------------------


        System.out.println("Hai salvato il seguente piatto:");
        System.out.println("Nome: " +nome);
        System.out.println("Descrizione: " +descrizione);
        System.out.println("Foto:" +foto);
        System.out.println("Tipologia:" +tipologia);
        System.out.println("Allergeni" +allergene);
        System.out.println("Prezzo: " +prezzo);
        System.out.println("Calorie: " +caloria);
        System.out.println("Variazioni:" +variazione);
        System.out.println("Disponibilità:" +disponibile);

        sc.close();
    }
    
}
