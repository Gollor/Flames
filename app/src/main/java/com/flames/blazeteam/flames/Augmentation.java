package com.flames.blazeteam.flames;

/**
 * This class should provide the interface for camera video augmentation.
 */
public class Augmentation {

    public class Rectangle {
        int x, y;
        int width, height;
    }

    /**
     * This function returns the augmented image. All pixels are floats in 0..1.
     * @param image The image from video.
     * @return The new augmented image.
     */
    public float[][] augment(float[][] image)
    {
        //TODO
        float[][] newImage = new float[32][32];
        return newImage;
    }

    /**
     * Returns the image of a required sprite.
     * @param type The type of a sprite.
     * @param time The time since the start of animation.
     * @param animation_total_time The time that the animations requires to play.
     * @return The sprite.
     */
    public float[][] selectSprite(int type, float time, float animation_total_time)
    {
        //TODO
        float[][] sprite = new float[32][32];
        return sprite;
    }

    /**
     * This function detects humans on the image and returns their crop rectangles.
     * It should return the vector of k rectangles, where k is the amount of detected humans.
     * @param image the image to be processed.
     * @return Rectangles with humans boundaries.
     */
    public Rectangle[] detectHuman(float[][] image)
    {
        //TODO
        Rectangle[] rects = new Rectangle[1];
        return rects;
    }
}
