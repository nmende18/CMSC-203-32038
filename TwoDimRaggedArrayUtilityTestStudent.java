
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class represents GFA test cases for a TwoDimRaggedArrayUtility object.
 * 
 * @author Farnaz Eivazi
 * @version 7/13/2022
 * 
 */
public class TwoDimRaggedArrayUtilityTestStudent {
	private double[][] dataSet1 = {{1,2,3},{4,5},{6,7,8,9}};
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test getRowTotal method
	 * Returns the total of all the elements of row 1.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotal() {
		assertEquals(9.0,TwoDimRaggedArrayUtility.getRowTotal(dataSet1,1),.001);
	}
	@Test
	public void testGetColumnTotal() {
		assertEquals(14.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 1),.001);
	}
	 @Test
	    public void testGetHighestInRow() {
	        assertEquals(5.0, TwoDimRaggedArrayUtility.getHighestInRow(dataSet1, 1), 0.001);
	    }

	    @Test
	    public void testGetHighestInRowIndex() {
	        assertEquals(1, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1, 1));
	    }

	    @Test
	    public void testGetLowestInRow() {
	        assertEquals(4.0, TwoDimRaggedArrayUtility.getLowestInRow(dataSet1, 1), 0.001);
	    }

	    public void testGetLowestInRowIndex() {
	        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1, 1));
	    }

	    @Test
	    public void testGetHighestInColumn() {
	        assertEquals(6.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1, 0), 0.001);
	    }

	   
	    @Test
	    public void testGetLowestInColumn() {
	        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1, 0), 0.001);
	    }

	    @Test
	    public void testGetLowestInColumnIndex() {
	        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1, 0));
	    }

	    @Test
	    public void testGetHighestInArray() {
	        assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInArray(dataSet1), 0.001);
	    }

	    @Test
	    public void testGetLowestInArray() {
	        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInArray(dataSet1), 0.001);
	    }
}
