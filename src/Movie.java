public class Movie {

    private String title;
    private int id;
    private String posterPath;
    private boolean adult;

    public Movie(String title, int id, String posterPath, boolean adult)
    {
        this.title = title;
        this.id = id;
        this.posterPath = posterPath;
        this.adult = adult;
    }

    public String getTitle()
    {
        return title;
    }

    public int getID()
    {
        return id;
    }

    public String getPosterPath()
    {
        return posterPath;
    }

    public boolean isAdult() { return adult;}
}
