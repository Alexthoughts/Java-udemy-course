package LinkedList.Challenge;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override //to show in one line duration and title
    public String toString() {
        return "title: " + title +
                ", duration: " + duration;
    }


}
