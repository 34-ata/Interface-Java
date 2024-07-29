public class Main
{
	public static void main (String[] args)
	{
		Player player1 = new Player(100, "player1", 100, 0, 0);
		Enemy enemy1 = new Enemy(player1, "enemy1", 100, 25, 25);
		Enemy enemy2 = new Enemy(player1, "enemy2", 100, 28, 28);
		Objects vase = new Objects("Vase", 32, 32);
		Objects box = new Objects("Box", 45, 45);
		IDamagable[] damagables = {player1, enemy1, enemy2, vase, box};
		for(IDamagable dam : damagables)
		{
			if (dam instanceof Player)
			{
				System.out.println("Hp before damage: " + (((Player)dam).hp));
			}
			dam.takeDamage();
		}
		System.out.println("Hp after damage: " + player1.hp);
	}
}
