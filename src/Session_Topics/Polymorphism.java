package Session_Topics;

class Plane{
    void takeoff(){
        System.out.println("Take off");
    }
    void fly(){
        System.out.println("Fly");
    }
    void land(){
        System.out.println("Land");
    }

}

class CargoPlane extends Plane{
    void fly(){
        System.out.println("Cargo plane if flying at low heights");
    }
    void carryCargo(){
        System.out.println("Cargo plane if flying at low heights ");
    }
}

class PassengerPlane extends Plane{
    void fly(){
        System.out.println("Passenger plane if flying at low heights");
    }
    void carryPassengers(){
        System.out.println("Passenger plane carries passengers");
    }
}
class FighterPlane extends Plane{
    void fly(){
        System.out.println("Fighter Session_Topics.Plane is flying at great heights");
    }
    void carryWeapons(){
        System.out.println("Fighter plane is carrying weapons");
    }

}
public class Polymorphism {
    void Permit(Plane ref){
        ref.takeoff();
        ref.fly();
        ref.land();
    }
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

//        cp.takeoff();
//        cp.fly();
//        cp.land();
//        cp.carryCargo();
//
//        pp.takeoff();
//        pp.fly();
//        pp.land();
//        pp.carryPassengers();
//
//        fp.takeoff();
//        fp.fly();
//        fp.land();
//        fp.carryWeapons();

        Polymorphism m = new Polymorphism();
        m.Permit(cp);
        m.Permit(pp);
        m.Permit(fp);

    }

}
