package _04_Snake;

public class Location {
public int x = 0;
public int y = 0;

public boolean equals (Location loc) {
	if (loc.x == x && loc.y == y) {
		return true;
	}else {
		return false;
	}
}

public enum Direction {
	UP(), DOWN(), LEFT(), RIGHT();
}
}
