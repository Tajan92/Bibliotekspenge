public abstract class NetTitle extends Title {
    private int availability;
    private int reach;
    private int use;

    public NetTitle(String title, String literatureType, int availability, int reach, int use) {
        super(title, literatureType);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }
   /* protected double getPseudoCopies(){

    }*/
    private int getUseFactor(){
        int useFactor=switch (use){
            case Integer i when (i >= 1 && i <= 25) -> 0;
            case Integer i when (i>=26 && i <=75)-> 50;
            case Integer i when (i>=76 && i <=150)-> 100;
            case Integer i when (i>=151 && i <=400)-> 150;
            case Integer i when (i>=401 && i <=1000)-> 200;
            case Integer i when (i>=1001 && i <=2000)-> 250;
            case Integer i when (i>=2001 && i <=5000)-> 500;
            case Integer i when (i>=5001 && i <=10000)-> 750;
            case Integer i when (i>10000 )-> 1000;
            default -> 0;
        };
        return useFactor;
    }

    public int getAvailability() {
        return availability;
    }

    public int getReach() {
        return reach;
    }

    public int getUse() {
        return getUseFactor();
    }
}
