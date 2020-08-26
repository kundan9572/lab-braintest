package service;

public class PersonalityCalculator{
	public String findYourBrainType (String options) {
		int answer[]=findAnswers (options);
		int A= answer[1]+answer[2]+answer[3]+answer[5]+answer[8]+answer[10]+answer[11]+answer[12]+answer[14]+answer[18]+answer[20] ;
		int B = answer[4] +answer[6]+answer[7] + answer[9] + answer[13] + answer[15] + answer[16] +answer[17]+ answer[19];
		int X = 66 -( A + B);
		if(X ==20 && X <=55) {
			return "Left-brained";
		}
		if(X >55 && X <=65) {
			return "No clear preference";
		
		}
		else 
			return "Right-brained";
		

	}
	public int[] findAnswers(String options) {
		
		String[] optionsTemp= options.split(",");
		int answer[]= new int[20];
		for(int i=0;i<=optionsTemp.length;i++) {
			answer[i]=Integer.parseInt(optionsTemp[i]);
		}
		return answer;
	}
}

