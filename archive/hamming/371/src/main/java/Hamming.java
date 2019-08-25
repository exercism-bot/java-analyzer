class Hamming {

	private final String leftStrand;
	private final String rightStrand;

	Hamming(String leftStrand, String rightStrand) {
		if (leftStrand.length() == 0) {
			throw new IllegalArgumentException("left strand must not be empty.");
		}
		if (rightStrand.length() == 0) {
			throw new IllegalArgumentException("right strand must not be empty.");
		}
		if (leftStrand.length() != rightStrand.length()) {
			throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
		}
		this.leftStrand = leftStrand;
		this.rightStrand = rightStrand;
	}

	int getHammingDistance() {
		var hd = 0;
		for (int i = 0; i < this.leftStrand.length(); i++) {
			if (this.leftStrand.charAt(i) != this.rightStrand.charAt(i)) {
				hd++;
			}
		}

		return hd;
	}

}
