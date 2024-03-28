package entidade;


public class pensao {
    private String name;
	private String email;
	private int Number;
	
	public pensao(String name, String email) {
		this.name = name;
		this.email = email;
		Number = Number;
	}

	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return  name + ", " + email;
    }

}
