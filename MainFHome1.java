import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFHome1 extends JFrame {
    private JButton jbnE = new JButton("=");
    private JLabel jlb1 = new JLabel("華氏");
    private JLabel jlb2 = new JLabel("攝氏");
    private JTextField jtf = new JTextField();
    private JButton jbnEx = new JButton("Exit");

    public MainFHome1(){
        Home1();
    }
    public void Home1(){

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocation(100,50);
        this.setSize(800,600);
        jbnE.setBounds(300,60,120,50);
        jtf.setBounds(200,60,120,50);
        jlb1.setBounds(100,60,120,50);
        jlb2.setBounds(500,60,120,50);
        jbnEx.setBounds(300,300,120,50);

        this.add(jbnE);
        this.add(jtf);
        this.add(jlb1);
        this.add(jlb2);
        this.add(jbnEx);

        jbnEx.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
