import javax.swing.text.Document;

/**
 * @author 77321
 * @
 */

public class Find {
	public static boolean run(int a[][],int val){
		boolean ret = false;
		if(a != null){
			int len = a[0].length;
			int columns = a[0].length;
			int rows = a.length;
			int row = 0;
			int column = columns-1;
			while(column>=0 && row<rows){
				if(a[row][column] == val){
					ret = true;
					break;
				}else if(a[row][column]>val){
					column--;
				}else
					row++;
			}
//			for(int i = len-1;i>=0;i--){
//				for(int j = 0;j<a.length;j++){
//					if(a[j][i]>val)
//						break;
//					else if(a[j][i] == val){
//						ret = true;
//					}else
//						continue;
//				}
//				
//			}
		}
		return ret;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		System.out.println(run(a,7));
	}

}
