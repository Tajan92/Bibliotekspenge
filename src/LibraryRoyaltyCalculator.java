public class LibraryRoyaltyCalculator {
    static void main() {

        Author author = new Author("Mogens");

        PrintedBook p1 = new PrintedBook("Snydt ud af næsen", "SKØN", 166, 140);
        AudioBook a1 = new AudioBook("De bedste familier", "SKØN", 192, 140);
        EBook e1 = new EBook("Learning processing", "FAG", 220, 50, 97, 205,true);
        EAudioBook eA = new EAudioBook("Learning processing(Audio)", "FAG", 220, 50, 97, 205);
        //author.addTitle(p1);
        //author.addTitle(a1);
        author.addTitle(e1);
        //author.addTitle(eA);
        System.out.printf(author.getName() + ": " + "%.2f" + "kr.", author.calculateRoyalties());


    }


}
