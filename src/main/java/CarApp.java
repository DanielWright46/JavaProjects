public class CarApp {
    public static void main(String[] args) {
        Car coupe = new Car("Ford", "Mustang","20,000");
        System.out.println("The coupe's make is "+ coupe.getMake());
        System.out.println("The coupe's model is "+ coupe.getModel());
        System.out.println("The coupe's price is " + coupe.getPrice());

        System.out.println(coupe.toString());
        coupe.downloading();

        System.out.println("");

        Car sedan = new Car("Ford", "Fusion","15,000");
        System.out.println("The coupe's make is "+ sedan.getMake());
        System.out.println("The coupe's model is "+ sedan.getModel());
        System.out.println("The coupe's price is " + sedan.getPrice());

        System.out.println(sedan.toString());
        sedan.downloading();
    }
}
