package org.videostore;

public class RegularPrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.REGULAR;
	}

}
