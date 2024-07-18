package dLinkedList;

public class LocationRecord implements Comparable<LocationRecord>{ // Class Location_Record:

	private String locationName;
	private SLinkedList<Martyr> martyrs;


	public LocationRecord(String locationName) {

		this.locationName = locationName;
		this.martyrs = new SLinkedList<>();
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String name) {
		this.locationName = name;
	}

	public SLinkedList<Martyr> getMartyrs() {
		return martyrs;
	}

	public void setMartyrs(SLinkedList<Martyr> martyrs) {
		this.martyrs = martyrs;
	}

	@Override
	public String toString() {

		return  locationName;
	}

	@Override
	public int compareTo(LocationRecord o) {

		return this.locationName.toUpperCase().compareTo(o.locationName.toUpperCase());
	}

	public boolean equals(Object o) {

		if (o instanceof LocationRecord) {

			return this.locationName.equalsIgnoreCase(((LocationRecord)o).locationName);
		}

		return false;
	}
}
