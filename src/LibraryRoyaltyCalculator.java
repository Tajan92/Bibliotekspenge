public class LibraryRoyaltyCalculator {
    static void main() {

        Author author = new Author("Mogens");

        PrintedBook p1 = new PrintedBook("Dragen","SKØN",166,140);
        PrintedBook p2 = new PrintedBook("Bo og Lis","BI",37,25);
        AudioBook a1 = new AudioBook("Harry Potter","SKØN",192,140);
        EBook e1 = new EBook("Learning processing","FAG",220,50,97,205);

            //author.addTitle(p1);
            //author.addTitle(p2);
           //author.addTitle(a1);
            author.addTitle(e1);
        System.out.printf(author.getName()+": "+"%.2f"+"kr.",author.calculateRoyalties());

    }


}
