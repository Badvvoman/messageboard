package model;
import java.sql.Timestamp;
public class reply {
	private int id; //�ظ����Ա��
	private String title;//�ظ����Ա���
	private String content ;//�ظ���������
	private Timestamp time;//�ظ�����ʱ��
	private int MB_id;//�ظ����԰����
	private int u_id;//�ظ������û���
	private int m_id;//�ظ����Ա��
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public int getMB_id() {
		return MB_id;
	}
	public void setMB_id(int mB_id) {
		MB_id = mB_id;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	
}
