public class Driver {

    public static void main(String[] args)
    {
        Book b1 = new Book("Peter", "Jackson", "Lusty Argonian Maid", "Skyrim",
            "Half Price Books", "1231");
        Book b2 = new Book("Benry", "Bored", "The Bible", "Iraq",
                "Half Price Books", "4343");

        Book[] sources = new Book[2];
        sources[0] = b1;
        sources[1] = b2;
        Bibliography mybib = new Bibliography(sources);
        mybib.write();
    }
}
