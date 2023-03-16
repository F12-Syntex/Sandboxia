package com.sandboxia.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.sandboxia.engine.Engine;

/**
 * Abstract class for all game input.
 * 
 * @author Saif.
 * @version 1.0.4
 * @since 1.0.0
 */
public abstract class GameInput {
	protected final Logger logger = Logger.getLogger("input");
	protected final Engine engine;
	
	private final Level MIN_LOG_LEVEL = Level.INFO;
	
	/**
	 * Constructor for GameInput.
	 * 
	 * @param engine The engine where the inputs listeners shall be registered to.
	 */
	public GameInput(Engine engine) {
		this.engine = engine;
		logger.setFilter(record -> record.getLevel().intValue() > MIN_LOG_LEVEL.intValue());
	}
}
