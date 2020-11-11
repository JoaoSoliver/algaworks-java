package modulo03.classes.petshop;

public enum Sexo {
	 MACHO("macho"), FEMEA("femea");	
	
	 private Sexo(String sexo) {
		this.sexo = sexo;
	}

	private String sexo;

	public String getSexo() {
		return sexo;
	}	
	
};

