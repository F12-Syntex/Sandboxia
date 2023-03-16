package com.sandboxia.spritesheet;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

import com.sandboxia.datatypes.Node;

/**
 * This class is responsible for dynamically loading sprite sheets.
 * 
 * @author Saif.
 * @version 1.0.0
 * @since 1.0.0
 * @TODO: load sprites from a folder rather than from the jar itself. 
 */
public class SpriteSheetLoader {
	
	private final File root;
	private boolean loading;;
	private final Logger logger = Logger.getLogger("spritesheet");
	

	public SpriteSheetLoader() {
		//the root directory of the sprite sheets.
		this.root = new File("target/classes/spritesheet"); 
	}

	/**
	 * load the sprite sheets.
	 */
	public void loadSpriteSheets() {
		//logger.setFilter((record) -> record.getLevel().intValue() > Level.FINE.intValue());
		this.setLoading(true);
		this.load(this.root);
		this.setLoading(false);
		logger.info("Fully loaded");
	}
	
	/**
	 * A helper method for generating the code for the sprite sheets.
	 */
	private void dev() {
		this.generateCode(this.root);
	}
	
	public void load(File root) {
		if(root == null) {
			return;
		}
		
		for(File file : root.listFiles()) {
			
			if(file.isDirectory()) {
				this.load(file);
				continue;
			}
			
			
			logger.info("logging: " + root);
			
			String path = file.getParent() + "\\" + file.getName();
			
			String name = path.toUpperCase().split("SPRITESHEET\\\\")[1]
											.split("[.]")[0]
											.replaceAll("[^a-zA-Z0-9]", "_");
			
			//System.out.println(name + "(\"" + path.split("spritesheet\\\\")[1].replace("\\", "\\\\") + "\", new SpriteSheetDimensions()),");
			
			try {
				
				SpriteSheet sheet = SpriteSheet.valueOf(name);
				
				if(sheet.getProperties().isSpriteSheet()) {
					
					logger.info("rendering sprite sheet: " + sheet.getDir());
					
					int cell = sheet.getProperties().getSize();
					
					BufferedImage img = ImageIO.read(file);
					
					for(int y = 0; y < img.getHeight(); y+=cell) {
						for(int x = 0; x < img.getWidth(); x+=cell) {
							BufferedImage sprite = img.getSubimage(x, y, cell, cell);
							sheet.getProperties().renderSpriteLocation(Node.of(x, y), sprite);
						}
					}
					
					logger.info("rendered sprite sheet");
					
				}
				
				logger.info("rendering img: " + file);
				sheet.setImage(ImageIO.read(file));
				logger.info("rendered");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			logger.info("logged");
			
		}
			
		}
	
	/**
	 * A helper method for generating the code for the sprite sheets.
	 */
	public void generateCode(File root) {
		
		if(root == null) {
			return;
		}
		
		for(File file : root.listFiles()) {
			
			if(file.isDirectory()) {
				this.generateCode(file);
				continue;
			}
			
			
			String path = file.getParent() + "\\" + file.getName();
			
			String name = path.toUpperCase().split("SPRITESHEET\\\\")[1]
											.split("[.]")[0]
											.replaceAll("[^a-zA-Z0-9]", "_");
			
			String dim = "new SpriteSheetProperties()";
			
			if(name.startsWith("SPRITESHEETS_SPRITES")) {
				dim = "new SpriteSheetProperties(true, " + name.split("SPRITESHEETS_SPRITES_")[1].split("_")[0] + ")";
			}
			
			System.out.println(name + "(\"" + path.split("spritesheet\\\\")[1].replace("\\", "\\\\") + "\", " + dim + "),");
			
		}
		
	}

	/*
	 * whither or not the sprite sheets are loading.
	 */
	public boolean isLoading() {
		return loading;
	}

	/*
	 * set the loading state of the sprite sheets.
	 */
	public void setLoading(boolean loading) {
		this.loading = loading;
	}
	
	
	/**
	 * generate the enum for all the sprite sheets stored in the res folder.
	 */
	public static void main(String[] args) {
		new SpriteSheetLoader().dev();
	}
	

	
}
