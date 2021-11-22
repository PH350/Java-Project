//import java.applet.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;
//import javax.swing.JSpinner;

public class HMS{
        public static void main(String[] args){
        //HMS ob=new HMS();
        final JFrame frame= new JFrame();
        //ob.front1(frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Welcome To Delhi HMS. How may we assist you?");
        frame.setSize(1000, 1000);
        frame.setLocationRelativeTo(null);
        //creates frame in centre of screen with Title
        JPanel symptoms = new JPanel();
        symptoms.setBorder(BorderFactory.createTitledBorder("Please select the Symptoms that you are showing"));
        //symptoms.setLayout(new FlowLayout());
        JCheckBox symptom1= new JCheckBox("Fever");
        JCheckBox symptom2= new JCheckBox("Pain behind eyes");
        JCheckBox symptom3= new JCheckBox("Loss of taste and smell");
        JCheckBox symptom4= new JCheckBox("Cold and cough ");
        JCheckBox symptom5= new JCheckBox("dehydration");
        JCheckBox symptom6= new JCheckBox("Excessive sweating");
        JCheckBox symptom7= new JCheckBox("Coughing of blood");
        JCheckBox symptom8= new JCheckBox("Dark Urine");
        JCheckBox symptom9= new JCheckBox("Weight loss");
        JCheckBox symptom10=new JCheckBox("Nausea");
        JCheckBox symptom11=new JCheckBox("sore throat");
        JCheckBox symptom12=new JCheckBox("Rash");
        symptoms.add(symptom1);
        symptoms.add(symptom2);
        symptoms.add(symptom3);
        symptoms.add(symptom4);
        symptoms.add(symptom5);
        symptoms.add(symptom6);
        symptoms.add(symptom7);
        symptoms.add(symptom8);
        symptoms.add(symptom9);
        symptoms.add(symptom10);
        symptoms.add(symptom11);
        symptoms.add(symptom12);
        double cgunya=0, cov=0,dengue=0,malaria=0, hepatitus_B=0,tuberculosis=0,viral=0;
        JButton Button= new JButton("Next");
        if(symptom1.isSelected()){//fever
            cgunya+=5;
            dengue+=5;
            malaria+=5;
            viral+=5;
        }
        if(symptom2.isSelected()){//pain behind eyes
            cgunya+=10;
            dengue+=10;
        }
        if(symptom3.isSelected()){//taste and smell
            cov+=10;
        }
        if(symptom4.isSelected()){//cold and cough
            cov+=5;
        }
        if(symptom5.isSelected()){//dehydration
            viral+=10;
        }
        if(symptom6.isSelected()){//excessive sweating
            viral+=10;
        }
        if(symptom7.isSelected()){//coughing of blood
            tuberculosis+=15;
        }
        
        if(symptom8.isSelected()){//dark urine
            hepatitus_B+=15;
        }
        
        if(symptom9.isSelected()){//weight loss
            tuberculosis+=10;
        }
        if(symptom10.isSelected()){//nausea
            dengue+=10;           
        }
        if(symptom11.isSelected()){//sore throat
            cov+=10;
        }
        if(symptom12.isSelected()){//rash
            cgunya+=10;
        }
        symptoms.add(Button);
        //pack.symptoms();
        
        JPanel jp=new JPanel();
        //jp.setLayout(new BorderLayout());
        jp.setBorder(BorderFactory.createTitledBorder("Please Enter the Number of Patients"));
        frame.add(symptoms);
        if(Button.isSelected()==true){
        symptoms.add(jp);
        }
        frame.setVisible(true);
    }
}