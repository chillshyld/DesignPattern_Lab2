package ObserverPush;

import ObserverPush.Observer;
import java.util.ArrayList;

public class BabyMonitorSimple implements Observer {

    private Subject mdata;
    private String name;
    private boolean crying;

    public BabyMonitorSimple(String location, Baby d) {
        this.mdata = d;
        this.name = location;
        mdata.registerObserver(this);
    }

    public void display() {
        if (crying) {
            System.out.println("Monitor:" + name + " baby is crying");
        } else {
            System.out.println("Monitor:" + name + " baby is NOT crying at all.");
        }
    }

    public void turnOff() {
        mdata.removeObserver(this);
    }

    public void update(String name, Object arg) {
        ArrayList a = (ArrayList) arg;
        this.crying = (boolean) a.get(0);
        display();
    }
}
