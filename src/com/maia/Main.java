package com.maia;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //add lake and initial time
        LakeRun cedar = new LakeRun("Cedar", 45.15);
        //add additional times
        cedar.addTime(43.32);
        //print out lake information
        cedar.writeRunInfo();

        LakeRun harriet = new LakeRun("Harriet", 49.34);
        harriet.addTime(44.43);
        harriet.addTime(46.22);
        harriet.writeRunInfo();

        LakeRun como = new LakeRun("Como", 32.11);
        como.addTime(28.14);
        como.writeRunInfo();

        //Add each lake object to an array
        ArrayList<LakeRun> lakes = new ArrayList<>();
        lakes.add(cedar);
        lakes.add(harriet);
        lakes.add(como);

        //Use for loop to print out the best times for each lake
        System.out.println("Best Times:");
        for (LakeRun lake : lakes) {
            lake.getBestTime();
        }
    }
}
