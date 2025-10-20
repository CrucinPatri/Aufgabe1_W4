public class Durchschnittswert {
    public static double getDurchsnitt(int[] grades) {
        int sum=0;

        for(int grade : grades)
            sum+=grade;

        double medie = (double) sum / grades.length;

        return Math.round(medie*100)/100.0;  //valoarea rotunjita la doua zecimale.
    }
}
