public class Book {

    private String title;
    private int ageRecommended;


    public Book(String title, int ageRecommended){
        this.title = title;
        this.ageRecommended = ageRecommended;
    }

    @Override
    public String toString(){
        return this.title + " (recommended for " + this.ageRecommended + " year-olds or older)";
    }

    public String getTitle(){
        return this.title;
    }

    public int getAgeRecommended(){
        return this.ageRecommended;
    }
}
