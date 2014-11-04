public class CreatingMatrices {
	public static void main(String[] args) {
		Matrix matrix = new Matrix(3, 2);
		matrix.prettyPrint();
		
		matrix.setElement(4, 1, 9);
		//matrix.prettyPrint();
		
		matrix.setElement(2, 4, 9);
		//matrix.prettyPrint();
		
		matrix.setElement(2, 1, 9);
		matrix.prettyPrint();
		
		matrix.setRow(4, "7,8");
		//matrix.prettyPrint();
		
		matrix.setRow(4, "7,8,9");
		//matrix.prettyPrint();
		
		matrix.setRow(1, "7,8");
		matrix.prettyPrint();
		
		matrix.setColumn(4, "4,5,6");
		//matrix.prettyPrint();
		
		matrix.setColumn(0, "4,5,6,7");
		//matrix.prettyPrint();
		
		matrix.setColumn(0, "4,5,6");
		matrix.prettyPrint();
		
		System.out.print(matrix.toString());
		
		
		
		
	}
}