package jintishimanage;

//����static public boolean judge_wyjj(String str)���������ж�һ��ʫ�ǲ����������Ծ���


//xzxppzz x��xƽƽ����
//xpxzzpp xƽx����ƽƽ
//xpxzppz xƽx��ƽƽ��
//xzppxzp x��ƽƽx��ƽ
//rule_one(String str)   (pingze1,yun_24)
//rule_two(String str)   ((pingze2,yun_124)
//rule_three(String str)   (pingze3,yun_24)
//rule_four(String str)   (pingze4,yun_124)
//judge_qyjj(String str)
public class qiyanjueju {
	
	static public boolean judge_qyjj(String str){
		if(rule_one(str)||rule_two(str)||rule_three(str)||rule_four(str)){
			return true;
		}
		return false;
	}
	
	static public boolean rule_one(String str){
		if(pingze1(str)&&yun_24(str)){
			System.out.println("�������Ծ������1:x��ƽƽx��ƽ��xƽx����ƽƽ��xƽx��ƽƽ�ƣ�x��ƽƽx��ƽ���ڶ��ľ�ĩβѺ��");
			return true;
		}
		return false;
	}
	
	static public boolean rule_two(String str){
		if(pingze2(str)&&yun_124(str)){
			System.out.println("�������Ծ������2:x��ƽƽx��ƽ��xƽx����ƽƽ��xƽx��ƽƽ�ƣ�x��ƽƽx��ƽ����һ���ľ�ĩβѺ��");
			return true;
		}
		return false;
	}
	
	static public boolean rule_three(String str){
		if(pingze3(str)&&yun_24(str)){
			System.out.println("�������Ծ������3:xƽx��ƽƽ�ƣ�x��ƽƽx��ƽ��x��xƽƽ���ƣ�xƽx����ƽƽ���ڶ��ľ�ĩβѺ��");
			return true;
		}
		return false;
	}
	
	static public boolean rule_four(String str){
		if(pingze4(str)&&yun_124(str)){
			System.out.println("�������Ծ������4:xƽx����ƽƽ��x��ƽƽx��ƽ��x��xƽƽ���ƣ�xƽx����ƽƽ����һ���ľ�ĩβѺ��");
			return true;
		}
		return false;
	}
	
	static public boolean yun_24(String str){
		//�ڶ��ľ�ĩβѺ��
		char yun_first=str.charAt(13),yun_second=str.charAt(27);
		String first=jintishiBase.returnyun(yun_first),second=jintishiBase.returnyun(yun_second);
		for(int i=0;i<first.length();i++){
			for(int j=0;j<second.length();j++){
				if(first.charAt(i)==second.charAt(j)){
					return true;
				}
			}
		}
		return false;
	}
	
	static public boolean yun_124(String str){
		//��һ���ľ�ĩβѺ��
		char yun_first=str.charAt(6),yun_second=str.charAt(13),yun_third=str.charAt(27);
		String first=jintishiBase.returnyun(yun_first),second=jintishiBase.returnyun(yun_second),third=jintishiBase.returnyun(yun_third);
		for(int i=0;i<first.length();i++){
			for(int j=0;j<second.length();j++){
				for(int k=0;k<third.length();k++){
					if(first.charAt(i)==second.charAt(j)&&first.charAt(i)==third.charAt(k)&&second.charAt(j)==third.charAt(k)){
						return true;
					}
				}
			}
		}
		return false;
	}
	
	static public boolean pingze1(String str){
//		x��xƽƽ����
//		xƽx����ƽƽ
//		xƽx��ƽƽ��
//		x��ƽƽx��ƽ
		String str1=str.substring(0, 7),str2=str.substring(7,14),str3=str.substring(14, 21),str4=str.substring(21, 28);
		if(xzxppzz(str1)&&xpxzzpp(str2)&&xpxzppz(str3)&&xzppxzp(str4)){
			return true;
		}
		return false;
		
	}
	
	static public boolean pingze2(String str){
		//x��ƽƽx��ƽ
		//xƽx����ƽƽ
		//xƽx��ƽƽ��
		//x��ƽƽx��ƽ
		String str1=str.substring(0, 7),str2=str.substring(7,14),str3=str.substring(14, 21),str4=str.substring(21, 28);
		if(xzppxzp(str1)&&xpxzzpp(str2)&&xpxzppz(str3)&&xzppxzp(str4)){
			return true;
		}
		return false;
		
	}
	
	static public boolean pingze3(String str){
		//xƽx��ƽƽ��
		//x��ƽƽx��ƽ
		//x��xƽƽ����
		//xƽx����ƽƽ
		String str1=str.substring(0, 7),str2=str.substring(7,14),str3=str.substring(14, 21),str4=str.substring(21, 28);
		if(xpxzppz(str1)&&xzppxzp(str2)&&xzxppzz(str3)&&xpxzzpp(str4)){
			//System.out.println("rule_three is ok");
			return true;
		}
		return false;
	}
	
	static public boolean pingze4(String str){
		//xƽx����ƽƽ
		//x��ƽƽx��ƽ
		//x��xƽƽ����
		//xƽx����ƽƽ
		String str1=str.substring(0, 7),str2=str.substring(7,14),str3=str.substring(14, 21),str4=str.substring(21, 28);
		if(xpxzzpp(str1)&&xzppxzp(str2)&&xzxppzz(str3)&&xpxzzpp(str4)){
			return true;
		}
		return false;
	}
	
	static public boolean xzxppzz(String str){
		char no2=str.charAt(1),no4=str.charAt(3),no5=str.charAt(4),no6=str.charAt(5),no7=str.charAt(6);
		if(jintishiBase.judge_ze(no2)&&jintishiBase.judge_ping(no4)&&jintishiBase.judge_ping(no5)&&jintishiBase.judge_ze(no6)&&jintishiBase.judge_ze(no7)){
			return true;
		}
		return false;
	}
	
	static public boolean xpxzzpp(String str){
		char no2=str.charAt(1),no4=str.charAt(3),no5=str.charAt(4),no6=str.charAt(5),no7=str.charAt(6);
		if(jintishiBase.judge_ping(no2)&&jintishiBase.judge_ze(no4)&&jintishiBase.judge_ze(no5)&&jintishiBase.judge_ping(no6)&&jintishiBase.judge_ping(no7)){
			return true;
		}
		return false;
	}
	
	static public boolean xpxzppz(String str){
		char no2=str.charAt(1),no4=str.charAt(3),no5=str.charAt(4),no6=str.charAt(5),no7=str.charAt(6);
		if(jintishiBase.judge_ping(no2)&&jintishiBase.judge_ze(no4)&&jintishiBase.judge_ping(no5)&&jintishiBase.judge_ping(no6)&&jintishiBase.judge_ze(no7)){
			return true;
		}
		return false;
	}
	
	static public boolean xzppxzp(String str){
		char no2=str.charAt(1),no3=str.charAt(2),no4=str.charAt(3),no6=str.charAt(5),no7=str.charAt(6);
		if(jintishiBase.judge_ze(no2)&&jintishiBase.judge_ping(no3)&&jintishiBase.judge_ping(no4)&&jintishiBase.judge_ze(no6)&&jintishiBase.judge_ping(no7)){
			return true;
		}
		return false;
	}
	
}
