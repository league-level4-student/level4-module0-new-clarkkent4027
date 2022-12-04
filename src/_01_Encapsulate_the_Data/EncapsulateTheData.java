package _01_Encapsulate_the_Data;

public class EncapsulateTheData {

	// 1. Encapsulate all the members.

	// 2. Implement the setter restrictions described above each member variable.

	// 3. Pass all the JUnit tests.

	/*
	 * All negative arguments should set itemsReceived to 0.
	 */

	private int itemsReceived;

	public void setItemsReceived(int itemsReceived) {
		if (itemsReceived >= 0) {
			this.itemsReceived = itemsReceived;
		} else {
			this.itemsReceived = 0;
		}

	}

	public int getItemsReceived() {
		return itemsReceived;
	}
	/*
	 * degreesTurned must be locked between 0.0 and 360.0 inclusive.
	 * 
	 * All parameters outside this range should set degreesTurned to the nearest
	 * bound.
	 */

	private Double degreesTurned;

	public void setDegreesTurned(Double degreesTurned) {
		if (degreesTurned >= 0 && degreesTurned <= 360) {
			this.degreesTurned = degreesTurned;
		} else {
			if (degreesTurned < 0.0) {
				this.degreesTurned = 0.0;
			} else if (degreesTurned > 360.0) {

				this.degreesTurned = 360.0;
			}
		}
	}

	public Double getDegreesTurned() {
		return degreesTurned;
	}
	/*
	 * nomenclature must not contain an empty String.
	 * 
	 * An empty String parameter should set nomenclature to a String with a single
	 * space.
	 */

	private String nomenclature;

	public void setNomenclature(String nomenclature) {
		if (nomenclature.isEmpty()) {
			this.nomenclature = " ";
		} else {
			this.nomenclature = nomenclature;
		}
	}

	public String getNomenclature() {
		return nomenclature;
	}

	/*
	 * memberObj must not be a String.
	 * 
	 * A String parameter should set memberObj to a new Object();
	 * 
	 * Hint: Use the instanceof operator.
	 * 
	 * Example:
	 * 
	 * Robot rob = new Robot();
	 * 
	 * System.out.println(rob instanceof Robot); // prints true
	 * 
	 * System.out.println(rob instanceof Random); //prints false
	 */

	private Object memberObj;

	public void setMemberObj(Object memberObj) {
		boolean test = (memberObj instanceof String);
		if (test == true) {
			this.memberObj = new Object();
		} else {
			this.memberObj = memberObj;
		}
	}

	public Object getMemberObj() {
		return memberObj;
	}
}
