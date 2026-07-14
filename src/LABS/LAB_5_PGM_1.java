package LABS;

class HillStations{
    void Location(){
        System.out.println("location: ");
    }
    void FamousFor(){
        System.out.println("famous: ");
    }
}
class Manali extends HillStations{
    void Location(){
        System.out.println("LABS.Manali is in Himachal Pradesh ");
    }
    void FamousFor(){
        System.out.println("Famous for Temple and adventure sports");
    }
}
class Mussorie extends HillStations{
    void Location(){
        System.out.println("LABS.Mussorie is in UttarKhand ");
    }
    void FamousFor(){
        System.out.println("Famous for education institutes");
    }
}
class Gulmarg extends HillStations{
    void Location(){
        System.out.println("LABS.Gulmarg is in J&K ");
    }
    void FamousFor(){
        System.out.println("Famous for skiing");
    }
}
public class LAB_5_PGM_1 {
    void permit(HillStations h){
        h.Location();
        h.FamousFor();
    }
    public static void main(String[] args) {
        LAB_5_PGM_1 m = new LAB_5_PGM_1();

        Manali ma = new Manali();
        Mussorie mus = new Mussorie();
        Gulmarg gul = new Gulmarg();

        m.permit(ma);
        m.permit(mus);
        m.permit(gul);
    }
}
