class Reading {

    private Time aTime;
    private double temp;
    private double amtRainfall;

    protected Reading(Time aTime, double temp, double amtRainfall){
        this.aTime = aTime;
        this.temp = temp;
        this.amtRainfall = amtRainfall;
    }

    public double getTemp1(){
        return temp;
    }

    public double getRainfall(){
        return amtRainfall;
    }


}
