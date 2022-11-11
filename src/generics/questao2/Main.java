package generics.questao2;

public class Main {

	public static void main(String[] args) {

		Media midia = new Book();
		
		Library<Media> library = new Library<Media>();
		
		library.addMedia(midia);
		
		System.out.println(library.retrieveLast());
	}

}
