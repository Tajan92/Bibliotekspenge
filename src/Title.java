public abstract class Title {
    private String title;
    private String literatureType;
    private static final double RATE = 0.067574;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    public double calculateRoyalty() {
        return calculatePoints()*RATE;
    }

    protected double calculatePoints() {
        return 0;
    }

    protected double convertLiteratureType() {
        switch (literatureType) {
            case "BI","TE":
                return 3;
            case "LYRIK":
                return 6;
            case "SKØN":
                return 1.7;
            case "FAG":
                return 1;
            default: return 0;
        }
    }

}
