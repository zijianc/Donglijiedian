package ArrayList;

import java.util.Arrays;

public class HotelTest {
	public static void main(String[] args) {
		Hotel h = new Hotel();
		
	}

}

class Room {
	private int num;
	private String type;
	private boolean isFree;

	public Room() {
		// TODO Auto-generated constructor stub

	}

	public Room(int num, String type, boolean isFree) {
		this.num = num;
		this.type = type;
		this.isFree = isFree;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

	public String toString() {
		return "[����ţ�" + num + "���������ͣ�" + type + "��״̬��" + (isFree ? "����" : "ռ��") + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Room)) {
			return false;
		}
		if (this == obj)
			return true;
		Room m = (Room) obj;
		return m.num == this.num;
	}

}

class Hotel {
	private Room[][] r;

	public Hotel() {
		// ��̬��ʼ��
		// Room(int num, String type, boolean isFree)
		r = new Room[3][10];
		for (int i = 0; i < r.length; i++) {
			for (int j = 0; j < r[i].length; j++) {

				if (i == 0) {
					r[i][j] = new Room((i + 1) * 100 + j + 1, "��ͨ�׼�", true);
				} else if (i == 1) {
					r[i][j] = new Room((i + 1) * 100 + j + 1, "�߼��׼�", true);
				} else if (i == 2) {
					r[i][j] = new Room((i + 1) * 100 + j + 1, "��ͳ�׷�", true);
				}
			}
		}
	}

	// ��ѯϵͳ
	public void print() {
		for (int i = 0; i < r.length; i++) {
			for (int j = 0; j < r[i].length; j++) {
				System.out.print(r[i][j]);
			}
			System.out.println();
		}
	}
//	Ԥ������
	public void order(int num) {
		r[num/100-1][num%100-1].setFree(false);
		System.out.println("����"+num+"Ԥ���ɹ�");
	}
//�˶�����
	public void exit(int num){
		r[num/100-1][num%100-1].setFree(true);
		System.out.println("����"+num+"�˶��ɹ�");
	}
}
