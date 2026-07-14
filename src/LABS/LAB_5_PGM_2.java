package LABS;

abstract class vaccine{
    int age;
    String nationality;
    boolean isFirst= false ;
    vaccine(int age, String nationality){
        this.age = age;
        this.nationality = nationality;
    }
    void firstDose(){
        if(age>=18 && nationality.equals("Indian")){
            System.out.println("Your First Dose Succesfully Done, Now you've to pay 250/- rupees");
            isFirst = true;
        }
        else{
            System.out.println("You are not eligible ");
            isFirst = false;
        }

    }
    void secondDose(){
        if(isFirst == true){
            System.out.println("Your Second Dose Succesfully Done");
        }
    }
    abstract void boosterDose();
}
class VaccinationSuccesfull extends vaccine {
    VaccinationSuccesfull(int age, String nationality){
        super(age, nationality);

    }
    @Override
    void boosterDose() {
        System.out.println("Your booster dose is successfully done");
    }

}
public class LAB_5_PGM_2 {
    public static void main(String[] args) {
        VaccinationSuccesfull vs = new VaccinationSuccesfull(18,"Indian");
        vs.firstDose();
        vs.secondDose();
        vs.boosterDose();
    }
}
