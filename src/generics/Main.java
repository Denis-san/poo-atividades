package generics;

public class Main {

	public static void main(String[] args) {
		// Erro de compilação, o parâmetro passado entre <> deve ser o mesmo tanto na declaração
		// quanto no comando de instancia, num tipo generico não "temos" a relação de herança
		AnimalHouse<Animal> house = new AnimalHouse<Cat>();  
		
		// Erro de compilação, o parâmetro passado entre <> deve ser o mesmo tanto na declaração
		// quanto no comando de instancia
		AnimalHouse<Dog> house = new AnimalHouse<Animal>();

		// Erro de compilação, na declaraçao do tipo generico esperamos um "tipo desconhecido", logo o compilador não 
		// conhece o tipo passado pela instancia 
		AnimalHouse<?> house = new AnimalHouse<Cat>(); 
		house.setAnimal(new Cat());
		
		//compila com warning, não parametrizamos a declaração e a instancia com o tipo dessa generic 
		AnimalHouse house = new AnimalHouse(); 
		house.setAnimal(new Dog());
	}

}
