class credentials{
     int usernumber= 123;
     int password= 456;
}
class changeInfo extends credentials{
    void printcredentials(){
        System.out.println("usernumber: "+usernumber);
        System.out.println("password: "+password);
    }

}