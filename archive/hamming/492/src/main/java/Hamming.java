class Hamming {

    int HammingDistance;

    public void setHammingDistance(int hammingDistance) {
        this.HammingDistance = hammingDistance;
    }


    int getHammingDistance() {
        return this.HammingDistance;
    }

    Hamming(String leftStrand, String rightStrand) {
        int HammingDistance = 0;

        if (leftStrand.length() == 0 && rightStrand.length() > 0)
            throw new IllegalArgumentException("left strand must not be empty.");
        if (rightStrand.length() == 0 && leftStrand.length() > 0)
            throw new IllegalArgumentException("right strand must not be empty.");
        if (leftStrand.length() != rightStrand.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

        for (int i = 0; i < leftStrand.length(); i++)
            if (leftStrand.charAt(i) != rightStrand.charAt(i))
                HammingDistance++;
        setHammingDistance(HammingDistance);
    }


}
