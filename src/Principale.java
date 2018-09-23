
public class Principale {

	private static int vet[];
	public static void main(String[] args) {
		vet = new int[50];
		for (int i=0;i<vet.length;i++) {
			vet[i]=(int)(Math.random()*30);
		}
		printvet(vet);
        int[] vet2=sort(vet);
        printvet(vet2);
	}

	static void printvet(int[] vet) {
		for (int i:vet) {
			System.out.print(" "+i);
		}
		System.out.println();
	}
	
	static int[] sort(int [] v) {
		int v2[];
		int temp;
		boolean exchange;
		v2=v.clone();
		int contaiter=0;
		for (int i=0;i<v2.length; i++) {
			exchange=false;
			for (int j=0;j<v2.length-i-1;j++) {
				contaiter++;
				if (v2[j]>v2[j+1]) {
					temp=v2[j];
					v2[j]=v2[j+1];
					v2[j+1]=temp;
					exchange=true;
				}
			}
			if (!exchange) break;
		}
		System.out.println("sort in "+contaiter+" iterazioni");
		return v2;
	}
}
