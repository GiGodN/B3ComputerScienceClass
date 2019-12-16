package module4.classess2;

class Rational {

	private int num, denum;

	public Rational(int num, int denum) {
		this.num = num;
		this.denum = denum;
	}

	public void setRational(int num, int denum) {
		this.num = num;
		this.denum = denum;
	}

	public boolean isBigger(Rational r1) {
		if (this.toDecimal() > r1.toDecimal()) {
			return true;
		}
		return false;
	}

	public void add(Rational r1) {
		num = num * r1.denum + r1.num * denum;
		denum = denum * r1.denum;
		long temp1 = gcm((long) num, (long) denum);
		num /= temp1;
		denum /= temp1;
	}

	private static long gcm(long a, long b) {
		return b == 0 ? a : gcm(b, a % b);
	}

	public double toDecimal() {
		return (double) num / (double) denum;
	}

	public String toString() {
		return num + " / " + denum;
	}

}