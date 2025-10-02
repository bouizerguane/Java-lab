package TP5.Ex2;

public class Main {
    public static void main(String[] args) {
        MediaLibrary lib = new MediaLibrary();
        lib.addMedia(new Audio("Chanson", 180));
        lib.addMedia(new Video("Film", 7200, "1080p"));

        lib.playAll();
    }
}
