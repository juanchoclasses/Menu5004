package menu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
;


public class MenuItemTest {
  private MenuItem menuItem;
  private MenuItem menuItem2;
  private MenuItem menuItem3;

  /**
   * Set up menu items to use for our tests.
   */
  @Before
  public void setUp() {
    this.menuItem = new MenuItem("Burger", "not meat", true, 3.0);
    this.menuItem2 = new MenuItem("Burger", "meat", false, 3.0);
    this.menuItem3 = new MenuItem("ice cream", "cold and sweet", true, 35.0);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testCallAddThrowsException() {
    menuItem.add(menuItem2);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testCallRemoveThrowsException() {
    menuItem.remove(menuItem2);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testCallGetChildThrowsException() {
    menuItem.getChild(0);
  }


}