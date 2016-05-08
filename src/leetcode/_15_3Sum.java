package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class _15_3Sum {
	
	//时间超过限制
	public static List<List<Integer>> threeSum(int tmp[]){
		if(tmp.length <= 3)
			return null;
		int tmp[] = Arrays.copyOf(tmp, tmp.length);
		Arrays.sort(tmp);
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		for(int i = 0;i < tmp.length;i ++){
			Map<Integer,Integer> hash = new HashMap<>();
			int val = -tmp[i];
			for(int j = i + 1;j < tmp.length;j ++){
				List<Integer> list = new ArrayList<>();
				if(!hash.containsKey(val - tmp[j])){
					hash.put(tmp[j], 1);
				}else{
					list.add(tmp[i]);
					list.add(val - tmp[j]);
					list.add(tmp[j]);
				}
				if(list.size() == 3)
					ret.add(list);
			}
		}
		for(int i = 0;i < ret.size();i++){
			for(int j = i + 1;j<ret.size();j++){
				if(ret.get(i).equals(ret.get(j)))
					ret.remove(j);
			}
		}
		return ret;
	}
	
	//依旧超时
	public static List<List<Integer>> threeSum_2(int tmp[]){
		int n = tmp.length;
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(n < 3)
			return list;
		int i = 0;

		int tmp[] = Arrays.copyOf(tmp, n);
		Arrays.sort(tmp);
		
		while(i < n - 2){
			boolean find = false;
			int start = i + 1,end = n - 1;
			int val = -tmp[i];
			List<Integer> list2 = new ArrayList<>();
			while(start < end && !find){
				if(tmp[start] + tmp[end] == val){
					list2.addAll(Arrays.asList(tmp[i],tmp[start],tmp[end]));
					if(list.contains(list2)){
						find = true;
						break;
					}						
					list.add(Arrays.asList(tmp[i],tmp[start],tmp[end]));
					start++;
					end--;
				}				
				else if(tmp[start] + tmp[end] < val)
					start ++;
				else
					end --;
			}
			i ++;
		}
		return list;
	}
	
	//Accept
	public static List<List<Integer>> threeSum_3(int nums[]){
		List<List<Integer>> list = new ArrayList<>();
		int n = nums.length;
		if(n < 3)
			return list;
		int tmp[] = Arrays.copyOf(nums, n);
		Arrays.sort(tmp);
		int i = 0;
		while(i < n - 2){
			int start = i + 1,end = n - 1;
			while(start < end){
				int sum = tmp[i] + tmp[start] + tmp[end];
				if(sum == 0){
					list.add(Arrays.asList(tmp[i],tmp[start],tmp[end]));
					do{
						end --;
					}while(end > start && tmp[end] == tmp[end + 1]);
					do{
						start ++;
					}while(start < end && tmp[start] == tmp[start - 1]);
				}else if(sum > 0)
				{
					do{
						end --;
					}while(end > start && tmp[end] == tmp[end + 1]);
				}else{
					do{
						start ++;
					}while(start < end && tmp[start] == tmp[start - 1]);
				}
			}
			do{
				i++;
			}while(i < n - 2 && tmp[i] == tmp[i - 1]);
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[] = {-2,0,1,1,2};
		System.out.println(threeSum_3(s));
	}

}
