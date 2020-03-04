package LabelTest;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame{
    
    private  JLabel label1;
    private  JLabel label2;
    private  JLabel label3;
   
public LabelFrame(){
    
    super ("Testando JLabel");
    setLayout( new FlowLayout() );
    
    label1 = new JLabel( "Label com texto");
    label1.setToolTipText("Isso é um Label!");
    add(label1);
    
    Icon bug = new ImageIcon( getClass().getResource( "bug1.png"));
    label2 = new JLabel(" Label com texto e icone", bug, SwingConstants.LEFT);
    label2.setToolTipText("Isso é o label2");
    add(label2);
   
    label3 = new JLabel(bug);
    label3.setText("Label com icone e texto embaixo");
    label3.setIcon( bug );
    label3.setHorizontalTextPosition( SwingConstants.CENTER);
    label3.setVerticalTextPosition(SwingConstants.BOTTOM);
    label3.setToolTipText("Isso é o label3");
    add(label3);
    
    }

}
