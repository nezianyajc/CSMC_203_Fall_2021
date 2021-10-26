import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	private GradeBook gradeBookObjOne;
	private GradeBook gradeBookObjTwo;
	private double delta = 0.3;
	//reused when passing delta

	@BeforeEach
	void setUp() throws Exception {
		//Creating two objects 
		gradeBookObjOne = new GradeBook(5);
		gradeBookObjTwo = new GradeBook(5);
		
		//Adding first values to scores array
		gradeBookObjOne.addScore(95.0);
		gradeBookObjOne.addScore(85.0);
		
		//Adding second values to scores array
		gradeBookObjTwo.addScore(64.0);
		gradeBookObjTwo.addScore(98.0);

	}

	@AfterEach
	void tearDown() throws Exception {
		gradeBookObjOne = null;
		gradeBookObjTwo = null;
		//after tests run we reset the objects to null (prevents data leaks)

	}

	@Test
	void testGetScoreSize() {
		assertEquals(2,gradeBookObjOne.getScoreSize(),delta);
		assertEquals(2,gradeBookObjTwo.getScoreSize(),delta);
	}

//	@Test
//	void testToString() {
//		fail("Not yet implemented");
//	}

	@Test
	void testAddScore() {
		assertTrue(gradeBookObjOne.toString().equals("95.0 85.0 "));
		assertTrue(gradeBookObjTwo.toString().equals("64.0 98.0 "));

	}

	@Test
	void testSum() {
		assertEquals(180.0, gradeBookObjOne.sum(), delta);
		assertEquals(162.0, gradeBookObjTwo.sum(), delta);

	}

	@Test
	void testMinimum() {

		assertEquals(85.0, gradeBookObjOne.minimum(), delta);
		assertEquals(64.0, gradeBookObjTwo.minimum(), delta);

	}

	@Test
	void testFinalScore() {
		assertEquals(95.0, gradeBookObjOne.finalScore(), delta);
		assertEquals(98.0, gradeBookObjTwo.finalScore(), delta);

	}

}
