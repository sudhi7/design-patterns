package structuralPatterns.decoratorPattern.decorators;

import structuralPatterns.decoratorPattern.Application;

public class Reels extends FeatureDecorator {

    public Reels(Application socialMedia) {
        this.socialMedia = socialMedia;
    }

    @Override
    public String getDescription() {
        return socialMedia.getDescription() + " with reels";
    }

    @Override
    public int memory() {
        return socialMedia.memory() + 25;
    }
}