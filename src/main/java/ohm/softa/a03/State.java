package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {

    protected static final Logger logger = LogManager.getLogger();
    private int t;
    private final int duration;

    protected State(int time, int duration) {
        this.t = time;
        this.duration = duration;
    }

    final State tick(Cat cat) {
        t = t + 1;
        return successor(cat);
    }

    abstract State successor(Cat cat);

    public int getTime() {
        return t;
    }

    public int getDuration() {
        return duration;
    }
}
