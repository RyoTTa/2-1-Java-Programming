import java.util.ArrayList;

public class StarcraftTest {

	public static void main(String[] args){
		Starcraft starCraft = new Starcraft();
		starCraft.addUnit(new Marine());
		starCraft.addUnit(new Marine());
		starCraft.addUnit(new Medic());
		starCraft.addUnit(new Medic());
		starCraft.addUnit(new Medic());
		starCraft.addStructure(new MissileTurret());
		starCraft.addStructure(new MissileTurret());
		starCraft.addStructure(new Barrack());
		starCraft.addStructure(new Barrack());
		
		for(Unit unit : starCraft.unitList){
			unit.move();
			if(unit instanceof Marine){
				((Marine)unit).attack();
			}
		}
		for(Structure structure :starCraft.structureList){
			if(structure instanceof Barrack){
				((Barrack)structure).move();
			}
			if(structure instanceof MissileTurret){
				((MissileTurret)structure).attack();
			}
		}
	}
}
class Starcraft{
	ArrayList<Unit> unitList;
	ArrayList<Structure> structureList;
	
	public Starcraft(){
		this.unitList=new ArrayList<>();
		this.structureList=new ArrayList<>();
	}
	public void addUnit(Unit newunit){
		unitList.add(newunit);
	}
	public void addStructure(Structure newstructure){
		structureList.add(newstructure);
	}
}
class Unit{
	
	private int hp;
	public Unit(){
	}
	public void move(){
		
	}
}
class Structure{
	
	private int hp;
	public Structure(){
		
	}
	public void setHp(int hp){
		this.hp=hp;
	}
}
class Medic extends Unit implements Moveable{
	
	private int hp;
	
	public Medic(){
		this.hp=60;
	}
	public int getHp(){
		
		return hp;
	}
	public void move(){
		System.out.printf("Medic이 이동합니다.\n");
	}
}
class Marine extends Unit implements Moveable, Attackable{
	
	private int hp;
	private int damage=6;
	
	public Marine(){
		this.hp=40;
	}
	public int getDamage(){
		return damage;
	}
	public int getHp(){
		
		return hp;
	}
	public void move(){
		System.out.printf("Marine이 이동합니다.\n");
	}
	public void attack(){
		System.out.printf("Marine이 %d의 공격력으로 공격합니다.\n",getDamage());
	}
}
class Barrack extends Structure implements Moveable{
	
	private int hp;
	
	public Barrack(){
		this.hp=1000;
	}
	public int getHp(){
		
		return hp;
	}
	public void move(){
		System.out.printf("Barrack이 이동합니다.\n");
	}
}
class MissileTurret extends Structure implements Attackable{
	
	private int hp;
	private int damage=20;
	public MissileTurret(){
		this.hp=200;
	}
	public int getDamage(){
		return damage;
	}
	public int getHp(){
		
		return hp;
	}
	public void attack(){
		System.out.printf("MissileTurret이 %d의 공격력으로 공격합니다.\n",getDamage());
	}
}
interface Moveable{
	public void move();
}
interface Attackable{
	public void attack();
}