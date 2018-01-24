package ObserverPush;

import ObserverPush.Baby;

public class TestBabyMonitor {

    public static void main(String[] args) {
//        Baby vertica = new Baby("Vertica");
//        // one monitor with one baby
//        BabyMonitorSimple livingRoom = new BabyMonitorSimple("kitchen ", vertica);
//        vertica.setData(false, 0);
//        vertica.setData(true, 2);
//        // one monitor listening to two babies
//        Baby horizonte = new Baby("Horizonte");
//        BabyMonitorAdvanced kitchen = new BabyMonitorAdvanced("Living room ", vertica, horizonte);
//        
//        horizonte.setData(true, 1);
//        horizonte.setData(true, 4);
//        horizonte.setData(false, 0);
        Baby mariana = new Baby("Mariana");
        Baby natanael = new Baby("Natanael");
        BabyMonitorSimple cocina = new BabyMonitorSimple("Cocina ", mariana);
        mariana.setData(false, 0);
        BabyMonitorAdvanced sala = new BabyMonitorAdvanced("Sala ", mariana, natanael);
        mariana.setData(true, 3);
    }
}
