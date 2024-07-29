public class Entity
{
	String name;
	int hp;
	int posx;
	int posy;
	Entity(String name, int hp, int posx, int posy)
	{
		this.name = name;
		this.hp = hp;
		this.posx = posx;
		this.posy = posy;
	}
	Entity()
	{
		this.name = "";
		this.hp = 100;
		this.posx = 50;
		this.posy = 50;
	}
}
