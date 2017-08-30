package com.reetfreelance.rm.funfacts;

import java.util.Random;

public class ColorPalette {
    private String colors[]=//{"#5ABAB6","#51b46d","#DEAB42","#DE575E","#695E86","#4C4B51","#EF8265"};
            {
                    "#39add1", // light blue
                    "#3079ab", // dark blue
                    "#c25975", // mauve
                    "#e15258", // red
                    "#f9845b", // orange
                    "#838cc7", // lavender
                    "#7d669e", // purple
                    "#53bbb4", // aqua
                    "#51b46d", // green
                    "#e0ab18", // mustard
                    "#637a91", // dark gray
                    "#f092b0", // pink
                    "#b7c0c7"  // light gray
            };

    public String getBGColor(){
        Random randomGen=new Random();
        int randomNumber=randomGen.nextInt(colors.length);
        return colors[randomNumber];
    }
}
