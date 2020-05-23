public class Hangar {

    public static void main(String[] args) {
        
        Vehicle v1 = new Car("Clio", 10000);
        Vehicle v2 = new Boat("Titanic", 1000000);

        System.out.println(v1.doStuff());
        System.out.println(v2.doStuff());
        
    }
    
}