package ud6.ficherostexto;

import java.io.File;

import javax.swing.JFileChooser;

public class FicherosSwing {
    public static void main(String[] args) {

        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Selecciona un archivo");
        chooser.setCurrentDirectory(new File("D:\\Oscar\\Programacion\\DAM1-25-26\\"));
        //chooser.setFileFilter(null);

        int resultado = chooser.showOpenDialog(null);
        //int resultado = chooser.showSaveDialog(null);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            System.out.println(file.getAbsolutePath());
        }

        // cerrar la app
        System.exit(0);
    }
}
