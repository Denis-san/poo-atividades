package generics;

public class AnimalHouse<E> {
	private E animal;

	public void setAnimal(E x) {
		animal = x;
	}

	public E getAnimal() {
		return animal;
	}
}

