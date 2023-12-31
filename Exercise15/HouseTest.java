package Exercise15;

import org.junit.jupiter.api.Test;

class HouseTest {
/**
 * this is a constructor test for House
 * 
 * ex:
 * 	new House("Ranch", 7, 375.000, new Address(23 ,"Maple Street", "Brookline"));
 *	new House("Colonial", 9, 450.000,new Address(5 ,"Joye Road", "Newton"));
 * 	new House("Cape", 6 , 235.000,new Address(83 ,"Winslow Road", "Waltham"));
 */
	@Test
	void testConstructor() {
	 	new House("Ranch", 7, 375.000, new Address(23 ,"Maple Street", "Brookline"));
		new House("Colonial", 9, 450.000, new Address(5 ,"Joye Road", "Newton"));
		new House("Cape", 6, 235.000, new Address(83 ,"Winslow Road", "Waltham"));
	}

}
