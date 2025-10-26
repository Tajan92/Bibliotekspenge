public class EAudioBook extends NetTitle implements Audio {
    private int durationsInMinutes;


    public EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationsInMinutes) {
        super(title, literatureType, availability, reach, use);
        this.durationsInMinutes = durationsInMinutes;
    }

    @Override
    protected double calculatePoints() {
        //Beregnede sider × litteraturtype × ((udbredelse × 5) + (tilgængelighed × 0,5) + anvendelsesfaktor)
        //220 sider × 1 × ((50 × 5) + (97 × 0,5) + 205) = 110770 point
        return durationsInMinutes *convertLiteratureType()*((getReach()*5)+(getAvailability()*0.5)+getUse());
    }
}
