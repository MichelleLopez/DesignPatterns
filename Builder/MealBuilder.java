
public interface MealBuilder {
    public abstract void addSandwich(String sandwich);
    public abstract void addSides(String sides);
    public abstract void addDrink(String drink);
    public abstract void addOffer(String offer);
    public abstract void addPrice(int price);
    
    public abstract Meal getMeal();
}
