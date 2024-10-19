package com.xujiayao.bmw_brx_media_converter;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.xujiayao.bmw_brx_media_converter.gui.GUI;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			FlatIntelliJLaf.setup();

			GUI gui = new GUI();
			gui.setVisible(true);
		});
	}
}
