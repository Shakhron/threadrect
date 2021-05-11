package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	JFrame frame = new JFrame("Thread");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	Figur rect = new Figur();
	rect.setBackground(Color.WHITE);
	frame.add(rect);
	frame.setSize(500,300);
	frame.setVisible(true);
    }
}
