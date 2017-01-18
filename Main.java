package Test;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<abstractParent> ListParents = new ArrayList<>();
				
		ListParents.add(new Enfant1());
		ListParents.add(new Enfant2());
		ListParents.add(new Enfant3());
		
		int i = 0;
		for (abstractParent Element : ListParents)
		{
			System.out.println("Element : " + i++);
			Element.Test();
			Element.Test1();
			Element.Test2();
			Element.Test3();
			Element.Valider();
		}

	}

}
