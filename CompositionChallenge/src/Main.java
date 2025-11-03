public class Main {

    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
        kitchen.addWater();
        kitchen.loadDishwasher();
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();

//        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }
}
