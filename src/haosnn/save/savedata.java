package haosnn.save;

public class savedata {
	static String datahead;
	static String databody;
	static String biaoti;
	static String []jj=new String[4];
	public static void setdatahead(String head){
		datahead=head;
	}
	public static String getdatahead(){
		return datahead;
	}
	public static void setdatabody(String body){
		databody=body;
	}
	public static String getdatabody(){
		return databody;
	}
	public static void setbt(String bt){
		biaoti=bt;
	}
	public static String getbt(){
		return biaoti;
	}
	public static void setinfo(String d){
		for(int i=0;i<4;i++){
			StringBuffer tmp=new StringBuffer();
			for(int j=0;j<d.length()/4;j++){
				tmp.append(d.charAt(i*(d.length()/4)+j));
			}
			jj[i]=tmp.toString();
		}
	}
	public static String getjj(int num){
		return jj[num];
	}
}
