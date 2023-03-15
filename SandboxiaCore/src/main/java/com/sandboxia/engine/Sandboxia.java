package com.sandboxia.engine;

import java.util.logging.Logger;

import com.sandboxia.configuration.Configuration;

/**
 * The singleton class responsible for acting as the global handler in this game.
 * @author https://github.com/F12-Syntex
 */
public final class Sandboxia {
	
	private final Window window;
	private final Engine engine;
	private static final Sandboxia instance = new Sandboxia();
	private final Logger logger = Logger.getGlobal();
	
	private Sandboxia() {
		this.engine = new Engine();
		this.window = new Window(this.engine);
		
	}
	
	public void start(){

		this.window.show();
		logger.info(Configuration.NAME + " v" + Configuration.VERSION + " has started");
		
	}
	
	public static void main(String[] args) {
		Sandboxia enchantedRealm = Sandboxia.getInstance();
		enchantedRealm.start();
	}
	
	public static Sandboxia getInstance() {
		return Sandboxia.instance;
	}
	
	public Window getWindow() {
		return window;
	}

	public Engine getEngine() {
		return engine;
	}
	

}
