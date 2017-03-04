package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.Accessory;
import com.example.motion.MotionDetector;

import java.util.ArrayList;
import java.util.List;

public class FrightMachine extends MotionDetector {

    List<Accessory> accessories;

    public FrightMachine() {
        accessories = new ArrayList<>();
    }

    public void addObserver(Accessory accessory){
        accessories.add(accessory);
    }

    public void removeObserver(Accessory accessory){
        accessories.remove(accessory);
    }
    
    @Override
    public void onMotionDetected() {
        accessories.stream().forEach(Accessory::activate);
    }
}
