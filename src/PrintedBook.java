public class PrintedBook extends Title{
    private int pages;
    private int copies;

    public PrintedBook(String title, String literatureType, int pages, int copies) {
        super(title, literatureType);
        this.pages = pages;
        this.copies = copies;
    }

    @Override
    protected double calculatePoints() {
        //Sider × litteraturtype × eksemplarer
        //166 × 1,7 × 140 = 39508 point
        return pages*convertLiteratureType()*copies;
    }
}
