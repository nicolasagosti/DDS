class Prenda{
	Categoria categoria;  
	Material material;
	Color colorPrincipal;
	Color colorSecundario;
	
	
	// Constructor de la prenda
	Prenda(Categoria categoria, Material material, Color colorPrincipal,Color colorSecundario) {
	        this.categoria = categoria;
	        this.material = material;
	        this.colorPrincipal = colorPrincipal;
	        this.colorSecundario = colorSecundario;
	}
	
	Categoria categoria() {
		return categoria;
	}
	
	
	
	Material material() {
		return material;
	}
	
	Color colorPrincipal() {
		return colorPrincipal;
	}
	
	Color colorSecundario() {
		if(colorSecundario == null) {
			throw new RuntimeException("La prenda no dispone de color secundario");
		}else {
			return colorSecundario;
		}		
	}
	////
}
