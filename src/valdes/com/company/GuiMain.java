package valdes.com.company;

import valdes.com.company.Utils.SwingUtils;

import java.util.Locale;

public class GuiMain {

    public static void main(String[] args) throws Exception {
        winMain();
    }

    public static void winMain() {
        Locale.setDefault(Locale.ROOT);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }
}
