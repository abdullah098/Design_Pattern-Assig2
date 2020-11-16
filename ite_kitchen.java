package ass2_dp_030;

import java.util.ArrayList;

public class ite_kitchen implements iterator {
	
	private ArrayList<Appliance> app;
	private int index = 0;
	
	public ite_kitchen(ArrayList<Appliance> app) {
		
		this.app = app;
	}

	@Override
	public boolean has_more() {
		
		if (this.index < this.app.size())
		{
			return true;
		}
		this.index = 0;
		return false;
	}

	@Override
	public Appliance get_next() {
		
		System.out.print(this.index + " ");
		return this.app.get(this.index++);
	}

}
