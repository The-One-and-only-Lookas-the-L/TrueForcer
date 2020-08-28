package net.Lookas;

public class Main {

    public static void main(String[] args) {
	    PasswordGenerator generator = new PasswordGenerator(500);
	    String password = generator.password;
	    StopWatch watch = new StopWatch();
	    watch.start();
	    String forced = Bruteforcer.Force(password.toCharArray());
	    watch.stop();
	    System.out.println("\"Bruteforced\" the password: "+password+" in "+watch.getElapsedTime()+" milliseconds!");
    }
}
