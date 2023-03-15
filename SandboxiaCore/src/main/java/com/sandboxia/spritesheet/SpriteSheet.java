package com.sandboxia.spritesheet;

import java.awt.image.BufferedImage;

import javax.annotation.Nonnull;

public enum SpriteSheet {
	
	SPRITESHEETS_SPRITES_32_RPG("spritesheets\\sprites-32\\rpg.png", new SpriteSheetProperties(true, 32)),
	SPRITESHEETS_SPRITES_16_TEXTURES_16("spritesheets\\sprites-16\\Textures-16.png", new SpriteSheetProperties(true, 16)),
	SPRITESHEETS_SPRITES_16_ARMOURS("spritesheets\\sprites-16\\armours.png", new SpriteSheetProperties(true, 16)),
	SPRITESHEETS_SPRITES_16_BOOKS("spritesheets\\sprites-16\\books.png", new SpriteSheetProperties(true, 16)),
	SPRITESHEETS_SPRITES_16_CHESTS("spritesheets\\sprites-16\\chests.png", new SpriteSheetProperties(true, 16)),
	SPRITESHEETS_SPRITES_16_CONSUMABLES("spritesheets\\sprites-16\\consumables.png", new SpriteSheetProperties(true, 16)),
	SPRITESHEETS_SPRITES_16_CONTROLS("spritesheets\\sprites-16\\controls.png", new SpriteSheetProperties(true, 16)),
	SPRITESHEETS_SPRITES_16_FOOD("spritesheets\\sprites-16\\Food.png", new SpriteSheetProperties(true, 16)),
	SPRITESHEETS_SPRITES_16_PIXEL_ICONS_BY_OCEANSDREAM("spritesheets\\sprites-16\\pixel_icons_by_oceansdream.png", new SpriteSheetProperties(true, 16)),
	SPRITESHEETS_SPRITES_16_POTIONS("spritesheets\\sprites-16\\potions.png", new SpriteSheetProperties(true, 16)),
	SPRITESHEETS_SPRITES_16_ROGUELIKEITEMS("spritesheets\\sprites-16\\roguelikeitems.png", new SpriteSheetProperties(true, 16)),
	SPRITESHEETS_SPRITES_16_WEAPONS("spritesheets\\sprites-16\\weapons.png", new SpriteSheetProperties(true, 16)),
	SPRITESHEETS_SPRITES_24_RESOURCES_OUTLINED("spritesheets\\sprites-24\\resources_outlined.png", new SpriteSheetProperties(true, 24)),
	SPRITESHEETS_SPRITES_32_MEGA("spritesheets\\sprites-32\\mega.png", new SpriteSheetProperties(true, 32));

    private final String dir;
    private BufferedImage image;
    private final SpriteSheetProperties sprite_sheet;
    
    private SpriteSheet(@Nonnull final String dir, @Nonnull final SpriteSheetProperties sprite_sheet) {
        this.dir = dir;
        this.sprite_sheet = sprite_sheet;
    }

    public void setImage(BufferedImage image) {
		this.image = image;
	}

	public String getDir() {
        return dir;
    }

	public BufferedImage getImage() {
		return image;
	}

	public SpriteSheetProperties getProperties() {
		synchronized(this.sprite_sheet) {
			return sprite_sheet;
		}
	}
	
}