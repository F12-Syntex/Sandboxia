package com.sandboxia.engine;

import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JFrame;

import com.sandboxia.configuration.Configuration;

/**
 * this class handles the actual window of the game
 * @author https://github.com/F12-Syntex
 */
public class Window implements ComponentListener{

	private JFrame jFrame;
	public static final Dimension DIMENSION = new Dimension(810, 825);
	
	public Window(Engine engine) {
		
		this.jFrame = new JFrame(Configuration.NAME + " v" + Configuration.VERSION);
		this.jFrame.setSize(DIMENSION);
		this.jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.jFrame.setLocationRelativeTo(null);
		this.jFrame.add(engine);
		this.jFrame.addWindowListener(engine);

	}

	public JFrame getjFrame() {
		return jFrame;
	}

	/**
	 * show the frame to the user
	 */
	public void show() {
		this.jFrame.setVisible(true);
	}
	
	/**
	 * 
	 * @return the dimensions of the window
	 */
	public Dimension getDimensions() {
		return this.jFrame.getSize();
	}

	@Override
	public void componentResized(ComponentEvent e) {
		//System.out.println("new Dimension(" + this.getDimensions().width + ", " + this.getDimensions().height + ");");
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
