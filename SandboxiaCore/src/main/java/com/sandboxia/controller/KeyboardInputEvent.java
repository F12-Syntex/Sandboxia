package com.sandboxia.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.sandboxia.engine.Engine;

/**
 * Keyboard input event class. Provides all graphic entities with keyboard input.
 * 
 * @author Saif.
 * @version 1.0.4
 * @since 1.0.0
 */
public class KeyboardInputEvent extends GameInput implements KeyListener {
	
    /**
     * Constructor for KeyboardInputEvent.
     * 
     * @param engine The engine where the inputs listeners shall be registered to.
     */
	public KeyboardInputEvent(Engine engine) {
		super(engine);
	}
	

    @Override
    public void keyTyped(KeyEvent e) {
    	engine.getEntities().forEach(o -> o.keyTyped(e));
    }

    @Override
    public void keyPressed(KeyEvent e) {
    	engine.getEntities().forEach(o -> o.keyPressed(e));
    }

    @Override
    public void keyReleased(KeyEvent e) {
    	engine.getEntities().forEach(o -> o.keyReleased(e)); 
    }

    
}