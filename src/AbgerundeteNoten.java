public class AbgerundeteNoten {
    public static int[] roundGrades(int[] grades){
        int[] rounded = new int[grades.length];

        for(int i = 0; i < grades.length; i++){
            int grade = grades[i];

            if(grade < 38) //nu se rotunjeste.
                rounded[i] = grade;
            else{
                int multipleOf5 = ((grade/5 )+ 1) * 5;
                if(multipleOf5 - grade < 5)
                    rounded[i] = multipleOf5;
                else
                    rounded[i] = grade;
            }
        }
        return rounded;
    }
}
