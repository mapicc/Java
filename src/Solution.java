import java.util.Stack;

public class Solution {
	 public static String trans(String s, int n) {
	        // write code here
	        if(n>500 || n<0 || s==null){
				return null;
			}
			char c[] = s.toCharArray();
			int count = 0;
			for(int i=0;i<n;i++){
				if(c[i]==' ')
					count++;
			}
			StringBuffer sb[] = new StringBuffer[++count];
			for(int i=0;i<sb.length;i++){
				sb[i] = new StringBuffer();
			}
			StringBuffer ret = new StringBuffer();
			int index = 0;
			for(int i=0;i<n;i++){
				if(c[i]!=' '){
					if(c[i]>=65 && c[i]<=90)
						c[i] = (char) (c[i]+32);
					else if(c[i]>=97 && c[i]<=122)
						c[i] = (char) (c[i]-32);
					else
						return null;
					sb[index].append(c[i]);
				}else{
					index++;
				}
			}
			System.out.println(index);
			while(index>=0){
				ret.append(sb[index].toString());
	            if(index!=0)
					ret.append(" ");
				index--;
			}
			return ret.toString();
	    }
	 
	public static int[] getPartition(int [][]land,int n,int m){
		int countA[] = new int[n];  //评估A的数量
		int countB[] = new int[n];  //评估B的数量
		//求对于每一块土地，A和B的评估数量
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(land[j][i]==0)
					countA[i]++;
				else if(land[j][i]==1)
					countB[i]++;
				else
					return null;
			}
		}
		//A[]、B[]分别为每次划分中和评估不同的数量，共n+1次划分，A里面存放划分为A但是评估为B的数量，B类似
		int A[] = new int[n+1];
		int B[] = new int[n+1];
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
				A[i]+=countB[j];
			}
			for(int j=i;j<n;j++){
				B[i]+=countA[j];
			}
		}
		for(int i=0;i<n;i++){
			A[n]+=countB[i];
		}
		//ret[]存放n次划分中每次评估不同的数量
		int ret[] = new int[n];
		for(int i=0;i<n;i++){
			ret[i]=A[i]+B[i];
		}
		//计算最小值
		int min = ret[0];
		for(int i=0;i<n;i++){
			if(min>ret[i])
				min=ret[i];
		}
		//找到第一个最小值
		int i;
		for(i=0;i<n;i++){
			if(min==ret[i])
				break;
		}
		//返回结果
		int a[] = {i,i+1};
		return a;
	}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int land[][]={{1,1,1,1},{0,0,0,0},{1,0,1,1}};
		int n=4;
		int m=3;
		for(int i=0;i<2;i++){
//			System.out.println(getPartition(land, n, m)[i]);
		}
		getPartition(land, n, m);
		
	}

}

class TreeNode{
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;
	public TreeNode(int val){
		this.val =  val;
	}
}