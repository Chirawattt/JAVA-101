import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.text.DecimalFormat;

public class Chapter01_10 {
    public static void main(String[] args) {
        final int MaxData = 3;
        String name[] = new String[MaxData];
        float salary[] = new float[MaxData];
        String output = "";
        JTextArea textArea = new JTextArea(12,25);
        DecimalFormat number = new DecimalFormat("฿#,###,###.00");
        
        getData(name, salary);
        for (int n=0; n < name.length; n++) {
            output += name[n] + "\t" + number.format(salary[n]) + "\n";
        }

        textArea.setText(output);
        JOptionPane.showMessageDialog(null, textArea, "Display Employee", JOptionPane.INFORMATION_MESSAGE);
        
    }
    public static void getData(String name[], float salary[]) {
        for (int n=0; n < name.length; n++) {
            name[n] = JOptionPane.showInputDialog("Enter name " + (n+1) + " : ");
            salary[n] = Float.parseFloat(JOptionPane.showInputDialog("Enter salary " + (n+1) + " : "));
        }
    }
}
