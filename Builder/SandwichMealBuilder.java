
public class SandwichMealBuilder implements MealBuilder{
    private final Meal sandwichMeal = new Meal();


    @Override
    public void addSandwich(String sandwich) {
        sandwichMeal.sandwich =  sandwich;
    }

    @Override
    public void addSides(String sides) {
        sandwichMeal.sides =  sides;
        
    }

    @Override
    public void addDrink(String drink) {
        sandwichMeal.drink =  drink;
    }

    @Override
    public void addOffer(String offer) {
        sandwichMeal.offer =  offer;
    }

    @Override
    public void addPrice(int price) {
        sandwichMeal.price =  price;
    }



    @Override
    public Meal getMeal() {
        return this.sandwichMeal;
    }
}
