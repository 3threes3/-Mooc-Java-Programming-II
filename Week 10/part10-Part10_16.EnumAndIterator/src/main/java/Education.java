public enum Education {

    PHD("Doctoral Degree"),
    MA("Masters Degree"),
    BA("Bachelors Degree"),
    HS("High School Diploma");


    private String subject;

    private Education(String subject){
        this.subject = subject;
    }

    private String getSubject(){
        return this.subject;
    }
}
