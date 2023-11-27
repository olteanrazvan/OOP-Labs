public class Masina implements Cloneable,Comparable{
    String marca;
    int id;
    String culoare;
    public Masina(String marca,String culoare,int id){
        this.marca = marca;
        this.culoare = culoare;
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public void vopsire(String culoare) {
        this.culoare = culoare;
    }
    public Masina clone(){
        try{
            return (Masina) super.clone();
        }
        catch(Exception e){
            System.out.println("Not Clonable");
            return null;
        }
    }
    public int compareTo(Object o){
        Masina temp = (Masina) o;
        return id - temp.id;
    }
    public String toString(){
        return "Masina de marca " + marca + " de culoare " + culoare;
    }
}
