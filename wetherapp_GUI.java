
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class wetherapp_GUI extends JFrame{
    public wetherapp_GUI(){
        super("Weather App");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(450,650);

        setLocationRelativeTo(null);

        setLayout(null);

        setResizable(false);

        addGuiComponents();

    }
    private void addGuiComponents(){
        JTextField searchTextFeild = new JTextField();

        searchTextFeild.setBounds(15,15,351,45);

        searchTextFeild.setFont(new Font("Dialog",Font.PLAIN, 24));

        add(searchTextFeild);

        JButton searchButton = new JButton(loadImage("E:\\Weatherapp_GUI_jAVAINTELLIJ\\src\\image\\search.png"));

        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setBounds(375,13,47,45);
        add(searchButton);

        JLabel weatherConditionImage = new JLabel((loadImage("E:\\Weatherapp_GUI_jAVAINTELLIJ\\src\\image\\cloudy.png")));
        weatherConditionImage.setBounds(0,125,450,217);
        add(weatherConditionImage);

        JLabel temperturText = new JLabel("10 C");
        temperturText.setBounds(0,350,450,54);
        temperturText.setFont(new Font("Dialog", Font.BOLD,49));


        temperturText.setHorizontalAlignment(SwingConstants.CENTER);
        add(temperturText);

        JLabel weatherConditionDesc = new JLabel("cloudy");
        weatherConditionDesc.setBounds(0,405,450,36);
        weatherConditionDesc.setFont(new Font("Dialog",Font.PLAIN,32));
        weatherConditionDesc.setHorizontalAlignment(SwingConstants.CENTER);
        add(weatherConditionDesc);

        JLabel humidityImage = new JLabel(loadImage("E:\\Weatherapp_GUI_jAVAINTELLIJ\\src\\image\\humidity.png"));
        humidityImage.setBounds(15,500,74,66);
        add(humidityImage);

        JLabel humidityText = new JLabel("<html><b>Humidity</b> 100%</html>");
        humidityText.setBounds(90,500,85,55);
        humidityText.setFont(new Font("Dialog",Font.PLAIN,16));
        add(humidityText);

        JLabel windspeedImage = new JLabel(loadImage("E:\\Weatherapp_GUI_jAVAINTELLIJ\\src\\image\\windspeed.png"));
        windspeedImage.setBounds(220,500,74,66);
        add(windspeedImage);

        JLabel windspeedText = new JLabel("<html><b>Windspeed</b> 15Km/h</html>");
        windspeedText.setBounds(310,500,85,55);
        windspeedText.setFont(new Font("Dialog",Font.PLAIN,16));
        add(windspeedText);



    }

    private ImageIcon loadImage(String resourcePath){
        try{
            BufferedImage image = ImageIO.read(new File(resourcePath));

            return new ImageIcon(image);

        }catch(IOException e){

            e.printStackTrace();
        }

        System.out.println("could not find resource");
        return null;
    }

}
