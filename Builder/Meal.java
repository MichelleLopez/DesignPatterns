
public class Meal {
    String sandwich;
    String sides;
    String drink;
    String offer;
    int price;
    
    public Meal(){
    
    }

    @Override
    public String toString() {
        return "Sandwich:" + this.sandwich + 
                "\nAcompañamientos: " + this.sides + 
                "\nBebida: " + this.drink + 
                "\nOferta: " + this.offer + 
                "\nPrecio: " + this.price;
    }
}
