public class Mouse {
    String foodType;
    int amtFood;
    int workouts;
    int mins;

    public Mouse (String foodType, int amtFood, int workouts, int mins){
        this.foodType = foodType;
        this.amtFood = amtFood;
        this.workouts = workouts;
        this.mins = mins;
    }
}

 class Weight extends Mouse {
    public Weight(String foodType, int amtFood, int workouts, int mins) {
        super(foodType, amtFood, workouts, mins);
    }
}