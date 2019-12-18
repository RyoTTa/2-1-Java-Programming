import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StarcraftTestTest {
	Starcraft sc;
	
	@Before
	public void Setup() throws Exception{
		sc = new Starcraft();
	}
	
	@Test
	public void testAddUnit() {
		sc.addUnit(new Medic());
		sc.addUnit(new Medic());
		sc.addUnit(new Marine());
		assertEquals("Test Unit Addition", 3, sc.unitList.size(), 0);
	}
	
	@Test
	public void testAddStruct(){
		sc.addStructure(new Barrack());
		sc.addStructure(new Barrack());
		sc.addStructure(new MissileTurret());
		assertEquals("Test Unit Addition", 3, sc.structureList.size(), 0);
	}
	
	@Test
	public void testHP(){
		assertEquals("Test Medic HP", 60, new Medic().getHp(), 0);
		assertEquals("Test Marine HP", 40, new Marine().getHp(), 0);
		assertEquals("Test Barrack HP", 1000, new Barrack().getHp(), 0);
		assertEquals("Test Missile Turret HP", 200, new MissileTurret().getHp(), 0);
	}
	
	@Test
	public void testDamage(){
		assertEquals("Test Marine Damage", 6, new Marine().getDamage(), 0);
		assertEquals("Test Missile Turret Damage", 20, new MissileTurret().getDamage(), 0);
	}

}
