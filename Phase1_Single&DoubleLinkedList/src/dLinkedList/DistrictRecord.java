package dLinkedList;



public class DistrictRecord implements Comparable<DistrictRecord>{ //Class District_Record:

	private String districtName;
	private SLinkedList<LocationRecord> locations;

	public DistrictRecord(String districtName) {

		this.districtName = districtName;
		this.locations = new SLinkedList<>();
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public SLinkedList<LocationRecord> getLocations() {
		return locations;
	}

	public void setLocations(SLinkedList<LocationRecord> locations) {
		this.locations = locations;
	}

	@Override
	public String toString() {
		return  districtName;
	}

	@Override
	public int compareTo(DistrictRecord o) {

		return this.districtName.toUpperCase().compareTo(o.districtName.toUpperCase());
	}

	public boolean equals(Object o) {

		if (o instanceof DistrictRecord) {

			return this.districtName.equalsIgnoreCase(((DistrictRecord)o).districtName);
		}

		return false;
	}
}
