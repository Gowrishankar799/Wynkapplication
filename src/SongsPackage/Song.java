package SongsPackage;

public class Song {
    private String title;
    private double duration;

    public String getTitle() {
        return title;
    }
    Song(String title,double duration){
        this.title = title;
        this.duration = duration;
    }

    public void setTitle(String tile) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
