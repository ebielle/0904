import java.util.Arrays;

public class Aula {
    private Student[] studentiTot;

    public Aula (Student[] studentiTot) {
        this.studentiTot = studentiTot;
    }

    public Student[] getStudentiTot() {
        return studentiTot;
    }

    private void setStudentiTot(Student[] studentiTot) {
        this.studentiTot = studentiTot;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "studentiTot=" + Arrays.toString(studentiTot) +
                '}';
    }
}
