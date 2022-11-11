package generics;

public class Main {

	public static void main(String[] args) {
		// Erro de compila��o, o par�metro passado entre <> deve ser o mesmo tanto na declara��o
		// quanto no comando de instancia, num tipo generico n�o "temos" a rela��o de heran�a
		AnimalHouse<Animal> house = new AnimalHouse<Cat>();  
		
		// Erro de compila��o, o par�metro passado entre <> deve ser o mesmo tanto na declara��o
		// quanto no comando de instancia
		AnimalHouse<Dog> house = new AnimalHouse<Animal>();

		// Erro de compila��o, na declara�ao do tipo generico esperamos um "tipo desconhecido", logo o compilador n�o 
		// conhece o tipo passado pela instancia 
		AnimalHouse<?> house = new AnimalHouse<Cat>(); 
		house.setAnimal(new Cat());
		
		//compila com warning, n�o parametrizamos a declara��o e a instancia com o tipo dessa generic 
		AnimalHouse house = new AnimalHouse(); 
		house.setAnimal(new Dog());
	}

}
