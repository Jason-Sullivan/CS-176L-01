/**
   This program demonstrates the measurable Country class.
*/
import java.util.Scanner;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;



public class MeasurableTester
{
   public static void main(String[] args)
   {
	   
	  Scanner sc = new Scanner (System.in);
	  
	  JFrame frame = new JFrame();
      JPanel panel = new JPanel();

      
	  
     
	  //Countries
	  System.out.println("Countries Data");
	  Measurable[] countries = new Measurable[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);
      double avg=Data.average(countries);
      System.out.println("Average area: " + avg);
      System.out.println("Expected: 239950");
      System.out.println("");
      double maxData = Data.max(countries);
      System.out.println("Maximum area: " + maxData);
      System.out.println("Expected: 513120");
      System.out.println("");
     
      //Bank Accounts
      System.out.println("Bank account data");
      Measurable[] bank = new Measurable[3];
      bank[0] = new BankAccount(176220);
      bank[1] = new BankAccount(513120);
      bank[2] = new BankAccount(30510);
      avg=Data.average(bank);
      System.out.println("Average balance: " + avg);
      System.out.println("Expected: 239950");
      System.out.println("");
      maxData = Data.max(bank);
      System.out.println("Maximum balance: " + maxData);
      System.out.println("Expected: 513120");
      
      //Quiz
      System.out.println("Quiz:");
      Measurable[] quiz = new Measurable[5];
      quiz[0]= new Quiz(95);
      quiz[1]= new Quiz(80);
      quiz[2]= new Quiz(90);
      quiz[3]= new Quiz(50);
      quiz[4]= new Quiz(75);
      avg=Data.average(quiz);
      System.out.println("Average score: "+avg);
      System.out.println("Expected average: 78");
      maxData = Data.max(quiz);     
      System.out.println("Maximum score: "+ maxData);
      System.out.println("Expected max: 95");
      
      
      
      System.out.print("Enter metric to use, 1 for maximum, 2 for minimum, 3 for average: ");
      int userVal = sc.nextInt();
      
      System.out.println();
      String metricUse="";
      
      JButton buttonA = new JButton();
      JButton buttonB = new JButton();
      JButton buttonC = new JButton();
      
      if(userVal==1)
      {
    	  metricUse="Maximum";
    	 // buttonA.setText("Get Maximum Balance");
    	 // buttonB.setText("Get Maximum Area");
    	 // buttonC.setText("Get Maximum Score");
 
      }
      if(userVal==2)
      {
    	  metricUse="Minimum";
    	 // buttonA.setText("Get Minimum Balance");
    	 // buttonB.setText("Get Minimum Area");
    	 // buttonC.setText("Get Minimum Score");

      }
      if(userVal==3)
      {
    	  metricUse="Average";
    	 // buttonA.setText("Get Average Balance");
    	  //buttonB.setText("Get Average Area");
    	  //buttonC.setText("Get Average Score");

      }
      
      buttonA.setText("Get "+ metricUse+" Balance");
 	  buttonB.setText("Get "+ metricUse+" Area");
 	  buttonC.setText("Get "+ metricUse+" Score");
      
      
      
      
      
      panel.add(buttonA);
      panel.add(buttonB);
      panel.add(buttonC);
      ActionListener listener1 = new ButtonListener(bank, metricUse, "bank");
      buttonA.addActionListener(listener1);
      ActionListener listener2 = new ButtonListener(countries, metricUse, "country");
      buttonB.addActionListener(listener2);
      ActionListener listener3 = new ButtonListener(quiz, metricUse, "quiz");
      buttonC.addActionListener(listener3);
      
      
      
      frame.add(panel);
      
      frame.setSize(200, 200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);

   }
}
