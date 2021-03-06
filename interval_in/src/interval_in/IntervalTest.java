package interval_in;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {
	
	// Verschillende voorstellingen voor hetzelfde idee. 
	// Verschillende voorstellingen voor éénzelfde abstracte toestandstruimte. 
	
	class Interval{
		int ondergrens; 
		int bovengrens;
		
		int getlenget(Interval interval) {
			return interval.bovengrens - interval.ondergrens;
		}
	}
	

	@Test
	void test() {
		Interval mijnInterval = new Interval(); 
		assertEquals(0,mijnInterval.ondergens); 
		assertEquals(0,mijnInterval.bovengrens); 
		
		mijninterval.bovengrens = 2; 
		assertEquals(2,mijnInterval.bovengrens); 
		
		assertEquals(2,getLengte(mijnInterval));
	}
}
