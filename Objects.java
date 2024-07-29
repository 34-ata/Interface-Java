public class Objects implements IDamagable
{
	String name;
	int	posx;
	int posy;
	Objects(String name, int posx, int posy)
	{
		this.name = name;
		this.posx = posx;
		this.posy = posy;
	}
	@Override
	public void takeDamage() {
		name = "broken " + name;
	}
}
