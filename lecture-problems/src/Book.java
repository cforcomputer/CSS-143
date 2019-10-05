public class Book {
    private String authorLast;
    private String authorFirst;
    private String title;
    private String location;
    private String publisher;
    private String year;

    public Book(String fauthorLast, String fauthorfirst, String ftitle, String flocation,
                String fpublisher, String fyear)
    {
        authorLast = fauthorLast;
        authorFirst = fauthorfirst;
        title = ftitle;
        location = flocation;
        publisher = fpublisher;
        year = fyear;
    }

    public void Print()
    {
        System.out.println(authorLast + " " + authorFirst + " " + title + " " + location + " " + publisher + " "
                + year);
    }
}
