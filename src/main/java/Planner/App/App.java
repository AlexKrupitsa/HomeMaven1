package Planner.App;

import Planner.domain.impl.Breakfast;
import Planner.domain.impl.MeetJohn;
import Planner.domain.impl.Shopping;

public class App {
    public static void main(String[] args) {

        // create objects
        Breakfast breakfast = new Breakfast ("morning", 4, "food");
        MeetJohn meetJohn = new MeetJohn ("John", 9, "friend");
        Shopping shopping = new Shopping ("goshopping", 7, "shopclothes");

        System.out.println(breakfast);
        System.out.println(meetJohn);
        System.out.println(shopping);

    }
}
