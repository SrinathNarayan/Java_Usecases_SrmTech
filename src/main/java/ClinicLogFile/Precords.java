package ClinicLogFile;

import java.util.Arrays;

public class Precords {
	private String id;
    private String refno;
    protected double[] Lvalues;
    private int age;
    
	public Precords(String id, String refno, double[] lvalues, int age) {
		super();
		this.id = id;
		this.refno = refno;
		this.Lvalues = lvalues;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRefno() {
		return refno;
	}

	public void setRefno(String refno) {
		this.refno = refno;
	}

	public double[] getLvalues() {
		return Lvalues;
	}

	public void setLvalues(double[] lvalues) {
		Lvalues = lvalues;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Precords [id=" + id + ", refno=" + refno + ", Lvalues=" + Arrays.toString(Lvalues) + ", age=" + age
				+ "]";
	}


}
