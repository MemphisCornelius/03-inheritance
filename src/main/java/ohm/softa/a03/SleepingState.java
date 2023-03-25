package ohm.softa.a03;

public class SleepingState extends State{
    protected SleepingState(int duration) {
        super(0, duration);
    }

    @Override
    State successor(Cat cat) {
        if(super.getTime() != super.getDuration())
            return this;

        logger.info("Yoan... getting hungry!");
        return new HungryState(cat.getAwake());
    }
}
