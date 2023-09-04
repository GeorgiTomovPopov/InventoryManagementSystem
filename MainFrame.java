import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {

    Container container = getContentPane();

    JButton productButton = new JButton("PRODUCT");
    JButton categoryButton = new JButton("CATEGORY");
    JButton customerButton = new JButton("CUSTOMER");
    JButton orderButton = new JButton("ORDER");
    JButton usersButton = new JButton("USERS");

    String user;

    JPanel panel = new JPanel();


    MainFrame(String userText) {
        this.user = userText;
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        productButton.setBounds(5 , 5, 100, 20);
        categoryButton.setBounds(105 , 5, 100, 20);
        customerButton.setBounds(205 , 5, 100, 20);
        orderButton.setBounds(305 , 5, 100, 20);
        usersButton.setBounds(405 , 5, 100, 20);
        panel.setLayout(null);
        panel.setBounds(0, 25, 1590, 935);
        panel.setBackground(Color.BLUE); //This is added to differentiate the panel
    }

    public void addComponentsToContainer() {
        container.add(productButton);
        container.add(categoryButton);
        container.add(customerButton);
        container.add(orderButton);
        container.add(panel);

        if (user.equals("admin")) {
            container.add(usersButton);
        }
    }

    public void addActionEvent() {
        productButton.addActionListener(this);
        categoryButton.addActionListener(this);
        customerButton.addActionListener(this);
        orderButton.addActionListener(this);
        usersButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
