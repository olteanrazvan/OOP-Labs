public class Student implements Cloneable {
    String nume;
    int id;
    Masina masina;

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String nume, int id, Masina masina){
        this.nume = nume;
        this.id = id;
        this.masina = masina;
    }
    public Student clone(){
        try{
            Student copieStudent;
            copieStudent = (Student)super.clone();
            copieStudent.masina = masina.clone();
            return copieStudent;
        }
        catch(Exception e){
            System.out.println("Not Clonable");
            return null;
        }
    }
    public String toString(){
        return "Studentul " + nume + " cu id-ul " + id + " si cu masina de marca " + masina.getMarca() +
                " de culoare " + masina.getCuloare();
    }
}
