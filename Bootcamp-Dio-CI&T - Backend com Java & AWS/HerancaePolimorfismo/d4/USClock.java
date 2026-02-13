package HerancaePolimorfismo.d4;

public non-sealed class USClock extends Clock{


    private String perioIndicator;

    public String getPerioIndicator() {
        return perioIndicator;
    }



    public void setAfterMidDay(){
        this.perioIndicator = "PM";

    }

    public void setBeforeMidDay(){
        this.perioIndicator = "AM";

    }

    public void setHour(int hour) {
        setBeforeMidDay();
        if(hour > 12 && hour <= 23){
            setBeforeMidDay();
            this.hour = hour - 12;
        }else if(hour >= 24){
            this.hour = 0;
        }else{
            this.hour = hour;
        }
    }


    @Override
    Clock convert(Clock clock){
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock){
            case USClock usClock -> {
                this.hour = usClock.getHour();
                this.perioIndicator = usClock.getPerioIndicator();
            }
            case BRLClock brlclock-> this.setHour(brlclock.getHour());

        }
        return this;
    }
    @Override
    public String getTime(){
        return super.getTime() +" "+ this.perioIndicator;
    }

}
