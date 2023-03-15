package com.sandboxia.entities;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.HashSet;
import java.util.Set;

@AutoJoin
public class Block extends GraphicEntity{

	private final int SIZE = 10;
	private Set<Point> loc = new HashSet<>();
	int counter = 1;
	
	
	@Override
	public void render(Graphics g) {
		
		loc.stream().forEach(o -> {
			g.fillRect(o.x, o.y, SIZE, SIZE);
		});
		
		counter++;
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mouseDragged(e);
		//loc.add(e.getPoint());
	}
	
	
	@Override
	public void tick() {
		
	}

}
