package com.maia;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Maia on 3/10/2017.
 */
public class LakeRun {
    private String name;
    private Double time;
    private ArrayList<Double> runTimes;

    public LakeRun(String lakeName, Double runTime) {
        this.name = lakeName;
        this.time = runTime;
        this.runTimes = new ArrayList<Double>();  //Set up the students list
        runTimes.add(time);
    }

    //Method to add additional times
    public void addTime(double time) {
        runTimes.add(time);
    }

    //Method that returns the best time for each lake
    public void getBestTime() {
        ArrayList<Double> copy = (ArrayList<Double>) runTimes.clone();
        Collections.sort(copy);
        System.out.println(name + ", " + copy.get(0));
    }

    //Method that returns lake information
    public void writeRunInfo() {
        for (Double time : runTimes) {
            System.out.println(name + ", " + time);
        }
        System.out.println();
    }
}
