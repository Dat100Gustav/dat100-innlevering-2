package no.hvl.dat100.tabeller;

public class Tabeller {

	// a) Ferdig
	public static void skrivUt(int[] tabell) {

        System.out.print("[");
        for(int i = 0; i < tabell.length; i++){
            if(i == tabell.length-1) {
                System.out.print(tabell[i]);
            }else System.out.print(tabell[i] + ", ");
        }
        System.out.println("]");

	}

	// b) Ferdig

	public static String tilStreng(int[] tabell) {
        System.out.print("[");
        String tabellRetur = "";
        for (int i = 0; i<tabell.length; i++){
            if (i < tabell.length-1) {
                tabellRetur = (tabellRetur + tabell[i] + ", ");
            }
                else {
                tabellRetur = (tabellRetur + tabell[i] + "]");
                }
            System.out.println();
        }
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
	}

	// c)
	public static int summer(int[] tabell) {



		// TODO
		throw new UnsupportedOperationException("Metoden summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
