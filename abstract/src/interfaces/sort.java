package interfaces;

public final class sort  {
	private int sId;
	private int age;
	private String name;
	private int mark;

	
	

	@Override
	public String toString() {
		return "sort [sId=" + sId + ", age=" + age + ", name=" + name + ", mark=" + mark + "]";
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public sort(int sId, int age, String name, int mark) {
		super();
		this.sId = sId;
		this.age = age;
		this.name = name;
		this.mark = mark;
	}

	public sort() {
		super();
	}

}
