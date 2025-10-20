public class MaximaleNote {
    public static int getMaximalRoundedGrades(int[] grades){
        int[] rounded = AbgerundeteNoten.roundGrades(grades);
        int max = rounded[0];

        for(int grade: rounded)
            if(grade > max)
                max = grade;
        return max;
    }
} //gaseste cea mai mare nota dupa rotunjire
