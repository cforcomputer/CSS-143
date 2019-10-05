public class Bibliography {
    // Description
    // Attributes (data):
    //
    // Methods (actions):
    // Add source/entry
    // Remove source/entry
    // Write out the bibliography
    public Book[] sources = null;

    public void Bibliography(Book[] inSources)
    {
        sources = inSources;
    }

    public void write()
    {
        for (int i=0; i< sources.length; i++)
        {
            sources[i].write();
            System.out.println();
        }
    }
}
