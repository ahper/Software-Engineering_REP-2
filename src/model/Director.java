package model;

public class Director {
    public Smile construct(Builder builder) {
        builder.buildHead();
        builder.buildEyes();
        builder.buildNose();
        builder.buildMouth();
        return builder.getSmile();
    }
}
