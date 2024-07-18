package dLinkedList;

public class Martyr implements Comparable<Martyr>{ //Class martyr :

	private String name;
	private String date;
	private String age;
	private String location;
	private String district;
	private String gender;

	public Martyr() {

		this.name = "";
		this.date = "";
		this.age = "";
		this.location = "";
		this.district = "";
		this.gender = "";
	}

	public Martyr(String name, String date, String age, String location, String district, String gender) {

		this.name = name;
		this.date = date;
		this.age = age;
		this.location = location;
		this.district = district;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {

		return "Martyr [name=" + name + ", date=" + date + ", age=" + age + ", location=" + location + ", district="
				+ district + ", gender=" + gender + "]\n";
	}

	@Override
	public int compareTo(Martyr o) {

		return (int) (Integer.parseInt(this.age) -Integer.parseInt(o.age));
	}

	public boolean equals(Object o) {

		if (o instanceof Martyr) {

			return this.name.equalsIgnoreCase(((Martyr)o).name);
		}

		return false;
	}
}
