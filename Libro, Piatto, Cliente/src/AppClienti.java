import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AppClienti {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Registra il tuo cliente");

        System.out.println("Inserisci nome:");
        String nome = sc.nextLine();

        System.out.println("Inserisci cognome:");
        String cognome = sc.nextLine();
        
        System.out.println("Inserisci data di nascita [dd/MM/yyyy]");
        String dataNascitaStr = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascita = LocalDate.parse(dataNascitaStr, formatter);

        System.out.println("Inserisci numero di telefono:");
        String nTelefono = sc.nextLine();

        System.out.println("Inserisci note:");
        String note = sc.nextLine();

        System.out.println("Inserisci e-mail:");
        String email = sc.nextLine();

        System.out.println("Inserisci password:");
        String password = sc.nextLine();

        System.out.println("Inserisci username");
        String username = sc.nextLine();

        System.out.println("Inserisci data iscrizione [dd/MM/yyyy HH:mm]");
        String dataTimeIscrizioneStr = sc.nextLine();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dataTimeiscrizione = LocalDateTime.parse(dataTimeIscrizioneStr, timeFormatter); 

        


        sc.close();

        System.out.println(nome);
        System.out.println(cognome);
        System.out.println(dataNascita);
        System.out.println(nTelefono);
        System.out.println(note);
        System.out.println(email);
        System.out.println(password);
        System.out.println(username);
        System.out.println(dataTimeiscrizione);

    }
}
