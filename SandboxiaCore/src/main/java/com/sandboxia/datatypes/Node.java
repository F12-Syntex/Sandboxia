package com.sandboxia.datatypes;

import java.awt.Point;
import java.util.Objects;

/**
 * A better version of java.awt.Point. This class provides additional functionality such as adding other nodes and having consistent a consistant hashcode based on the x and y values.
 * 
 * @author Saif.
 * @version 1.0.4
 * @since 1.0.0
 */
public class Node extends Point{
	
	private static final long serialVersionUID = 432228847006839544L;

	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Node(Point point) {
		this.x = point.x;
		this.y = point.y;
	}

	/**
	 * Creates a new node with the given x and y values.
	 * 
	 * @param x The x value of the node.
	 * @param y The y value of the node.
	 * @return A new node with the given x and y values.
	 */
	public static Node of(int x, int y) {
		Node node = new Node(x, y);
		return node;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.x, this.y);
	}
	
	@Override
	public boolean equals(Object obj) {	
		if(obj instanceof Point) {
			Point p = (Point)obj;
			if(p.x == this.x && p.y == this.y) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Adds the given x and y values to the node.
	 * 
	 * @param x The x value to add.
	 * @param y The y value to add.
	 * @return The node.
	 */
	public Node add(int x, int y) {
		this.x += x;
		this.y += y;
		return this;
	}
	
	/**
	 * Adds the given point to the node.
	 * 
	 * @param point The point to add.
	 * @return The node.
	 */
	public Node add(Point point) {
		this.x += point.x;
		this.y += point.y;
		return this;
	}

}
