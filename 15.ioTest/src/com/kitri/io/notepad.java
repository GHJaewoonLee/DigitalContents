package com.kitri.io;


import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


@SuppressWarnings("serial")
public class notepad extends Frame implements ActionListener {

	Panel p = new Panel();
	TextArea editor = new TextArea();
	
	MenuBar mb = new MenuBar();
	
	Menu file = new Menu("파일");
	Menu help = new Menu("도움말");
	
	MenuItem newFile = new MenuItem("새로 만들기", new MenuShortcut(KeyEvent.VK_N));
	MenuItem open = new MenuItem("열기", new MenuShortcut(KeyEvent.VK_O));
	MenuItem save = new MenuItem("저장", new MenuShortcut(KeyEvent.VK_S));
	MenuItem exit = new MenuItem("종료", new MenuShortcut(KeyEvent.VK_Q));
	
	FileDialog fdOpen;
	FileDialog fdSave;
	
	BufferedReader fin = null;
	FileWriter fw = null;
	
	String previousStr;
	
	
	public notepad() {
		super("메모장");
		
		fdOpen = new FileDialog(this, "Select File to Open", FileDialog.LOAD);
		fdSave = new FileDialog(this, "Select File to Save", FileDialog.SAVE);
		
		previousStr = "";

		file.add(newFile);
		file.addSeparator();
		file.add(open);
		file.addSeparator();
		file.add(save);
		file.addSeparator();
		file.add(exit);
		mb.add(file);
		mb.add(help);
		setMenuBar(mb);
		
		p.setLayout(new BorderLayout());
		p.add(editor);
		add(p);
		
		setSize(800, 600);
		setVisible(true);
		
		
		addWindowListener(new WindowAdapter() {
            					public void windowClosing(WindowEvent we) {
            						exit();
            					}
        				  });
		
		newFile.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
	}
	
	
	public static void main(String[] args) {
		new notepad();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		if (ob == open) {
			openFile();
		} else if (ob == newFile) {
			newText();
		} else if (ob == save) {
			saveFile();
		} else if (ob == exit) {
			exit();
		}
	}
	
	
	private void newText() {
		if (!previousStr.equals(editor.getText())) {
			saveFile();
		}
		
		setTitle("메모장");
		editor.setText("");
	}
	
	private void openFile() {
		fdOpen.setFile("*.*");
		fdOpen.setVisible(true);
		String fileDirectory = fdOpen.getDirectory();
		String fileName = fdOpen.getFile();
		
		try {
			if ((fileDirectory != null) && (fileName != null)) {
				fin = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileDirectory + File.separator + fileName))));
				
				if (fin != null) {
					editor.setText("");
				}
				
				String str = null;
				while ((str = fin.readLine()) != null) {
					editor.append(str + "\r\n");
				}
				
				setTitle(fileName + " - 메모장");
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (fin != null) {
					fin.close();
				}
				
				previousStr = editor.getText();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
	
	private void saveFile() {
		fdSave.setFile("*.*");
		fdSave.setVisible(true);
		String fileDirectory = fdSave.getDirectory();
		String fileName = fdSave.getFile();
		
		try {
			if ((fileDirectory != null) && (fileName != null)) {
				fw = new FileWriter(new File(fileDirectory + File.separator + fileName));
				fw.write(editor.getText());
				
				setTitle(fileName + " - 메모장");
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
				
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
	
	private void exit() {
		try {
			if (fin != null) {
				fin.close();
			}
			
			if (fw != null) {
				fw.close();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			System.exit(0);
		}
	}
}
