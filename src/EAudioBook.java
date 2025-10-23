public class EAudioBook extends Title {
    private int time;
    private int reach;
    private int availability;
    private int use;

    public EAudioBook(String title, String literatureType, int time, int reach, int availability, int use) {
        super(title, literatureType);
        this.reach = reach;
        this.availability = availability;
        this.use = use;
        this.time = time/2;
    }
    @Override
    protected double calculatePoints() {
        //Beregnede sider × litteraturtype × ((udbredelse × 5) + (tilgængelighed × 0,5) + anvendelsesfaktor)
        //220 sider × 1 × ((50 × 5) + (97 × 0,5) + 205) = 110770 point
        return time *convertLiteratureType()*((reach*5)+(availability*0.5)+use);
    }
}
