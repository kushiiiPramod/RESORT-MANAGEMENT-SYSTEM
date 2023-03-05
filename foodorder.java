import java.awt.BorderLayout;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class foodorder extends JFrame {
    Connection conn = null;
    private JPanel contentPane;
    private JTable table;
    private JLabel lblAvailability;
    private JLabel lblCleanStatus;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblRoomNumber;
    private JLabel lblId;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    foodorder frame = new foodorder();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public foodorder() throws SQLException {

        JFrame x=new JFrame("new order");
       JPanel d = new JPanel();
        d.setLayout(new FlowLayout());
        d.setBorder(new EmptyBorder(5, 5, 5, 5));


       /*JLabel l1 = new JLabel(new ImageIcon("foodorder.jpg"));
        l1.setBounds(100,100,600,600);
       d.add(l1);
*/
        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File("C:/Users/kushi/Downloads/foodorder.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        d.add(picLabel);
        x.add(d);
    x.setSize(700,500);
    x.setVisible(true);
    }
    }