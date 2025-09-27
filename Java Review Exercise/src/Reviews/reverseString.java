package Reviews;
public class reverseString {

	  public static String solution(String str) {
	    
	    if(str == null || str.isEmpty()) {
	      return str;
	    }
	    
	    String rvsStr = "";
	    for (int i = str.length()-1; i >= 0; i--){
	      rvsStr += str.charAt(i);
	    }
	    
	    return (rvsStr);
	  }
}





