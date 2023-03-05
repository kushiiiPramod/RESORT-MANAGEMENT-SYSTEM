

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class ssss extends JFrame{

    public static void main(String[] args) {
        new ssss().setVisible(true);
    }

    public ssss() {
        super("HOTEL MANAGEMENT SYSTEM");

        setForeground(Color.CYAN);
        setLayout(null);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel NewLabel = new JLabel(i3);
        NewLabel.setBounds(0, 0, 1950, 1000);
        add(NewLabel);

        JLabel AirlineManagementSystem = new JLabel("THE TAJ GROUP WELCOMES YOU");
        AirlineManagementSystem.setForeground(Color.WHITE);
        AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 46));
        AirlineManagementSystem.setBounds(600, 60, 1000, 85);
        NewLabel.add(AirlineManagementSystem);


        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu AirlineSystem = new JMenu("customer");
        AirlineSystem.setForeground(Color.BLUE);
        menuBar.add(AirlineSystem);

        JMenuItem FlightDetails = new JMenuItem("customer");
        AirlineSystem.add(FlightDetails);

        JMenu AirlineSystemHello = new JMenu("ADMIN");
        AirlineSystemHello.setForeground(Color.RED);
        menuBar.add(AirlineSystemHello);

        JMenuItem FlightDetailshello1 = new JMenuItem("admin login");
        AirlineSystemHello.add(FlightDetailshello1);

        FlightDetailshello1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new Login().setVisible(true);
                }catch(Exception e ){}
            }
        });





        FlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new cus().setVisible(true);
            }
        });




        setSize(1950,1090);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}