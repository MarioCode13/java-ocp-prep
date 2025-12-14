public class Main {

    public static void main(String[] args) {

//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado", 1.50);
//        avocado.printItem();


//        Burger burger = new Burger("regular", 4.00);
//        burger.addTopping("CHEESE", "BACON", "BBQ sauce");
//        burger.printItem();

        MealOrder meal = new MealOrder();
        meal.addBurgerToppings("CHEESE", "BACON", "BBQ Sauce");
        meal.setDrinkSize("LARGE");
        meal.printItemisedList();
    }
}