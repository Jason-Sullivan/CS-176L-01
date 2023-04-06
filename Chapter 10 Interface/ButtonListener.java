import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class ButtonListener implements ActionListener
{
	Measurable[] anAccount;
	String metricUse;
	double value;
	String type;
	
		public ButtonListener(Measurable[] anAccount, String metricUse, String type)
	   {
	      this.anAccount = anAccount;
	      this.metricUse = metricUse;
	      this.type = type;
	   }

	   public void actionPerformed(ActionEvent event)
	   {
		   if(metricUse.equals("Maximum"))
		   {
			   value = Data.max(anAccount);
		   }
		   else if(metricUse.equals("Minimum"))
		   {
			   value = Data.min(anAccount);
		   }
		   else
			   value = Data.average(anAccount);
		   
		   if(type.equals("bank"))
		   		System.out.println(metricUse+ " Account Balance is " +value);
		   else if(type.equals("country"))
		   		System.out.println(metricUse+ " Country Area is " +value);
		   else
		   		System.out.println(metricUse+ " Quiz Score is " +value);
		   
	   }
}
