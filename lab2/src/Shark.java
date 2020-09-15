class Shark extends Fish{
    int length;
    double salinity;
    int attacks;

    Shark (int length, int attacks) {
        super(length, 3.75);
        this.attacks = attacks;
    }

    public boolean isNormalSize () {
        return 6 <= this.length;
    }

    public boolean isDangerToPeople (){
        return this.attacks > 1;
    }

}


