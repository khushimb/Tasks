package com.xworkz.tasks1;

public class Pushpa {
    void useClip(Clip[] clips){
        if(clips != null) {
            System.out.println("Running method useClip in class Pushpa ");
            for (Clip clip : clips) {
                clip.hold();
                System.out.println("Running clip in class Pushpa" + clip.color);
            }
        }
        else{
                System.err.println("not null");
            }

    }
}
