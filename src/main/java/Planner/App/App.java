package Planner.App;

import Planner.domain.impl.Breakfast;
import Planner.domain.impl.Shopping;

public class App {
    public static void main(String[] args) {

        // create objects
        Breakfast breakfast = new breakfast ("morning", "middle", "food");
        MeetJohn meetJohn = new meetJohn ("John", "high", "friend");
        Shopping shopping = new shopping ("goshopping", "low", "shopclothes");

        System.out.println(breakfast);
        System.out.println(meetJohn);
        System.out.println(shopping);

    }
}
