public class Main {
    public static void main(String[] args) {
        Ghiozdan g = new Ghiozdan(5);
        Manual m1 = new Manual("Mate");
        Caiet c1 = new Caiet("AF");
        Manual m2 = new Manual("Baze de date");
        Caiet c2 = new Caiet("OOP");
        Caiet c3 = new Caiet("Tema");
        g.add(m1);
        g.add(c2);
        g.add(m2);
        g.add(c1);
        g.add(c3);
        g.listItems();
        System.out.println();
        g.listCaiet();
        System.out.println();
        g.listManual();
        System.out.println();
        System.out.println("Avem in total " + g.getNrRechizite() + " rechizite dintre care " + g.getNrCaiete() + " sunt caiete, iar " + g.getNrManuale() + " sunt manuale");
    }
}