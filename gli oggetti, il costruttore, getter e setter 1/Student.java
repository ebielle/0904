public class Student {
    private String name;

    private String surname;

    private int id;
    //se mettiamo final non possiamo neanche cambiare con i setter.

    public Student(String name, String surname, int id) {
        //un metodo con lo stesso nome della classe è un costruttore.
        this.name = name;
        this.surname = surname;
        this.id = id;
        //this. è l'accessore all'istanza.
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }
}
