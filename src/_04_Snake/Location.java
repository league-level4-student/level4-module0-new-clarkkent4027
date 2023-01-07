package _04_Snake;

public class Location {
	public int x = 0;
	public int y = 0;

	public boolean equals(Location loc) {
		if (loc.x == x && loc.y == y) {
			return true;
		} else {
			return false;
		}
	}

	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public enum Direction {
		UP(), DOWN(), LEFT(), RIGHT();
	}

	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}
}
