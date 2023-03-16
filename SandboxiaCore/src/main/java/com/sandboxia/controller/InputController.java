package com.sandboxia.controller;

import com.sandboxia.engine.Engine;

/*
 * InputController class for the game.
 * 
 * @author Saif.
 * @version 1.0.4
 * @since 1.0.0
 */
public class InputController {
	
	private final Engine engine;
	
	private final KeyboardInputEvent keyboardInputEvent;
	private final MouseListener mouseInputListener;

	public InputController(Engine engine) {
		this.engine = engine;
		
		this.mouseInputListener = new MouseListener(engine);
		this.keyboardInputEvent = new KeyboardInputEvent(engine);
	}

	/**
	 * this method returns an instance of the engine class
	 * @return the engine
	 */
	public Engine getEngine() {
		return engine;
	}

	/**
	 * this method returns an instance of the keyboardInputEvent class
	 * @return the keyboardInputEvent
	 */
	public KeyboardInputEvent getKeyboardInputEvent() {
		return keyboardInputEvent;
	}

	/**
	 * this method returns an instance of the mouseInputListener class
	 * @return the mouseInputListener
	 */
	public MouseListener getMouseInputListener() {
		return mouseInputListener;
	}

}
