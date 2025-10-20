public class AbgerundeteNoten {
    public static int[] roundGrades(int[] grades) {
        int[] rounded = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            if (grade >= 38) {  //daca e mai mica de 30 nu se rotunjeste.
                int next_grade = ((grade / 5) + 1) * 5;
                if (next_grade - grade < 3)
                    grade = next_grade;

            }
            rounded[i] = grade;
        }
        return rounded;
    }
}