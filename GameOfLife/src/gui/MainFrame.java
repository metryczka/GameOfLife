package gui;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainFrame extends JFrame{
	
	private GamePanel gamePanel = new GamePanel();

	private static final long serialVersionUID = 1L;
	
	public MainFrame() {
		super("Game of life");
		
		setLayout(new BorderLayout());
		add(gamePanel, BorderLayout.CENTER);
		addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				switch (code) {
				case 32:
					gamePanel.next();
					break;
				case 8:
					gamePanel.claer();
					break;
				case 10:
					gamePanel.ramdomize();
					break;
				}
			}
			
		});
		
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

}
