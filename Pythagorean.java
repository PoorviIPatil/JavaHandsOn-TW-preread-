/*Instructions
A Pythagorean triplet is a set of three natural numbers, {a, b, c}, for which,

a**2 + b**2 = c**2
and such that,

a < b < c
For example,

3**2 + 4**2 = 9 + 16 = 25 = 5**2.
Given an input integer N, find all Pythagorean triplets for which a + b + c = N.

For example, with N = 1000, there is exactly one Pythagorean triplet for which a + b + c = 1000: {200, 375, 425}.
*/

import java.util.*;
class PythagoreanTriplet {
    private final int a;
    private final int b;
    private final int c;
    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PythagoreanTriplet)) return false;
        PythagoreanTriplet other = (PythagoreanTriplet) o;
        return a == other.a &&
               b == other.b &&
               c == other.c;
    }
    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
    static PythagoreanTripletBuilder makeTripletsList() {
        return new PythagoreanTripletBuilder();
    }
    static class PythagoreanTripletBuilder {
        private int factorsLessThanOrEqualTo;
        private int sumTo;
        PythagoreanTripletBuilder withFactorsLessThanOrEqualTo(int value) {
            factorsLessThanOrEqualTo = value;
            return this;
        }
        PythagoreanTripletBuilder thatSumTo(int value) {
            sumTo = value;
            return this;
        }
        List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> triplets = new ArrayList<>();
            for (int a = 1; a <= factorsLessThanOrEqualTo / 2; a++)
                for (int b = a + 1; b <= (factorsLessThanOrEqualTo - a) / 2; b++)
                    if (b != a) {
                        int c = sumTo - (a + b);
                        if (c != b)
                            if (a * a + b * b == c * c)
                                triplets.add(new PythagoreanTriplet(a, b, c));
                    }
            return triplets;
        }
    }
}
