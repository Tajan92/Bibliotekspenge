public abstract class Title {
    private String title;
    private String literatureType;
    private static final double RATE = 0.067574;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    public double calculateRoyalty() {

    }

    protected double calculatePoints() {

    }

    protected double convertLiteratureType() {

    }

}
