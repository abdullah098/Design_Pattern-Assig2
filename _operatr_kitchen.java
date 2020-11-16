package ass2_dp_030;

import java.util.ArrayList;

public class _operatr_kitchen {
	
	private ArrayList<Appliance> App_Kitchen;
	private iterator ite_kit;
	private static _operatr_kitchen i = null;
	
	private _operatr_kitchen() {
		// TODO Auto-generated constructor stub
		this.App_Kitchen = new ArrayList<Appliance>();
		this.App_Kitchen.add(new Mix());
		this.App_Kitchen.add(new Fus());
		this.App_Kitchen.add(new Star_Prs());
		this.App_Kitchen.add(new s_asmblr());
		this.App_Kitchen.add(new Un_load_buffer());
		this.ite_kit = new ite_kitchen(this.App_Kitchen);
	}
	
	public static _operatr_kitchen get_Instance()
	{
		if (i == null)
		{
			i = new _operatr_kitchen();
			return i;
		}
		return i;
	}
	
	public void in()
	{	
		while(this.ite_kit.has_more())
		{
			this.ite_kit.get_next().on();
		}
	}
	
	public void end()
	{
		while(this.ite_kit.has_more())
		{
			this.ite_kit.get_next().off();
		}
	}

}
