package Problem2;

public final class Bishop {
	public static int Count = 0;

	public Bishop() throws BishopCreationLimitExceeded {

		Count++;

		if (Count >= 6) {
			throw new BishopCreationLimitExceeded();
		}

	}

	public static void voidprintObjectNumber() {
		System.out.println("This Bishop Object number is " + Count);

	}

}
