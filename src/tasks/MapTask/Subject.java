package tasks.MapTask;

public class Subject {

    int sciMarks, tamMarks, engMarks, matMarks;

    public Subject(int sciMarks, int tamMarks, int engMarks, int matMarks) {
        this.sciMarks = sciMarks;
        this.tamMarks = tamMarks;
        this.engMarks = engMarks;
        this.matMarks = matMarks;
    }

    public int calcTot()
    {
        return sciMarks+tamMarks+engMarks+matMarks;
    }
}
