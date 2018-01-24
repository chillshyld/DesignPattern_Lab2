package ObserversPull;


import ObserversPull.Observer;

public class BabyMonitorAdvanced implements Observer {
	private Subject mdata, cdata;
	private String babyname;
	private String name;
	private boolean crying;
	private int level;
	
	public BabyMonitorAdvanced(String name, Baby m, Baby c) {
		this.name=name; this.mdata=m; this.cdata=c;
		mdata.registerObserver(this);cdata.registerObserver(this);
	}

	public void update(Object baby) {
                Baby bambino = (Baby)baby;
		this.babyname=bambino.getBabyname();
		this.crying=bambino.isCrying();
		this.level=bambino.getLevel();
		display();
	}
	
	public void display() {
		if (crying) {
			System.out.println("Monitor:"+ name + " baby: " + babyname + " is crying at level: " + level);
		}
	}
}
