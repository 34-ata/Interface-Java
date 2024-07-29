public class Player extends Entity implements IDamagable
{
	boolean isdead;
	float	mana;
	Player()
	{
		super();
		isdead = false;
		mana = 100;
	}
	Player (float mana, String name, int hp, int posx, int posy)
	{
		super(name, hp, posx, posy);
		this.isdead = false;
		this.mana = mana;
	}
	@Override
	public void takeDamage()
	{
		hp -= 10;
	}
}
