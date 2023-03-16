package com.sandboxia.engine;

import java.util.logging.Logger;

import com.sandboxia.configuration.Configuration;

/**
 * The singleton class responsible for acting as the global handler in this game.
 * @author https://github.com/F12-Syntex ( Saif )
 */
public final class Sandboxia {
	
	private final Window window;
	private final Engine engine;
	private static final Sandboxia instance = new Sandboxia();
	private final Logger logger = Logger.getGlobal();
	
	/**
	 * Constructor for Sandboxia.
	 */
	private Sandboxia() {
		this.engine = new Engine();
		this.window = new Window(this.engine);
		
	}
	
	/**
	 * This method starts the game.
	 */
	public void start(){

		this.window.show();
		logger.info(Configuration.NAME + " v" + Configuration.VERSION + " has started");
		
	}
	
	public static void main(String[] args) {
		Sandboxia enchantedRealm = Sandboxia.getInstance();
		enchantedRealm.start();
	}
	
	/**
	 * Singleton pattern.
	 * This method returns the instance of the game.
	 * @return The instance of the game.
	 */
	public static Sandboxia getInstance() {
		return Sandboxia.instance;
	}
	
	public static void exit() {
		System.exit(0);
	}

	/**
	 * This method returns the window of the game.
	 * @return The window of the game.
	 */
	public Window getWindow() {
		return window;
	}

	/**
	 * This method returns the engine of the game.
	 * @return The engine of the game.
	 */
	public Engine getEngine() {
		return engine;
	}
	

}
