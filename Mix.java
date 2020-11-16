package ass2_dp_030;

public class Mix implements Appliance {
	
	private boolean c_state = false;
	@Override
	public void on() {
		
		if (this.c_state == false)
		{
			this.c_state = true;
			System.out.println("Mixer On");
		}
		
	}

	@Override
	public void off() {
		
		if (this.c_state == true)
		{
			this.c_state = false;
			System.out.println("Mixer Off");
		}
	}

}
