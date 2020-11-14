package week10;

import sun.plugin2.message.Message;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName LoginFrame
 * @Description TODO
 * @Author Z
 * @Date 2020/11/12
 **/

public class LoginFrame {

    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel toppanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel buttonPanel;
    private JPanel logoPanel;
    private JPanel loginPanel;
    private JLabel logoLabel;
    private JLabel 登录;
    private JLabel 小标题;
    private JPasswordField 密码;
    private JButton 按钮;
    private JTextField 用户名;
    private JLabel user;
    private JLabel password;


    public LoginFrame() {
        Border border=new EmptyBorder(0, 0, 0, 0);
        this.用户名.setBorder(border);
        this.密码.setBorder(border);
        按钮.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (用户名.getText()) {
            case "":
                JOptionPane.showMessageDialog(null, "请输入用户名！");
                break;
            case "admin":
                switch (密码.getText()) {
                    case "":
                        JOptionPane.showMessageDialog(null, "请输入密码！");
                        break;
                    case "123456":
                        JOptionPane.showMessageDialog(null, "登录成功！");
                        //LoginFrame.this.dispose();
                        用户名.setText("");
                        密码.setText("");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "密码错误！");
                        break;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "用户名不存在！");
                break;
        }
    }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("LoginFrame");
        frame.setContentPane(new LoginFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //通过获取屏幕尺寸设置窗体大小
//        Toolkit toolkit=Toolkit.getDefaultToolkit();
//        Dimension dimension=toolkit.getScreenSize();
//        System.out.println(dimension);
//        frame.setSize(dimension);

//        frame.setSize(800,600);
//        frame.setLocationRelativeTo(null);
//        frame.pack();

        //一行代码全屏窗体
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }



}
