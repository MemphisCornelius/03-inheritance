package ohm.softa.a03;

public class DigestingState extends State{

    private int digestingTime;
    protected DigestingState(int time, int duration) {
        super(time, duration);
        digestingTime = 0;
    }

    @Override
    State successor(Cat cat) {
        digestingTime += 1;
        if(digestingTime != super.getTime())
            return this;

        logger.info("Getting in a playful mood!");
        return new PlayfulState(super.getTime(), cat.getAwake());
    }
}
