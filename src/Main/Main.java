package Main;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicBorders.MenuBarBorder;

import model.meu.*;
import java.util.*;

public class Main {
	private String writeFilePath = "C:\\Users\\Tomek\\Desktop\\CS4013 Project\\Reservations.csv";
	private String readFilePath = "C:\\Users\\Tomek\\Desktop\\CS4013 Project\\l4Hotels.csv";
	
	public static void main(String[] args) {
		MainMenu m = new MainMenu();
		m.run();
	}

}
