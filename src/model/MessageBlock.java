package model;
import java.sql.Timestamp;
public class MessageBlock {
	private int MBId; //���԰����
	private String MBName; //���԰������
	private Timestamp MBtime;//����ʱ��

	private int userId;//�����˱��

	public int getMBId() {
		return MBId;
	}
	public void setMBId(int mBId) {
		MBId = mBId;
	}
	public String getMBName() {
		return MBName;
	}
	public void setMBName(String mBName) {
		MBName = mBName;
	}
	public Timestamp getMBtime() {
		return MBtime;
	}
	public void setMBtime(Timestamp mBtime) {
		MBtime = mBtime;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

}
