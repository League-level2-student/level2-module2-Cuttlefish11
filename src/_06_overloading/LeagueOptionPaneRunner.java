package _06_overloading;

public class LeagueOptionPaneRunner {
	public static void main(String[] args) {
		LeagueOptionPane lop = new LeagueOptionPane();
		lop.showMessageDialog("I can't talk now. I'm in coding class.");
		lop.showMessageDialog("I can't talk now. I'm in coding class.", "Frame#2");
		lop.showMessageDialog("I can't talk now. I'm in coding class.", "Frame#3", "java.png");
	}
}
