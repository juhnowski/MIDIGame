/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midigame;

import java.awt.Image;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.Transmitter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author ilya
 */
public class GameForm extends javax.swing.JFrame {

    private HashMap<String, ImageIcon> images = new HashMap();
    private static GameForm gf;
    private static Vector synthInfos = new Vector();
    public static    MidiDevice device = null;
    public static    MidiDevice casio = null;
    public static    MidiDevice casioExt = null;
    public static    MidiDevice oracle = null;

    private static    Sequencer sequencer;
    private static    Transmitter trans = null;
    private static    Transmitter trans1 = null;

    private static    String casioName = "CASIO USB-MIDI";
    private static    String casioDescription = "External MIDI Port";
    private static    String oracleRTS = "Real Time Sequencer";
    

    /**
     * Creates new form GameForm
     */
    public GameForm() {
        initComponents();
        initImages();
    }

    private void initImages() {
        
        
        /*        images.put("C2", new ImageIcon("C:\\src_phreebie\\images\\do.jpg"));
        images.put("D2", new ImageIcon("C:\\src_phreebie\\images\\re.jpg"));
        images.put("E2", new ImageIcon("C:\\src_phreebie\\images\\mi.jpg"));
        images.put("F2", new ImageIcon("C:\\src_phreebie\\images\\fa.jpg"));
        images.put("G2", new ImageIcon("C:\\src_phreebie\\images\\sol.jpg"));
        images.put("A2", new ImageIcon("C:\\src_phreebie\\images\\la.jpg"));
        images.put("B2", new ImageIcon("C:\\src_phreebie\\images\\si.jpg"));
        */
        images.put("C2", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\do.jpg"));
        images.put("D2", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\re.jpg"));
        images.put("E2", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\mi.jpg"));
        images.put("F2", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\fa.jpg"));
        images.put("G2", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\sol.jpg"));
        images.put("A2", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\la.jpg"));
        images.put("B2", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\si.jpg"));

        images.put("C3", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\do.jpg"));
        images.put("D3", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\re.jpg"));
        images.put("E3", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\mi.jpg"));
        images.put("F3", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\fa.jpg"));
        images.put("G3", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\sol.jpg"));
        images.put("A3", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\la.jpg"));
        images.put("B3", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\si.jpg"));

        images.put("C4", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\do.jpg"));
        images.put("D4", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\re.jpg"));
        images.put("E4", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\mi.jpg"));
        images.put("F4", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\fa.jpg"));
        images.put("G4", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\sol.jpg"));
        images.put("A4", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\la.jpg"));
        images.put("B4", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\si.jpg"));

        images.put("C5", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\do.jpg"));
        images.put("D5", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\re.jpg"));
        images.put("E5", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\mi.jpg"));
        images.put("F5", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\fa.jpg"));
        images.put("G5", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\sol.jpg"));
        images.put("A5", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\la.jpg"));
        images.put("B5", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\si.jpg"));

        images.put("C6", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\do.jpg"));
        images.put("D6", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\re.jpg"));
        images.put("E6", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\mi.jpg"));
        images.put("F6", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\fa.jpg"));
        images.put("G6", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\sol.jpg"));
        images.put("A6", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\la.jpg"));
        images.put("B6", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\si.jpg"));

        images.put("C7", new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\do.jpg"));
    }


    public void onNote(String note) {
        System.out.println(note);
        gf.jLabel1.setIcon(images.get(note));
        gf.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1032, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    //casio.close();
    //casioExt.close();
    //oracle.close();
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws InvalidMidiDataException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                gf = new GameForm();
                gf.setVisible(true);
                gf.setExtendedState(gf.getExtendedState() | JFrame.MAXIMIZED_BOTH);
                gf.jLabel1.setIcon(new ImageIcon("C:\\src_phreebie\\MIDIGame\\src\\resources\\start.jpg"));
            }
        });

        //---------------------------------------------------------------------------------------------------------------------------------


        MidiDevice.Info[] infos = MidiSystem.getMidiDeviceInfo();
        for (int i = 0; i < infos.length; i++) {
            try {
                device = MidiSystem.getMidiDevice(infos[i]);
                System.out.println(i + ":\tname=" + infos[i].getName() + "\t\t\tvendor=" + infos[i].getVendor() + "\tversion=" + infos[i].getVersion() + "\tdescription=" + infos[i].getDescription());
                if (infos[i].getName().equals(casioName)) {
                    if (infos[i].getDescription().equals(casioDescription)) {
                        casioExt = MidiSystem.getMidiDevice(infos[i]);
                        System.out.println("casioExt");

                    } else {
                        casio = MidiSystem.getMidiDevice(infos[i]);
                        System.out.println("casio");
                    }
                }
                if (infos[i].getName().equals(oracleRTS)) {
                    oracle = MidiSystem.getMidiDevice(infos[i]);
                }
            } catch (MidiUnavailableException e) {
                e.printStackTrace(System.out);
            }
            if (device instanceof Synthesizer) {
                synthInfos.add(infos[i]);
            }
        }

        if (!(casioExt.isOpen())) {
            try {
                casioExt.open();
                System.out.println("casioExt.open()");
            } catch (MidiUnavailableException e) {
                e.printStackTrace(System.out);
            }
        }

        if (!(casio.isOpen())) {
            try {
                casio.open();
                System.out.println("casio.open()");
            } catch (MidiUnavailableException e) {
                e.printStackTrace(System.out);
            }
        }

        System.out.println("Send message");

        ShortMessage myMsg = new ShortMessage();
        myMsg.setMessage(ShortMessage.NOTE_ON, 0, 60, 93);
        long timeStamp = -1;
        try {
            Receiver rcvr = casioExt.getReceiver();
            rcvr.send(myMsg, timeStamp);
            trans = casio.getTransmitter();
            trans1 = casio.getTransmitter();

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }

        try {
            Receiver rcvr = MidiSystem.getReceiver();
            trans1.setReceiver(rcvr);

            GameReceiver dr = new GameReceiver(gf, System.out);
            trans.setReceiver(dr);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
