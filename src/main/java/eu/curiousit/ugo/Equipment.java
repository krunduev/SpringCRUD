package eu.curiousit.ugo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the equipment database table.
 * 
 */
@Entity
@Table(name="equipment")
@NamedQuery(name="Equipment.findAll", query="SELECT e FROM Equipment e")
public class Equipment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String color;

	private int quant;

	private String type;

	public Equipment() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getQuant() {
		return this.quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}