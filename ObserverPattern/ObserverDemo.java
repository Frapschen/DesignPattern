import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName ObserverDemo
 * @Version 1.0
 * @Author msi
 * @Date 2020/2/15 13:28
 * @Description TODO
 * Modification User： 陈泯全
 * Modification Date： 2020/2/15
 * java jdk中使用到了观察者的例子
 */
public class ObserverDemo {
    public static void main(String[] args) {
        // 创建 JFrame 实例
        JFrame frame = new JFrame("Login Example");
        // Setting the width and height of frame
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* 创建面板，这个类似于 HTML 的 div 标签
         * 我们可以创建多个面板并在 JFrame 中指定位置
         * 面板中我们可以添加文本字段，按钮及其他组件。
         */
        JPanel panel = new JPanel();
        // 添加面板
        frame.add(panel);
        /*
         * 调用用户定义的方法并添加组件到面板
         */
        panel.setLayout(null);

        // 按钮
        JButton loginButton = new JButton("Button");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // 获取到的事件源就是按钮本身
                // JButton btn = (JButton) e.getSource();

                System.out.println("按钮被点击");
            }
        });
        panel.add(loginButton);

        // 设置界面可见
        frame.setVisible(true);
    }
}