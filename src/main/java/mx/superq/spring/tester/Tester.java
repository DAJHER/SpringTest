package mx.superq.spring.tester;
public class Tester {
	public void testDvd(DVDPlayer dvd) {
		dvd.turnOn();
		dvd.play();
		dvd.stop();
		dvd.turnOff();
	}
	public void testMp3(MP3Player mp3) {
		mp3.turnOn();
		mp3.play();
		mp3.stop();
		mp3.turnOff();
	}
	public void testBluRay(BluRayPlayer bluRay) {
		bluRay.turnOn();
		bluRay.play();
		bluRay.stop();
		bluRay.turnOff();
	}
}
