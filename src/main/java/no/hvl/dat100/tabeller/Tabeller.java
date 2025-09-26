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

        String tabellRetur = "[";
        for (int i = 0; i < tabell.length; i++) {

            if (i == tabell.length-1) {
            tabellRetur += (tabell[i]);
            }

            else {
                tabellRetur += (tabell[i] + ",");
            }
        }
        tabellRetur += "]";
        return tabellRetur;

	}

	// c)
	public static int summer(int[] tabell) {

        int sum = 0;
        for (int i = 0; i <tabell.length; i++) {
            sum += tabell[i];
        }
        return sum;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

        boolean finnes = false;
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                finnes = true;
            }
        }
        return finnes;
    }
        //som gitt en tabell og et tall returnerer true
        // om tabellen tabell innholder tallet tall og false ellers.


	// e)
	public static int posisjonTall(int[] tabell, int tall) {

        int finnes = -1;

        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                finnes = i;
                break;
            }
        }
        return finnes;
    }


	// f)
	public static int[] reverser(int[] tabell) {

        int [] nyTabell = new int [tabell.length];
        int temp = tabell.length-1;
        for (int i = 0; i < tabell.length; i++) {
            nyTabell[temp] = tabell[i];
            temp -= 1;

            }
        return nyTabell;
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
