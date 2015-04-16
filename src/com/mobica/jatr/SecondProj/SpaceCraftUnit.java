package com.mobica.jatr.SecondProj;

import static org.junit.Assert.*;

import java.io.*;

import org.junit.Test;

import com.mobica.jatr.FirstProj.SpaceCraft;

public class SpaceCraftUnit {


	@Test
	public void testMoves() {
		SpaceCraft sputnikTest = new SpaceCraft("SputnikTest");
		
		Float x[] ={new Float(1), new Float(0)};
		Float y[] ={new Float(9), new Float(8)};
		
		sputnikTest.moves(x, y);
		
			assertEquals(new Float(0), sputnikTest.get_x());
			assertEquals(new Float(17), sputnikTest.get_y());		
		
	}
	

}
