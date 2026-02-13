package HerancaePolimorfismo.d4;

public non-sealed class BRLClock extends Clock{
    @Override
   public Clock convert(Clock clock){
        this.second = clock.getSecond();
        this.minute = clock.getMinute();

        switch (clock){
            case USClock usClock -> this.hour = (usClock.getPerioIndicator().equals("PM")) ?
            usClock.getSecond() +12:
            usClock.getMinute();

            case BRLClock brlclock-> this.hour = brlclock.getHour();
        }
        return this;
    }
}
