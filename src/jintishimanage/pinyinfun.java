package jintishimanage;

import net.sourceforge.pinyin4j.*;
import net.sourceforge.pinyin4j.format.*;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

//jintishiJudge.getpinyin(char xx)���ص����ֵ�����ƴ�� �� xx.xx.xx.���� string��ʽ
//jintishiJudge.getyunmu(char xx) ���ص����ֵ�������ĸ �� xx.xx.xx.���� string��ʽ
//jintishiJudge.returntype(String xx)�����ַ�������Ӧ��ʫ������


public class pinyinfun {

	public static void main(String[] args) {

		
		String str1="������ɽ���ƺ��뺣������ǧ��Ŀ����һ��¥";//���Ծ������1
		String str2="�������Ǹ߸���ҹ��������������ҹ����";//���Ծ������2
		String str3="���ݽ�����������ǰ�������ɹ�ʱʱ�����";//���Ծ������3
		String str4="�����İ������������Ϊ������������������";//���Ծ������4
		
		String str5="��������Ϊ���ÿ��ѽڱ�˼��ң֪�ֵܵǸߴ����������һ��";//���Ծ������1
		String str6="���ʹ���δ���ڰ�ɽҹ������غε�����������ȴ����ɽҹ��ʱ";//���Ծ������2
		String str7="���Ź����º۹�����Ω�������б�����ε�Ӱ���޿�����ȷɶ�";//���Ծ������3
		String str8="��ʱ���º�ʱ�����ﳤ����δ����ʹ���Ƿɽ��ڲ��̺������ɽ";//���Ծ������4
		
		String test="���Ź����º۹�����Ω�������б�����ε�Ӱ���޿�����ȷɶ�";

		

		System.out.println(jintishiBase.returnyun('��'));
		System.out.println(jintishiBase.returnyun('��'));
		System.out.println(jintishiBase.returnyun('��'));
		System.out.println(jintishiBase.returnyun('Ÿ'));
		System.out.println(wuyanlvshi.yayun("ϸ��΢�簶Σ�ɶ�ҹ���Ǵ�ƽҰ����ӿ����������������Ӧ�ϲ���ƮƮ���������һɳŸ"));
	


		
		
	}

}
//System.out.println(jintishiBase.returntype(str));
//char target='��';
//System.out.println(jintishiBase.getpinyin(target));
//String test="123456";
//int num=test.charAt(5)-48;
//System.out.println(wuyanjueju.judge_wyjj(str));
//System.out.println(jintishiBase.returnyun('��'));
//String str="e";