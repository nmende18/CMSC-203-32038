
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class represents GFA test cases for a Plot object.
 * 
 * @author Farnaz Eivazi
 * @version 7/11/2022
 * 
 */
public class PlotTestStudent{
	private Plot plot1, plot5;
	@Test
    public void testGetX() {
        Plot plot = new Plot(3, 4, 5, 6);
        assertEquals(3, plot.getX());
    }

    @Test
    public void testGetY() {
        Plot plot = new Plot(3, 4, 5, 6);
        assertEquals(4, plot.getY());
    }

    @Test
    public void testGetWidth() {
        Plot plot = new Plot(3, 4, 5, 6);
        assertEquals(5, plot.getWidth());
    }

    @Test
    public void testGetDepth() {
        Plot plot = new Plot(3, 4, 5, 6);
        assertEquals(6, plot.getDepth());
    }

    @Test
    public void testSetX() {
        Plot plot = new Plot(3, 4, 5, 6);
        plot.setX(7);
        assertEquals(7, plot.getX());
    }

    @Test
    public void testSetY() {
        Plot plot = new Plot(3, 4, 5, 6);
        plot.setY(8);
        assertEquals(8, plot.getY());
    }

    @Test
    public void testSetWidth() {
        Plot plot = new Plot(3, 4, 5, 6);
        plot.setWidth(9);
        assertEquals(9, plot.getWidth());
    }

    @Test
    public void testSetDepth() {
        Plot plot = new Plot(3, 4, 5, 6);
        plot.setDepth(10);
        assertEquals(10, plot.getDepth());
    }

    @Test
    public void testToString1() {
        Plot plot = new Plot(3, 4, 5, 6);
        assertEquals("3,4,5,6", plot.toString());
    }

    @Test
    public void testOverlaps1() {
        Plot plot1 = new Plot(2, 2, 6, 6);
        Plot plot2 = new Plot(3, 4, 4, 3);
        assertTrue(plot1.overlaps(plot2));
    }

	@Before
	public void setUp() throws Exception {
		plot1 = new Plot(2, 2, 6, 6);
		plot5 = new Plot(3, 4, 4, 3);
	}

	@After
	public void tearDown() throws Exception {
		plot1 = plot5 = null;
	}

	@Test
	public void testOverlaps() {
		assertTrue(plot1.overlaps(plot5)); // plot5 is entirely inside plot1
	}
	
	@Test
	public void testToString() {
		assertEquals("3,4,4,3",plot5.toString());	
	}

}
