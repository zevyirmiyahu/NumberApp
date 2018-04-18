package number_info;

import javax.swing.SwingUtilities;

/*
 * This is a simple program which will return characteristics about almost any number. For example, whether
 * the number is even, odd, prime, a Fibonacci number, a happy number, etc.
 * 
 */

public class AppStart {
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new FrameApp();
			}
		});
	}
}

