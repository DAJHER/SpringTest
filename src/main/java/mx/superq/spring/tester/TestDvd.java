package mx.superq.spring.tester;
public class TestDvd {
	public static void main(String[] args) {
		Tester tester = new  Tester();
		
		DVDPlayer dvd = new DVDPlayer();
		tester.testDvd(dvd);

		MP3Player mp3 = new MP3Player();
		tester.testMp3(mp3);
		
		BluRayPlayer bluRay= new BluRayPlayer();
		tester.testBluRay(bluRay);
	}
}