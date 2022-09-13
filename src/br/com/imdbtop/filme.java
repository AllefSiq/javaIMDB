package br.com.imdbtop;


public class filme {
    private String id;
    private String rank;
    private String title;
    private String fullTitle;
    private String year;
    private String image;
    private String imDbRating;
    private String imDbRatingCount;
    
    
    public filme(String id, String rank, String title, String fullTitle, String year, String image, String imdbRating,
            String imdbRatingCount) {
        this.id = id;
        this.rank = rank;
        this.title = title;
        this.fullTitle = fullTitle;
        this.year = year;
        this.image = image;
        this.imDbRating = imDbRating;
        this.imDbRatingCount = imDbRatingCount;
    }

    public String getTitle() {
        return title;
    }

    public String getRank() {
        return rank;
    }



    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "[" + this.title + " " + this.rank + " " + this.year+ " " + this.imDbRating + "]";
    }
    
    

}
