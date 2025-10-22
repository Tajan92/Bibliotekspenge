public class LibraryRoyaltyCalculator {
    static void main() {

        Author a1 = new Author("Mogens");
        PrintedBook p1 = new PrintedBook("Dragen","LYRIK",254,6);
        PrintedBook p2 = new PrintedBook("Bo og Lis","BI",37,25);
        AudioBook ab1 = new AudioBook("Dragen","LYRIK",2400,8);
            a1.addTitle(p1);
            a1.addTitle(p2);
            a1.addTitle(ab1);

            a1.calculateRoyalties();
    }


}
