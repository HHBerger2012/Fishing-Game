import java.util.Scanner;
public class FishingGameStats
	{
		public String getName()
		{
			return name;
		}
	public void setName(String name)
		{
			this.name = name;
		}
	public String getOrigin()
		{
			return origin;
		}
	public void setOrigin(String origin)
		{
			this.origin = origin;
		}
	public int getDefense()
		{
			return defense;
		}
	public void setDefense(int defense)
		{
			this.defense = defense;
		}
	public String getSpecialty()
		{
			return specialty;
		}
	public void setSpecialty(String specialty)
		{
			this.specialty = specialty;
		}
		String name;
		String origin;
		int defense;
		String specialty;
		public FishingGameStats (String n, String o, int d, String s)
			{
				name = n;
				origin = o;
				defense = d;
				specialty = s;
			}

		

	}
