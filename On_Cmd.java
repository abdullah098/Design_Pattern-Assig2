package ass2_dp_030;

public class On_Cmd implements Cmd {
	
private Appliance app;
	
	public On_Cmd(Appliance app) {
		
		this.app = app;
	}
	
	@Override
	public void exe() {
		
		this.app.on();
	}

}
