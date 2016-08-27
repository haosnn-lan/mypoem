package jintishimanage;

import net.sourceforge.pinyin4j.*;
import net.sourceforge.pinyin4j.format.*;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

//jintishiJudge.getpinyin(char xx)���ص����ֵ�����ƴ�� �� xx.xx.xx.���� string��ʽ
//jintishiJudge.getyunmu(char xx) ���ص����ֵ�������ĸ �� xx.xx.xx.���� string��ʽ
//jintishiJudge.returntype(String xx)�����ַ�������Ӧ��ʫ������
//���㷨����ʮ���޵ķ�ʽ�Խ���ʫ���и����ж�
public class jintishiBase {
	
	static String returnyun(char c){
//		�ŷ����� ������ĸΪ a��ia��ua ���֣��硰�����ҡ������� 
//		������ ������ĸΪ e��o��uo ���֣��硰�硢�����󡱡� 
//		��Ҳб�� ������ĸΪ ����ie����e ���֣��硰����б��Լ���� 
//		���� �ȹ����� ������ĸΪ u ���֣��硰�á��ա��� 
//		�������� ������ĸΪ i���� ���֣��硰�¡�ʮ���㡱�� 
//		�ʻ����� ������ĸΪ ai��uai ���֣��硰���������� 
//		�˻Ҷ��� ������ĸΪ ei��uei(ui) ���֣��硰�����ҡ��� 
//		��ң���� ������ĸΪ ao��iao ���֣��硰�ߡ�ң���� 
//		�������� ������ĸΪ ou��iu ���֣��硰�ɡ��󡱡� 
//		����ǰ�� ������ĸΪ an��ian��uan����an ���֣��硰�ࡢǰ���ˡ�ԩ���� 
//		���˳��� ������ĸΪen in un ��n����,�硰�ˡ��ס����������� 
//		�н����� ������ĸΪ ang��iang��uang ���֣��硰�ա������ġ��� 
//		���ж��� ������ĸΪ eng��ing��weng��ong��iong���֣��硰�ơ������̡��С����
		StringBuffer buff=new StringBuffer();
		String allyunmu=jintishiBase.getyunmu(c);
		for(int i=0;i<allyunmu.length();i++){
			StringBuffer tmp=new StringBuffer();
			for(;i<allyunmu.length()&&allyunmu.charAt(i)!='.';i++){
				if(allyunmu.charAt(i)>='0'&&allyunmu.charAt(i)<='9'){
					continue;
				}
				tmp.append(allyunmu.charAt(i));
			}
			String str=tmp.toString();
			if(str.equals("a")||str.equals("ia")||str.equals("ua")) buff.append('a');
			else if(str.equals("e")||str.equals("o")||str.equals("uo")) buff.append('b');
			else if(str.equals("ie")||str.equals("ue")) buff.append('c');
			else if(str.equals("u")||str.equals("i")) buff.append('d');
			else if(str.equals("ai")||str.equals("uai")) buff.append('e');
			else if(str.equals("ei")||str.equals("uei")||str.equals("ui")) buff.append('f');
			else if(str.equals("ao")||str.equals("iao")) buff.append('g');
			else if(str.equals("ou")||str.equals("iu")) buff.append('h');
			else if(str.equals("an")||str.equals("ian")||str.equals("uan")) buff.append('i');
			else if(str.equals("en")||str.equals("in")||str.equals("un")) buff.append('j');
			else if(str.equals("ang")||str.equals("iang")||str.equals("uang")) buff.append('k');
			else if(str.equals("eng")||str.equals("ing")||str.equals("ong")||str.equals("iong")) buff.append('l');
			else{
				System.out.print("��������ʮ�������Ҳ�����ȷ�Ķ�Ӧֵ:");
				System.out.println(str);
				buff.append('z');
			}
		}
		//�����ظ����ַ�
		String str=buff.toString();
		StringBuffer newbuff=new StringBuffer();
		newbuff.append(str.charAt(0));
		for(int i=1;i<str.length();i++){
			boolean judge=true;
			for(int j=0;j<i;j++){
				if(str.charAt(i)==str.charAt(j)){
					judge=false;
					break;
				}
			}
			if(judge){
				newbuff.append(str.charAt(i));
			}
		}
		return newbuff.toString();
	}
	
	//�ú�������ʫ�������
		//����1�������Ծ���
		//����2�������Ծ���
		//����3����������ʫ
		//����4����������ʫ
		//����-1�������ڽ���ʫ
		static int returntype(String str){
			if(str.length()==20) return 1;
			else if(str.length()==28) return 2;
			else if(str.length()==40) return 3;
			else if(str.length()==56) return 4;
			else return -1;
		}
		
		//���ص����ֵ�����ƴ��
		static String getpinyin(char intext){
			StringBuffer target=new StringBuffer();
			HanyuPinyinOutputFormat pinyinoutput=new HanyuPinyinOutputFormat();
			//���÷��ص�ΪСд�ַ�
			pinyinoutput.setCaseType(HanyuPinyinCaseType.LOWERCASE);
			//���÷��ص�Ϊ������
			pinyinoutput.setToneType(HanyuPinyinToneType.WITH_TONE_NUMBER);
			//���÷��ص� uΪv
			pinyinoutput.setVCharType(HanyuPinyinVCharType.WITH_V);
			int targetlen=0;
			try{
			String[] tmp=PinyinHelper.toHanyuPinyinStringArray(intext,pinyinoutput);
			for(int i=0;i<tmp.length;i++){
//				boolean judge=true;
//				for(int j=0;j<i;j++){//�ж��Ƿ��֮ǰ���ظ�
//					if(tmp[i].equals(tmp[j])){
//						judge=false;
//						break;
//					}
//				}
//				if(judge){
				targetlen++;
				target.append(tmp[i]);
				target.append(".");
//				}
			}
			String num=targetlen+"";
			target.append(num);
			}catch(BadHanyuPinyinOutputFormatCombination e){
				e.printStackTrace();
			}
			return target.toString();
		}
		
		static boolean judgeshengmu(char ch){
			//��ĸ����
			//b��p��m��f��d��t��n��l��g��k��h��j��q��x��zh��ch��sh��z��c��s �� y��w��r
			//�������ȼ���һ���ֽ��Ƿ�Ϊb��p��m��f��d��t��n��l��g��k��h��j��q��x��z��c��s �� y��w��r
			//�ټ��ڶ����ֽ��Ƿ�Ϊh
			//�ú���ֻ����һ���ֽڲ���
			char [] yunmu={'b','p','m','f','d','t','n','l','g','k','h','j','q','x','z','c','s','y','w','r'};
			for(int i=0;i<20;i++){
				if(ch==yunmu[i]){
					return true;
				}
			}
			return false;
		}
		
		static String getyunmu(char c){
			String str=jintishiBase.getpinyin(c);
			StringBuffer buf=new StringBuffer();
			int len=str.length();
			int num=str.charAt(len-1)-48;//�ܹ���num������
			//System.out.print("all:");
			//System.out.println(num);
			for(int i=0;i<len-2;i++){
				if(jintishiBase.judgeshengmu(str.charAt(i))){
					i++;
					if(str.charAt(i)=='h'){
						i++;
					}
					for(;str.charAt(i)!='.'&&i<len-2;i++){
						buf.append(str.charAt(i));
					}
					if(i<len-3)
						buf.append('.');
					//do nothing
				}
				else{
					for(;str.charAt(i)!='.'&&i<len-2;i++){
						buf.append(str.charAt(i));
					}
					if(i<len-3)
						buf.append('.');
					//do nothing
				}
					
			}
			return buf.toString();
		}

		
		//ping return 1,ze return 2,pingze return 3,error return -1
		static int pingze(char c){
			String str=jintishiBase.getpinyin(c);
			int ping=0,ze=0;
			for(int i=0;i<str.length()-2;i++){
				char tmp=str.charAt(i);
				if(tmp=='1'||tmp=='2'||tmp=='5'){
					ping=1;
				}
				if(tmp=='3'||tmp=='4'){					
					ze=1;
				}
			}
			if(ping==0&&ze==0)
				return -1;
			else if(ping==1&&ze==0)
				return  1;
			else if(ping==0&&ze==1)
				return 2;
			else return 3;
		}
		
		static boolean judge_ping(char c){
			String str=jintishiBase.getpinyin(c);
			for(int i=0;i<str.length()-2;i++){
				char tmp=str.charAt(i);
				if(tmp=='1'||tmp=='2'||tmp=='5'){
					return true;
				}
			}
			return false;
		}
		
		static boolean judge_ze(char c){
			//�����һЩ���� �ڹ�������ͨ�������Ƿ�������
			String other_ze="һ�߰�ʮأ����ϰϦ��Իʲ���˳�����ʧʯ�ڰ�֭������������Ӽ�ɱ�������Լ�����լִ��ϫͺ����ֽǲ������Ʋ��Ҽ�����ϻ����׿����ѧʵֱ��ڵ�����ι�������Ѻв�ܵ����ĵ�����ˢ�������������ϯ�м�����׽�������ø����Ѽ�������������Ѷ޹��벰ְ��ϮϤ�ӵ���������ն���������ʽҲ���𷤰ϻ������䲩����ֲֳ����ʪ�ڴ��ո�빷�������Ъ��������鮽޸��ص�����߽����ժ��Ͻ��������ϥ����µ�Ϲ������Ѧ���ɼ�ߪ�ϭ�꼮���";
			for(int i=0;i<other_ze.length();i++){
				if(c==other_ze.charAt(i)){
					return true;
				}
			}
			String str=jintishiBase.getpinyin(c);
			boolean judge2=false;
			for(int i=0;i<str.length()-2;i++){
				char tmp=str.charAt(i);
				if(tmp=='2')
					judge2=true;
				if(tmp=='3'||tmp=='4'){
					return true;
				}
				
				//��ͨ������Ϊfa��fo���֣����ǹ������֣������������緢���𡢷����������ȡ�
				if(tmp=='f')
					if(str.charAt(i+1)=='a'||str.charAt(i+1)=='o')
						if(str.charAt(i+2)>='0'&&str.charAt(i+2)<'6')
							return true;
				
				//��ͨ����ĸΪb��p��d��t��n����ĸ��ie����ƴ���ֳ����������⣬���඼�ǹ������֣���������
				if(tmp=='b'||tmp=='p'||tmp=='t'||tmp=='d'||tmp=='n')
						if(str.charAt(i+1)=='i'&&str.charAt(i+2)=='e')
							return true;
				
				//��ͨ�������ĸ��ue�����֣�����ȳ������ൡ����⣬���඼�ǹ������֣���������
				if(tmp=='u'&&str.charAt(i+1)=='e')
					return true;
				
				//��ͨ�������ĸd��t��n��l��z��c��s���ϡ�e����ƴ���֣����ǹ������֣�������������ߡ��á������¡��ա�ګ��������߯��ɪ��ɫ�ȡ�
				if(tmp=='d'||tmp=='t'||tmp=='n'||tmp=='l'||tmp=='z'||tmp=='c'||tmp=='s')
					if(str.charAt(i+1)=='e'&&str.charAt(i+2)>='0'&&str.charAt(i+2)<'6')
						return true;
		
				//�塢��ͨ���ﷲ��ĸΪk��zh��ch��sh��r����ĸ��uo����ƴ���֣����ǹ������֣���������
				if(tmp=='k'||tmp=='r')
					if(str.charAt(i+1)=='u'&&str.charAt(i+2)=='o')
						return true;
				if(tmp=='z'||tmp=='c'||tmp=='s')
					if(str.charAt(i+1)=='h')
						if(str.charAt(i+2)=='u'&&str.charAt(i+3)=='o')
							return true;
			}
			
				//��ͨ����ƽ�������������������ĸΪb��d��g��j��z��zh�ߣ����ǹ������֣�����������
				if(judge2){
					for(int i=0;i<str.length()-2;i++){
						char tmp=str.charAt(i);
						if(tmp=='b'||tmp=='d'||tmp=='g'||tmp=='j'||tmp=='z')
							return true;
					}
				}
			
			
			return false;
//			if(tmp=='2'){
//				if(tmp=='b'||tmp=='d'||tmp=='g'||tmp=='j'||tmp=='z'){
//					return true;
//				}
//			}
		}
		
	
}
