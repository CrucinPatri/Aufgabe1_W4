import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int grades[] = {29, 37, 38, 41, 84, 67};

        // nicht ausreichend
        int[] insufficient = NichtAusreichendeNote.InsufficientNotes(grades);
        System.out.println("Nicht ausreichende Noten: " + Arrays.toString(insufficient));

        // Mittelnote.
        double medie = Durchschnittswert.getDurchsnitt(grades);
        System.out.println("Durchschnittswert: " + medie);
    }
}
