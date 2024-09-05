public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model = "Toyota";
        myCar.year = 2020;
        myCar.drive();

        Motor myMotor1 = new Motor("Honda",2007);
        System.out.println(myMotor1.model+ " "+ myMotor1.year);
        Motor myMotor2 = new Motor("Kawasaki", 2017);
        System.out.println(myMotor2.model+ " "+ myMotor2.year);

        Sepeda mySepeda = new Sepeda();
        System.out.println(mySepeda.model+ " "+ mySepeda.year);
        Sepeda mySepeda2 = new Sepeda();
        System.out.println(mySepeda2.model+ " "+ mySepeda2.year);

    }
}