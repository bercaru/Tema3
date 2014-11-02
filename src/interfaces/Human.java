package interfaces;

import exceptions.EatException;
import exceptions.TravelException;

public interface Human {
	public void travel(String location) throws TravelException;
	public void sleep(int hours);
	public void eat() throws EatException;
}
