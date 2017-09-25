package edu.luc.cs.cs271.lab2;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTeam {
  
  Team makeTeamFixture(final String name, final String headcoach, final int funding) {
    return new Team(name, headcoach, funding);
  }

  @Test
  public void testConstructorValidName() {
    try {
      new Team(null, "Klinsmann", 500);
      fail("should have thrown IllegalArgumentException");
    } 
    catch (final Throwable ex) {
      // if we landed here, we're good!
    }
  }
  
  // DONE testConstructorValidHeadcoach
  @Test
  public void testConstructorValidHeadcoach() {
    try{
      new Team("USA", null, 500);
      fail("should have thrown IllegalArgumentException");
    }
    catch (final Throwable ex) {
      //Works correctly is landed here
    }
  }
  
  // DONE testConstructorValidFunding
  @Test
  public void testConstructorValidFunding() {
    try{
      new Team("Team1", "Klinsmann", 0);
      fail("should have thrown IllegalArgumentException");
    }
    catch (final Throwable ex) {
      //Works correctly is landed here
    }
  }

  @Test
  public void testGetName() {
    final String name = "USA";
    final Team t = makeTeamFixture(name, "Klinsmann", 500);
    assertEquals(name, t.getName());
  }
  
  // DONE testGetHeadcoach
  @Test
  public void testGetHeadcoach() {
    final String headcoach = "Klinsmann";
    final Team t = makeTeamFixture("USA", headcoach, 500);
    assertEquals(headcoach, t.getHeadcoach());
  }
  
  // DONE testGetFunding
  @Test
  public void testGetFunding() {
    final int funding = 500;
    final Team t = makeTeamFixture("USA", "Klinsmann", funding);
    assertEquals(funding, t.getFunding());
  }
}