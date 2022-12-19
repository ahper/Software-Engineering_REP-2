package model;

import javafx.scene.image.Image;

public class ImageCollections implements Aggregate {

    private String filetopic;
    private Image bi;

    public ImageCollections(String filetopic){
        this.filetopic = filetopic;
    }

    @Override
    public Iterator getIterator() {
        return new ImageIterator();
    }

    private class ImageIterator implements Iterator{
        private int current = 0;
        @Override
        public boolean hasNext() {
            String filename = filetopic + (current + 1) + ".jpg";
            try{
                bi = new Image(filename);
                return true;
            }
            catch(Exception exception) {
                System.err.println("Неудалось загрузить картинку! " + filename + exception.getMessage());
                return false;
            }
        }

        @Override
        public Object next() {
            current++;
            return bi;
        }

        @Override
        public Object preview() {
            current = 0;
            return bi;
        }
    }
}
