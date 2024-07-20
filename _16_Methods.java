class Computer {

	public void playMusic() {
		System.out.println("Music Playing...");
	}

	public String getMeAPen(int cost) {
		if (cost >= 10)
			return "Pen";
		else
			return "Nothing";
	}
}

public class _16_Methods {

	public static void main(String[] args) {
		Computer obj = new Computer();
		obj.playMusic();
		String src = obj.getMeAPen(10);
		System.out.println(src);
	}

}
