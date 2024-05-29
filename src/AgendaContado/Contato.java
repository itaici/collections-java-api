package AgendaContado;

import java.util.Objects;

public class Contato {
	
	private String name;

	private int nuemro;

	public Contato(String name, int nuemro) {
		super();
		this.name = name;
		this.nuemro = nuemro;
	}

	public String getName() {
		return name;
	}

	public int getNuemro() {
		return nuemro;
	}
	
	

	public void setName(String name) {
		this.name = name;
	}

	public void setNuemro(int nuemro) {
		this.nuemro = nuemro;
	}

	@Override
	public String toString() {
		return "{" + name + ", " + nuemro + "}";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(name, other.name);
	}


}
