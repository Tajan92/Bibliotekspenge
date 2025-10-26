public class EBook extends NetTitle {

    private int characters;
    boolean illustrated;

    public EBook(String title, String literatureType, int availability, int reach, int use, int characters, boolean illustrated) {
        super(title, literatureType, availability, reach, use);
        this.characters = characters;
        this.illustrated = illustrated;
    }

    private double calculatePages() {
        int pages = characters/1800+20;
        if(illustrated){
            pages *= 1.2;
        }
        return pages;
    }

    @Override
    protected double calculatePoints() {
        //Beregnede sider × litteraturtype × ((udbredelse × 5) + (tilgængelighed × 0,5) + anvendelsesfaktor)
        //220 sider × 1 × ((50 × 5) + (97 × 0,5) + 205) = 110770 point
        return calculatePages() * convertLiteratureType() * ((getReach() * 5) + (getAvailability() * 0.5) + getUse());
    }
}
