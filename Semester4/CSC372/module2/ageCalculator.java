import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ageCalculator extends JFrame implements ActionListener {
   private JLabel monthLabel;
   private JLabel dayLabel;
   private JLabel yearLabel;
   private JLabel ageLabel;
   private JLabel ageDisp;
   private JTextField monthFeild;
   private JTextField dayField;
   private JTextField yearField;
   private JButton calcButton;

      ageCalculator() {
      GridBagConstraints positionConst = null;

      // Setting the names of labes and the title of the frame
      setTitle("Enter Your Birthday");

      monthLabel = new JLabel("Month");
      dayLabel = new JLabel("Day");
      yearLabel = new JLabel("Year");
      ageLabel = new JLabel("Your Age: ");
      ageDisp = new JLabel("");
      
      monthFeild = new JTextField(2);
      monthFeild.setEditable(true);
      monthFeild.setText("00");

      dayField = new JTextField(2);
      dayField.setEditable(true);
      dayField.setText("00");

      yearField = new JTextField(4);
      yearField.setEditable(true);
      yearField.setText("0000");

      calcButton = new JButton("Calculate");
      
      calcButton.addActionListener(this);

      //setting the positions of each of the text feilds and buttons
      setLayout(new GridBagLayout());
      positionConst = new GridBagConstraints();

      positionConst.gridx = 0;
      positionConst.gridy = 0;
      positionConst.insets = new Insets(10, 10, 10, 10);
      add(dayLabel, positionConst);

      positionConst.gridx = 1;
      positionConst.gridy = 0;
      positionConst.insets = new Insets(10, 10, 10, 10);
      add(dayField, positionConst);

      positionConst.gridx = 0;
      positionConst.gridy = 1;
      positionConst.insets = new Insets(10, 10, 10, 10);
      add(monthLabel, positionConst);

      positionConst.gridx = 1;
      positionConst.gridy = 1;
      positionConst.insets = new Insets(10, 10, 10, 10);
      add(monthFeild, positionConst);

      positionConst.gridx = 0;
      positionConst.gridy = 2;
      positionConst.insets = new Insets(10, 10, 10, 10);
      add(yearLabel, positionConst);

      positionConst.gridx = 1;
      positionConst.gridy = 2;
      positionConst.insets = new Insets(10, 10, 10, 10);
      add(yearField, positionConst);

      positionConst.gridx = 0;
      positionConst.gridy = 3;
      positionConst.insets = new Insets(10, 10, 10, 10);
      add(ageLabel, positionConst);

      positionConst.gridx = 1;
      positionConst.gridy = 3;
      positionConst.insets = new Insets(10, 10, 10, 10);
      add(ageDisp, positionConst);
      
      positionConst.gridx = 0;
      positionConst.gridy = 4;
      positionConst.insets = new Insets(10, 10, 10, 10);
      add(calcButton, positionConst);
   }

   @Override
   public void actionPerformed(ActionEvent event) {
      String userInput;  
      String monthNum;        
      String dayNum;        
      String yearNum;
      String birthdayString;
      int birthday;        
      int userAge;
      int date;

      // Retreving the user input
      userInput = monthFeild.getText();
      monthNum = userInput;

      userInput = dayField.getText();
      dayNum = userInput;

      userInput = yearField.getText();
      yearNum = userInput;

      // Getting today's date
      SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
      Date today = new Date();
      // Parsing user's bithday
      birthdayString = yearNum + monthNum + dayNum;
      birthday = Integer.parseInt(birthdayString);
      date = Integer.parseInt(formatter.format(today));
      // Caculating age
      userAge = (date - birthday) / 10000;

      ageDisp.setText(Integer.toString(userAge));
   }

   public static void main(String[] args) {
      ageCalculator myFrame = new ageCalculator();

      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.pack();
      myFrame.setVisible(true);
   }
}
