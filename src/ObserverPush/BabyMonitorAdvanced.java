package ObserverPush;

import ObserverPush.Observer;
import java.util.ArrayList;

public class BabyMonitorAdvanced implements Observer {

    private Subject mdata, cdata;
    private String babyname;
    private String name;
    private boolean crying;
    private int level;

    public BabyMonitorAdvanced(String name, Baby m, Baby c) {
        this.name = name;
        this.mdata = m;
        this.cdata = c;
        mdata.registerObserver(this);
        cdata.registerObserver(this);
    }

    public void update(String name, Object arg) {
        ArrayList a = (ArrayList) arg;
        this.babyname = name;
        this.crying = (boolean) a.get(0);
        this.level = (Integer) a.get(1);
        display();
    }

    public void display() {
        if (crying) {
            System.out.println("Monitor:" + name + " baby: " + babyname + " is crying at level: " + level);
        } else {
            System.out.println("Monitor:" + name + " baby: " + babyname + " is NOT crying at the moment.");
        }
    }
}
