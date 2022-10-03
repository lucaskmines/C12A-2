
public class TheMotivator {
	public void feedback(int score) {
		if (score == 100)
			System.out.println("You're awesome");
<<<<<<< HEAD
		else if (score > 89)
			System.out.println("That's great");
		else if (score > 75)
=======
		else if (score > 50)
			System.out.println("That's great");
		else if (score > 20)
>>>>>>> branch2
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
<<<<<<< HEAD
		tm.feedback(90);
=======
		tm.feedback(10);
>>>>>>> branch2
	}

}
