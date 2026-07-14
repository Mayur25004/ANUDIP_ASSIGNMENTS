package Session_Topics;

class bike{
    String brand;
    int mileage;
    bike(String brand, int mileage){
        this.brand= brand;
        this.mileage= mileage;
    }
    String getBrand(){
        return brand;
    }
    int getMileage(){
        return mileage;
    }
}

class book{
    String name;
    String Author;
    book(String name,String Author){
        this.name=name;
        this.Author=Author;
    }
    String getName(){
        return name;
    }
    String getAuthor(){
        return Author;
    }
}
class heart{
    int weight;
    int bpm;
    heart(int weight,int bpm){
        this.weight=weight;
        this.bpm=bpm;
    }
    int getWeight(){
        return weight;
    }
    int getBpm(){
        return bpm;
    }
}
class brain{
    int weight;
    String color;
    brain(int weight,String color){
        this.weight=weight;
        this.color=color;
    }
    int getWeight(){
        return weight;
    }
    String getColor(){
        return color;
    }
}
class Student {
    //composition
    heart heart = new heart(60, 100);
    brain brain = new brain(1800, "pink");

    void Heart(){
        System.out.println(heart.getWeight());
        System.out.println(heart.getBpm());
    }
    void Brain(){
        System.out.println(brain.getWeight());
        System.out.println(brain.getColor());
    }
    void hasBike(bike b){
        System.out.println(b.getBrand());
        System.out.println(b.getMileage());
    }
    void hasBook(book bk){
        System.out.println(bk.getName());
        System.out.println(bk.getAuthor());
    }
}
public class Aggr_Comp {
    public static void main(String[] args) {
        bike b = new bike("RE",30);
        book bk = new book("INT INV", "Benjamin");
        Student s = new Student();
        s.hasBook(bk);
        s.hasBike(b);
        s.Heart();
        s.Brain();
    }
}

