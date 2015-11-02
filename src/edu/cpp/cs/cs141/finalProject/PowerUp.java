/**
 * 
 * CS 141: Introduction to Programming and Problem Solving
 * Professor: Edwin Rodr&iacute;guez
 *
 * Programming Assignment Gre4ka
 *
 * <Create an Assasin game,
 *  where the player is a spy
 *  that is trying to get the breifacse with documents
 *  and the ninja assasins are trying to catch him.>
 *
 * Team Gre4ka 
 *   <Alexandra Klimenko, Khanh Nguyen, Victor Ruiz, Ian Garrett>
 */
package edu.cpp.cs.cs141.finalProject;

/**
 * Create abstract PowerUp Class. It represents the notion of the game items.
 */
public abstract class PowerUp extends Square {

	public PowerUp(String symbol, int row, int col, boolean active, boolean visible) {
		super(symbol, row, col);
	}

	/**
	 * The status of the item initially not active.
	 */
	boolean active = false;
	/**
	 * @param symbol
	 * @param active
	 */

	/**
	 * The invisibility of the item on the map. Initially false, if the player
	 * gets close set to true.
	 */
	boolean visible = false;

	/**
	 * 
	 * @return
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * 
	 * @param symbol
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * 
	 */
	public void setActive(boolean active) {

		this.active = active;
	}

	/**
	 * 
	 * @return
	 */
	public int getRow() {
		return row;
	}

	/**
	 * 
	 * @param row
	 */
	public void setRow(int row) {
		this.row = row;
	}

	/**
	 * 
	 * @return
	 */
	public int getCol() {
		return col;
	}

	/**
	 * 
	 * @param col
	 */
	public void setCol(int col) {
		this.col = col;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * 
	 * @param visible
	 */
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
}
