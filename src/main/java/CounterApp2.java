import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp2 extends JFrame {
    private int counter = 0;

    public CounterApp2() {
        setTitle("Final window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(900, 300, 250,150);

        Font font = new Font("Arial", Font.BOLD, 30);
        JLabel counterView = new JLabel(String.valueOf(counter));
        counterView.setBounds(105, 10, 100, 60);
        counterView.setFont(font);
        add(counterView);

        setLayout(null);
        JButton button1 = new JButton("Обнулить");
        button1.setBounds(1, 79, 232, 32);
        add(button1);
        JButton button2 = new JButton("<");
        button2.setBounds(1, 1, 60, 32);
        add(button2);
        JButton button3 = new JButton("<<");
        button3.setBounds(1, 33, 60, 32);
        add(button3);
        JButton button4 = new JButton(">");
        button4.setBounds(173, 1, 60, 32);
        add(button4);
        JButton button5 = new JButton(">>");
        button5.setBounds(173, 33, 60, 32);
        add(button5);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button4) {
                    counter++;
                }
                if (e.getSource() == button5) {
                    counter = counter +10;
                }
                else if (e.getSource() == button2) {
                    counter--;
                }
                if (e.getSource() == button1) {
                    counter = 0;
                }
                if (e.getSource() == button3) {
                    counter = counter - 10;
                }
                refreshCounterView(counterView); // создание метода прибавление от нажатия кнопок
            }
        };
        button1.addActionListener(actionListener); // запуск кнопки обнуление
        button2.addActionListener(actionListener);
        button3.addActionListener(actionListener);
        button4.addActionListener(actionListener);
        button5.addActionListener(actionListener);
        setVisible(true); // чтоб окно было видимым
    }
    private void refreshCounterView(JLabel counterView) {
        counterView.setText(String.valueOf(counter));
    }
    public static void main(String[] args) {
        new CounterApp2();
    }
}
