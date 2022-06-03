import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HypotenuseCalculator extends Frame {

    public static final String OP_ADD = "+";
    public static final String OP_SUB = "-";
    public static final String OP_MUL = "*";
    public static final String OP_DIV = "/";

    public static void main(String[] args) {
        HypotenuseCalculator c = new HypotenuseCalculator();
    }

    public HypotenuseCalculator() {
        Font f = new Font("SansSerif", Font.BOLD, 20);

        TextField aField = new TextField("2");
        aField.setFont(f);

        TextField bField = new TextField("3");
        bField.setFont(f);

        TextField ansField = new TextField();
        ansField.setFont(f);

        Button calcButton = new Button("Calculate");
        calcButton.setFont(f);
        calcButton.addActionListener(e -> {
            int a = Integer.parseInt(aField.getText());
            int b = Integer.parseInt(bField.getText());

            ansField.setText("" + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
        });

        add(aField);
        add(bField);
        add(calcButton);
        add(ansField);

        setLayout(new GridLayout(0, 1));

        setSize(400, 400);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
}
