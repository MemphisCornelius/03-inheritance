package ohm.softa.a03;

public class PlayfulState extends State{
    protected PlayfulState(int time, int duration) {
        super(time, duration);
    }

    @Override
    State successor(Cat cat) {

        if(super.getTime() < super.getDuration())
            return this;

        logger.info("Yoan... getting tired!");
        return new SleepingState(cat.getSleep());
    }
}
