package com.descortes.struggle.dataentry;

import javax.swing.*;

public class EntryOutpout {

    public static char readChar(String text) {
        String st = JOptionPane.showInputDialog(text);
        return (st == null || st.length() == 0 ? '0' : st.charAt(0));
    }

    public static String readString(String text) {
        String st = JOptionPane.showInputDialog(text);
        return (st == null ? "" : st);
    }

    public static int readInt(String text) {
        int val = -1;
        boolean valido;
        do {
            String st = JOptionPane.showInputDialog(text);
            try {
                val = Integer.parseInt(st);
                valido = true;
            } catch (NumberFormatException ex) {
                showString("Ingrese un entero!!!\n(En lugar de " + st + ")");
                valido = false;
            }
        } while (!valido);
        return val;
    }

    public static boolean readBoolean(String text) {
        int i = JOptionPane.showConfirmDialog(null, text, "Consulta", JOptionPane.YES_NO_OPTION);
        return i == JOptionPane.YES_OPTION;
    }

    public static void showString(String s) {
        JOptionPane.showMessageDialog(null, s);
    }
}
