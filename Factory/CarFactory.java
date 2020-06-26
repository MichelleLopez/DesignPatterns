
public class CarFactory {
    
    public Car buildCar(CarType type){
        if(type.equals(CarType.LUXURYCAR)){
            return new LuxuryCar();
			
        }else if(type.equals(CarType.SEDANCAR)){
            return new SedanCar();
           
        }else if(type.equals(CarType.SMALLCAR)){
            return new SmallCar();
        }
		
        return new Car(type);
    }
    
}
