package ohm.softa.a03;

public class HungryState extends State{
    protected HungryState(int duration) {
        super(0, duration);
    }

    @Override
    State successor(Cat cat) {

        if (super.getTime() != super.getDuration())
            return this;

        logger.info("I've starved for a too long time...good bye...");
        return new DeathState();
    }

    State feed(Cat cat) {

        return new DigestingState(super.getTime(), cat.getDigest());
    }
}
