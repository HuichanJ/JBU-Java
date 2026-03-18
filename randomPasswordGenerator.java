import java.util.Random;

public class randomPasswordGenerator {
	public String generatePassword(){
		Random r = new Random();
		String l = "abcdefghijklmnopqrstuvwxyz";
		String u = l.toUpperCase();
		String s = "!@#$%^&*()-_=+<>?";
		String password = "";
		boolean lo, up, sym, n;
		lo = false;
		up = false;
		sym = false;
		n = false;
		while(!lo || !up || !sym || !n)
		{
			lo = false;
			up = false;
			sym = false;
			n = false;
			int length = r.nextInt(12, 21);
			for (int i = 0; i < length; i++) {
				int num = r.nextInt(5);
				if (num==1) {
					password += l.charAt(r.nextInt(l.length()));
					lo = true;
				}
				else if (num==2) {
					password += u.charAt(r.nextInt(u.length()));
					up = true;
				}
				else if (num==3) {
					password += s.charAt(r.nextInt(s.length()));
					sym = true;
				}
				else {
					password += r.nextInt(0, 10);
					n = true;
				}
			}
		}
		return password;
	}
}
