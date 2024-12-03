import java.util.Scanner;

public class AppLibro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Crea il tuo libro personalizzato.");

        System.out.println("Titolo");
        String titolo = sc.nextLine();

        System.out.println("Autore");
        String autore = sc.nextLine();

        System.out.println("Genere");
        String genere = sc.nextLine();

        System.out.println("Numero delle pagine");
        short nPagine = sc.nextShort();

        System.out.println("Numero delle copie");
        short nCopie = sc.nextShort();
        sc.nextLine(); // consumo il carattere di fine riga

        System.out.println("Lingua");
        String lingua = sc.nextLine();

        System.out.println("Posizione");
        String posizione = sc.nextLine();

        System.out.println("Editore");
        String editore = sc.nextLine();

        System.out.println("Anno di pubblicazione");
        short annoPubb = sc.nextShort();
        sc.nextLine();

        System.out.println("Descrizione");
        String descrizione = sc.nextLine();

        System.out.println("ISBN");
        String isbn = sc.nextLine();

        // ---------------------------------------------------------

        // versione 1

        System.out.println("Il libro che hai definito:");
        System.out.println("Titolo: " +titolo + "\n" + "Autore: " +autore + "\n" + "Genere: " +genere);
        System.out.println("Pagine: " +nPagine + "\n" + "Copie: " +nCopie);
        System.out.println("Lingua: " +lingua + "\n" + "Posizione: " +posizione + "\n" + "Editore: " +editore);
        System.out.println("Anno di pubblicazione: " +annoPubb + "\n" + "Descrizione: " +descrizione + "\n" + "ISBN: " +isbn);

        // versione 2

        //System.out.println("Titolo: " +titolo);
        //System.out.println("Autore: " +autore);
    

        sc.close();
    }
}
