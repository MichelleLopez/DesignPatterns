
public class Factory {

    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car luxuryCar = factory.buildCar(CarType.LUXURYCAR);
        System.out.println(luxuryCar.getModel());
        Car sedanCar = factory.buildCar(CarType.SEDANCAR);
        System.out.println(sedanCar.getModel());
        Car smallCar = factory.buildCar(CarType.SMALLCAR);
        System.out.println(smallCar.getModel());
    }
    
}