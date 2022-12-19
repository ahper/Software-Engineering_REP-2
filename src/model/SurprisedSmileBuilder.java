package model;

import model.modelSmile.Eyes;
import model.modelSmile.Head;
import model.modelSmile.Mouth;
import model.modelSmile.Nose;

public class SurprisedSmileBuilder implements Builder {
    private Smile smiley = new Smile();

    @Override
    public void buildHead() {
        this.smiley.setHead(new Head());
    }

    @Override
    public void buildEyes() {
        Eyes [] eyes = new Eyes[]{
                new Eyes(),
                new Eyes()
        };
        eyes[0].LeftEye();
        eyes[1].RightEye();
        this.smiley.setEyes(eyes);
    }

    @Override
    public void buildNose() {
        this.smiley.setNose(new Nose());
    }

    @Override
    public void buildMouth() {
        Mouth mouth = new Mouth();
        mouth.SurprisedSmileyMouth();
        this.smiley.setMouth(mouth);
    }

    @Override
    public Smile getSmile() {
        return smiley;
    }
}
