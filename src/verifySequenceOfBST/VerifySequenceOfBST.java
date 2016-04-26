package verifySequenceOfBST;

import java.util.Arrays;

public class VerifySequenceOfBST {
	public static boolean verifySquenceOfBST(int [] sequence) {
		if(sequence == null || sequence.length == 0)
			return false;
		int len = sequence.length;
        if(len == 1)
            return true;
        int root = sequence[len-1];
        int i,j;
        for(i=0;i<len-1;i++){
            if(sequence[i]>root)
                    break;
        }
        for(j=i;j<len-1;j++){
            if(sequence[j]<root)
                return false;
        }
        boolean left = verifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i));
        boolean right = verifySquenceOfBST(Arrays.copyOfRange(sequence, i, len-1));
        return left && right;
//		if(sequence==null||sequence.length==0)
//            return false;
//        int root=sequence[sequence.length-1];
//        int i=0;
//        for(;i<sequence.length-1;i++){
//            if(sequence[i]>root){
//                break;
//            }
//        }
//        int j=i;
//        for(;j<sequence.length-1;j++){
//            if(sequence[j]<root)
//                return false;
//        }
//        boolean left=true;
//        boolean right=true;
//        if(i>0){
//            left=verifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i));
//        }
//        if(i<sequence.length-1)
//            right=verifySquenceOfBST(Arrays.copyOfRange(sequence, i, sequence.length-1));
//        return (left&&right);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sequence[] = {4,6,7,5};
		System.out.println(verifySquenceOfBST(sequence));
	}

}
