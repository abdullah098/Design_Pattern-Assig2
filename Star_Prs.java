package ass2_dp_030;

public class Star_Prs implements Appliance {
	
private boolean c_state = false;
	
	@Override
	public void on() {
		
		if (this.c_state == false)
		{
			this.c_state = true;
			System.out.println("Star Press Om");
		}
		
	}

	@Override
	public void off() {
		
		if (this.c_state == true)
		{
			this.c_state = false;
			System.out.println("Star Press Off");
		}
	}

}
