import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Sofer sofer = new Sofer("Fantomel",20,"B");
        Autovehicul bolid = new Autovehicul("Ford", Color.WHITE,sofer,240,6,50);
        bolid.plinRezervor(51);
        System.out.println(bolid);
        bolid.accelerare(80);
        bolid.treaptaSuperioara(2);
        System.out.println(bolid);
        bolid.accelerare(300);
        bolid.treaptaSuperioara(3);
        bolid.utilizareRezervor(1);
        System.out.println(bolid);
        bolid.decelerare(30);
        bolid.treaptaInferioara(1);
        bolid.utilizareRezervor(1);
        System.out.println(bolid);
    }
}