/* Scrivere un programma che contenga una classe che definisce uno Studente che
abbia come proprietà nome, cognome ed identificativo.
Per questa classe saranno necessari i metodi accessori (getters e setters)
ed un costruttore. Nel main dichiarare un oggetto di tipo Studente. */

public class Main1 {
    public static void main(String[] args) {

        Student student1 = new Student("Mario", "Rossi", 3);
        /*student1.name = "Mario";
        student1.surname = "Rossi";
        student1.id = 3;*/

        Student student2 = new Student("Joshua", "Suppain", 4);
        /*student2.name = "Joshua";
        student2.surname = "Suppain";
        student2.id = 5;*/

        System.out.println("Studente 1: " + student1);
        System.out.println("Studente 2: " + student2);

        Aula aula = new Aula(new Student[] {student1, student2});
        //aula.studentiTot = new Student[] {student1, student2};

        System.out.println("Aula: " + aula);

        System.out.println("lo studente selezionato è: " + student1.getName() + " " + student1.getSurname() + ", " + student1.getId());
    }
}
