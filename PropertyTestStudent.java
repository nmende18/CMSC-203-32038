
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This class represents GFA test cases for a Property object.
 *
 * @author Farnaz Eivazi
 * @version 7/11/2022
 */
class PropertyTestStudent {
	Property propertyOne;

	@BeforeEach
	void setUp() throws Exception {
		propertyOne = new Property("Property ABC", "Rockville", 2450.00, "Wells Fargo Bank");
	}

	@AfterEach
	void tearDown() throws Exception {
		propertyOne = null;
	}
	@Test
    public void testGetPropertyName1() {
        Property property = new Property("House", "City", 1000.0, "Owner");
        assertEquals("House", property.getPropertyName());
    }

    @Test
    public void testGetCity() {
        Property property = new Property("House", "City", 1000.0, "Owner");
        assertEquals("City", property.getCity());
    }

   

    @Test
    public void testGetOwner() {
        Property property = new Property("House", "City", 1000.0, "Owner");
        assertEquals("Owner", property.getOwner());
    }

   
    @Test
    public void testSetPropertyName() {
        Property property = new Property();
        property.setPropertyName("Apartment");
        assertEquals("Apartment", property.getPropertyName());
    }

    @Test
    public void testSetCity() {
        Property property = new Property();
        property.setCity("Town");
        assertEquals("Town", property.getCity());
    }

    @Test
    public void testSetRentalAmount() {
        Property property = new Property();
        property.setRentalAmount(1500.0);
        assertEquals(1500.0, property.getRentAmount(), 0.001);
    }

    @Test
    public void testSetOwner() {
        Property property = new Property();
        property.setOwner("Landlord");
        assertEquals("Landlord", property.getOwner());
    }

    @Test
    public void testGetPlot() {
        Plot plot = new Plot(1, 2, 3, 4);
        Property property = new Property("House", "City", 1000.0, "Owner", 1, 2, 3, 4);
        assertEquals(plot.toString(), property.getPlot().toString());
    }

	@Test
	void testGetPropertyName() {
		assertEquals("Property ABC", propertyOne.getPropertyName());
	}

	@Test
	void testGetRentAmount() {
		assertEquals(2450.00, propertyOne.getRentAmount());
	}

	

	@Test
	void testToString() {
		assertEquals("Property ABC,Rockville,Wells Fargo Bank,2450.0",propertyOne.toString());	
	}

}
