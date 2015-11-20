package code;

public class LexicographicSorting {
	public String[] lexiSort(String[] strAry, String order){
		if(order.length()==0||order.length()>26||strAry == null||strAry.length == 0)return strAry;
		int[] lookup = new int[26];
		for(int i=0; i<order.length(); i++){
			if(lookup[order.charAt(i)-96]!=0)return strAry; //duplicate found in order, unable to sort
			lookup[order.charAt(i)-96]=i+1;
		}
		int maxlen = 0;
		for(String s : strAry){
			if(s.length()>maxlen)maxlen=s.length();
		}
		for(int p=maxlen-1; p>=0; p--){
			int[] bucket = new int[order.length()+2];
			for(String s : strAry){
				if(p>=s.length())bucket[1]++;
				//character found in list not represented in lexicographic order, unable to sort, returning null.
				else if(lookup[s.charAt(p)-96]==0)return null;
				else bucket[lookup[s.charAt(p)-96]+1]++;
			}
			for(int i=2; i<bucket.length; i++){
				bucket[i]+=bucket[i-1];
			}
			String[] tmp = new String[strAry.length];
			for(String s: strAry){
				if(p>=s.length()){
					tmp[bucket[0]]=s;
					bucket[0]++;
				}
				else{
					tmp[bucket[lookup[s.charAt(p)-96]]]=s;
					bucket[lookup[s.charAt(p)-96]]++;
				}
			}
			for(int i=0; i<strAry.length; i++){
				strAry[i]=tmp[i];
			}
		}
		return strAry;
	}
}
