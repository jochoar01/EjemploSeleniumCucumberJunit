package Apis;

public class PeliculasSearch {

    private String Title;
    private String Year;
    private String imdbID;
    private String Type;
    private String Poster;

        public PeliculasSearch(String type,String year,String imdbID,String poster,String title) {
            Title = title;
            Year = year;
            this.imdbID = imdbID;
            Type = type;
            Poster = poster;
        }

    public String getTitle() {
        return Title;
    }

    public String getYear() {
        return Year;
    }

    public String getImdbID() {
        return imdbID;
    }

    public String getType() {
        return Type;
    }

    public String getPoster() {
        return Poster;
    }

    // Setter Methods

    public void setTitle( String Title ) {
        this.Title = Title;
    }

    public void setYear( String Year ) {
        this.Year = Year;
    }

    public void setImdbID( String imdbID ) {
        this.imdbID = imdbID;
    }

    public void setType( String Type ) {
        this.Type = Type;
    }

    public void setPoster( String Poster ) {
        this.Poster = Poster;
    }
}



