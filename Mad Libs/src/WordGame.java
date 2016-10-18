import javax.swing.JOptionPane;

public class WordGame {
	static int play = -1;
	public static void main(String[] args) {
		WordGame f = new WordGame();
		words d = new words();
		int random = -1;
		
		f.option();

		while (play == 0) {
			Object[] options1 = { "2", "1" };
			random = JOptionPane.showOptionDialog(null, "Which story?", "Mad Libs", JOptionPane.DEFAULT_OPTION,
					JOptionPane.INFORMATION_MESSAGE, null, options1, options1[0]) + 1;

			if (random == 2) {
				d.setTwo(f.ask("A new noun"));
				d.setThree(f.ask("A physical part of the previous noun"));
				d.setFour(f.ask("A positive emotion"));
				d.setFive(f.ask("A negative emotion"));

				f.say("Creation:\n" + "Don't judge a " + d.getTwo() + " by its " + d.getThree() + ",\n" + d.getFour()
						+ " is better than " + d.getFive());

				f.say("Original:\n" + "Don't judge a book by its cover,\n" + "love is better than hate.");
			}

			if (random == 1) {
				d.setOne(f.ask("Name1"));
				d.setTwo(f.ask("Name2"));
				d.setThree(f.ask("Place"));
				d.setFive(f.ask("Thing"));
				d.setFour(f.ask("A category the noun would fit in"));
				d.setSix(f.ask("Adjective"));
				d.setSeven(f.ask("Verb"));

				f.say("Creation:\n" + "One day " + d.getOne() + " went with " + d.getTwo() + " to " + d.getThree()
						+ ". He was very excited to see different types of " + d.getFour() + ".\n"
						+ "After a while, they came in front of a " + d.getFive() + ". " + d.getTwo() + " told "
						+ d.getOne() + " about how " + d.getSix() + " " + d.getFive() + " is.\n" + d.getOne() + " asked, "
						+ d.getTwo() + ", can the " + d.getFive() + " " + d.getSeven() + " me? " + d.getTwo()
						+ " laughed at the innocent question.");

				f.say("Original:\n" 
				+ "One day Danny went with his father to a zoo. He was very excited to see different types of birds and animals.\n"
				+ "After a while, they came in front of the cage of a lion. Danny's father told him how ferocious lions are.\n"
				+ "Finally, he spoke up, Dad, can the lion eat me? The dad laughed at the innocent question.");
			}
			
			f.option();
		}
	}

	public String ask(String q) {
		String a = JOptionPane.showInputDialog(null, q, "Mad Libs", JOptionPane.INFORMATION_MESSAGE);
		return a;
	}

	public void say(String w) {
		JOptionPane.showMessageDialog(null, w);
	}
	
	public void option() {
		Object[] options = { "Play", "Quit" };
		play = JOptionPane.showOptionDialog(null, "Play Mad Libs?", "Mad Libs", JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	}
}