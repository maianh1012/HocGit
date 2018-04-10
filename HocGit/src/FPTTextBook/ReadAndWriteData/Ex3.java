package FPTTextBook.ReadAndWriteData;

import java.io.Serializable;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

public class Ex3 implements Serializable{
	private int iD;
	private String desc;
	private double price;
	private int quantity;
	public Ex3(int iD, String desc, double price, int quantity) {
		super();
		this.iD = iD;
		this.desc = desc;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String toString(){
		return (iD + " " +desc + " " + price + " " + quantity);
	}

}
