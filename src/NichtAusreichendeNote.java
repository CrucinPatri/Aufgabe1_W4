public class NichtAusreichendeNote {
    //note insuficiente cele < 40.
    public static int[] InsufficientNotes(int[] grades) {
        int count = 0; //pt. lista rezultanta.

        //int grade = 0;
        for (int grade : grades) {
            if (grade < 40)
                count++;
        }

        int[] result = new int[count];
        int i = 0;

        for (int grade : grades) {
            if (grade < 40)
                result[i++] = grade;

        }
        return result;
    }
}
