import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    
    private JLabel addressLabel;
    private JTextField addressField;
    private JButton searchButton;
    private JLabel restaurantLabel;
    private JTextArea restaurantTextArea;
    private JLabel keywordLabel;
    private JTextArea keywordTextArea;

    public GUI() {
        super("GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);

        // create input components
        addressLabel = new JLabel("Address:");
        addressField = new JTextField(20);
        searchButton = new JButton("Search");

        // create output components
        restaurantLabel = new JLabel("Restaurants:");
        restaurantTextArea = new JTextArea(5, 20);
        restaurantTextArea.setEditable(false);
        keywordLabel = new JLabel("Keywords:");
        keywordTextArea = new JTextArea(5, 20);
        keywordTextArea.setEditable(false);

        // create main panel and add components
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(addressLabel, c);
        c.gridx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(addressField, c);
        c.gridx = 2;
        c.fill = GridBagConstraints.NONE;
        mainPanel.add(searchButton, c);
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 3;
        c.fill = GridBagConstraints.BOTH;
        c.weighty = 1.0;
        mainPanel.add(new JSeparator(), c);
        c.gridy = 2;
        c.gridwidth = 1;
        c.weighty = 0.0;
        mainPanel.add(restaurantLabel, c);
        c.gridx = 1;
        mainPanel.add(keywordLabel, c);
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 2;
        c.weighty = 1.0;
        mainPanel.add(new JScrollPane(restaurantTextArea), c);
        c.gridx = 1;
        mainPanel.add(new JScrollPane(keywordTextArea), c);
        add(mainPanel);

        setVisible(true);
    }


    public class MyFrame extends JFrame {
    public MyFrame() {
        // set the layout manager for the frame
        setLayout(new BorderLayout());

        // create and add components to the frame
        JButton button1 = new JButton("Button 1");
        add(button1, BorderLayout.NORTH);

        JButton button2 = new JButton("Button 2");
        add(button2, BorderLayout.WEST);

        JButton button3 = new JButton("Button 3");
        add(button3, BorderLayout.CENTER);

        // set the size and visibility of the frame
        setSize(800, 800);
        setVisible(true);
    }



    public class AddressLookup {
    private static final String API_URL = "https://nominatim.openstreetmap.org/search";
    private static final String USER_AGENT = "Mozilla/5.0";
    
    public static void main(String[] args) throws IOException {
        String address = "1600 Amphitheatre Parkway, Mountain View, CA";
        String url = String.format("%s?q=%s&format=json", API_URL, address);
        HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            Scanner scanner = new Scanner(con.getInputStream());
            String responseBody = scanner.useDelimiter("\\A").next();
            scanner.close();
            // Parse the response body to extract the longitude and latitude values
            System.out.println(responseBody);
        } else {
            System.out.println("Failed to lookup address");
        }
    }
    }

}
}
