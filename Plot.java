/*
 * Class: CMSC203
 * Instructor:
 * Description: (A property management company manages individual properties)
 * Due: 04/02/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Napoleon Mendez
*/
public class Plot {
	private int x;
	private int y;
	private int depth;
	private int width;
	
	public Plot() {
		depth = 1;
		width = 1;
	}
	public Plot(int x, int y, int depth, int width) {
		this.x = x;
		this.y = y;
		this.depth = depth;
		this.width = width;
	}
	public Plot(Plot otherPlot) {
		this.x = otherPlot.x;
		this.y = otherPlot.y;
		this.depth = otherPlot.depth;
		this.width = otherPlot.width;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int Maxx() {
		return x + width;
	}
	public int Maxy() {
		return y + depth;
	}
	public int getDepth() {
		return depth;
	}
	public int getWidth() {
		return width;
	}
	public String toString() {
		return x + "," + y + "," + width + "," + depth;
	}
	public boolean overlaps(Plot otherPlot) {
	
		if(otherPlot.Maxx() <= x || otherPlot.x >= Maxx())
			return false;
		if(otherPlot.Maxy() <= y || otherPlot.y >= Maxy())
			return false;
		return true;
		
	}
	public boolean encompasses(Plot otherPlot){
		boolean encompassX = false;
		boolean encompassY = true;
		if((this.x <= otherPlot.x + otherPlot.width) && (otherPlot.x < this.x + this.width)) {
			encompassX = true;
		}
		if((this.y <= otherPlot.y + otherPlot.depth) && (otherPlot.y <= this.y + this.depth)) {
			encompassY = true;
		}
		
		return encompassX && encompassY;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
