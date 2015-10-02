package sramaraj_a3.cs442.com.pizzamenu;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by Nivash on 9/28/2015.
 */
public class PizzaData {


    public static final String[] pizzanames =
            {
                    "1.Veggie Lover's                    $3.23",
                    "2.Pepperoni Lover's              $4.23",
                    "3.Primo Meat                         $5.67",
                    "4.Ultimate Cheese                $7.89",
                    "5.BBQ Lover's                        $8.90",
                    "6.Garden party                      $9.78",
                    "7.Hot & Twisted                    $8.90",
                    "8.Pretzel Piggy                     $6.76",
                    "9.7-Alarm Fire                       $7.89",
                    "10.Cherry Pepper                 $9.80"
            };

    /**
     * Our data, part 2.
     */
    public static final String[] pizzadesc =
            {
                   "So fast and so easy with refrigerated pizza crust, these Barbecued Chicken Pizzas will bring raves with its hot-off-the-grill, rustic flavor. Perfect for a small, spur-of-the-minute backyard pool party!.",
                    "You might need a knife and fork for this hearty pizza! Loaded with Italian flavor and plenty of fresh tomatoes, it's bound to become a family favorite. It's even better with a homemade, whole wheat crust!.",
                    "Socca flatbread, also known as farinata, makes an easy, gluten-free, wholefood pizza base less of a dough and more of a pancake. Here it is flavoured with herbs you can also use cumin or crushed garlic.",
                    "The toppings for pizzette mini pizzas  vary according to what's in season and available. Try sliced roasted courgettes with halved cherry tomatoes and ricotta cheese or sliced artichokes with parmesan shavings and chopped fresh parsley.",
                    "The sunny Crate d'Azur on the coast of France next to Italy is encapsulated in this flavoursome French-style pizza, much loved as a snack or as an appetiser served with drinks.",
                    "Potato pizza is an Italian classic that you don't see very often. This rendition is pretty traditional. The potatoes are soaked in salted water first, which extracts some of their moisture, causing them to cook more quickly and making them firmer.",
                    "This vegetarian pizza is filled with flavour. The crust is made from wholegrain flour and has an intense rosemary kick. Make the oil ahead of time and in bigger quantities; it develops flavour over time and is delicious on salads.",
                    "This thin-crust, pizza-like tart is traditionally topped with creme fraiche, bacon and onions, but blue cheese with walnuts and leeks or simply wild mushrooms are equally delicious combinations.",
                    "Socca flatbread, also known as farinata, makes an easy, gluten-free, wholefood pizza base  less of a dough and more of a pancake. Here it is flavoured with herbs  you can also use cumin or crushed garlic.",
                    "Perfect for barbecues and picnics, these savoury buns are loved by kids and super-easy to make. Serve with a chunky tomato salad"
            };
    public static final int[] pizzaPics =
        {
                R.drawable.veggielovers,
                R.drawable.pepperonilovers,
                R.drawable.primomeat,
                R.drawable.ultimatecheese,
                R.drawable.bbqlovers,
                R.drawable.gardenparty,
                R.drawable.hottwisted,
                R.drawable.pretzelpiggy,
                R.drawable.alarmfire,
                R.drawable.cherrypepper,
                
        };
}




