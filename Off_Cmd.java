package ass2_dp_030;

public class Off_Cmd implements Cmd {
	
	private Appliance app;
	
	public Off_Cmd(Appliance app) {
		
		this.app = app;
	}
	
	@Override
	public void exe() {
		
		this.app.off();
	}

}
