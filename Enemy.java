public class Enemy extends Entity implements IDamagable
{
	Player target;
	Enemy(Player target)
	{
		this.target = target;
	}
	Enemy(Player target, String name, int hp, int posx, int posy)
	{
		super(name, hp, posx, posy);
		this.target = target;
	}
	@Override
	public void takeDamage()
	{
		hp -= 20;
	}
}
