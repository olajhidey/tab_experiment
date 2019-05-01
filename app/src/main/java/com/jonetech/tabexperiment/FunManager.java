package com.jonetech.tabexperiment;

import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

public class FunManager {

    private ArrayList<Fun> sports = new ArrayList<>();
    private ArrayList<Fun> foods = new ArrayList<>();
    private ArrayList<Fun> smiley = new ArrayList<>();


    public ArrayList<Fun> initializeSports() {
        this.sports.add(new Fun("Football", R.drawable.football));
        this.sports.add(new Fun("BasketBall", R.drawable.basketball));
        this.sports.add(new Fun("Baseball", R.drawable.baseball));
        this.sports.add(new Fun("Boxing", R.drawable.boxing));
        this.sports.add(new Fun("Bowling", R.drawable.bowling));
        this.sports.add(new Fun("Golf", R.drawable.golf));
        this.sports.add(new Fun("Cricket", R.drawable.cricket));
        this.sports.add(new Fun("Go Kart", R.drawable.gokart));
        this.sports.add(new Fun("Skateboard", R.drawable.skateboard));
        this.sports.add(new Fun("Volleyball", R.drawable.volleyball));


        return this.sports;
    }


    public ArrayList<Fun> initializeSmileys() {


        this.smiley.add(new Fun("Happy", R.drawable.happy));
        this.smiley.add(new Fun("Cool", R.drawable.cool));
        this.smiley.add(new Fun("Nerd", R.drawable.nerd));
        this.smiley.add(new Fun("Sick", R.drawable.sick));
        this.smiley.add(new Fun("Surprised", R.drawable.surprised));

        return this.smiley;
    }

    public ArrayList<Fun> initializeFoods() {

        this.foods.add(new Fun("Cheese", R.drawable.cheese));
        this.foods.add(new Fun("Spaguetti", R.drawable.spaguetti));
        this.foods.add(new Fun("Pie", R.drawable.pie));
        this.foods.add(new Fun("Rice", R.drawable.rice));
        this.foods.add(new Fun("Salad", R.drawable.salad));
        this.foods.add(new Fun("Pizza", R.drawable.pizza));
        this.foods.add(new Fun("Tacos", R.drawable.taco));
        this.foods.add(new Fun("Potatoes", R.drawable.potatoes));
        this.foods.add(new Fun("Turkey", R.drawable.turkey));

        return this.foods;
    }
}
