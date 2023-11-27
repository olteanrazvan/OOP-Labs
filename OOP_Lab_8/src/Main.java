import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Masina dacia = new Masina("Logan","Gri",0);
        Student s = new Student("Marcel",1,dacia);
        Student s1 = s.clone();
        System.out.println(s);
        System.out.println(s1);
        s1.masina.vopsire("Alba");
        System.out.println(s1);
        System.out.println(s);
        Masina m1 = new Masina("Ford","Negru",3);
        Masina m2 = new Masina("Toyota","Roz",4);
        Masina m3 = new Masina("Mercedes","Gri",2);
        Masina m4 = new Masina("VW","Portocalie",1);
        Masina arr[] = new Masina[4];
        arr[0] = m1;
        arr[1] = m2;
        arr[2] = m3;
        arr[3] = m4;
        Arrays.sort(arr);
        for(Masina i:arr){
            System.out.println(i);
        }
    }
}