package ass2_dp_030;

public class App_Handler {
	
	private Appliance app;
	private Cmd command;
	
	public App_Handler(Appliance app) {
		// TODO Auto-generated constructor stub
		this.app = app;
	}
	
	public void setAppliance(Appliance app)
	{
		this.app = app;
	}
	
	public void App_On()
	{
		this.command = new On_Cmd(this.app);
		this.command.exe();
	}
	
	public void App_Off()
	{
		this.command = new Off_Cmd(this.app);
		this.command.exe();
	}

}
