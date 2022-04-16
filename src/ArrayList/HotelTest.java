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
		return "[房间号：" + num + "，房间类型：" + type + "，状态：" + (isFree ? "空闲" : "占用") + "]";
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
		// 动态初始化
		// Room(int num, String type, boolean isFree)
		r = new Room[3][10];
		for (int i = 0; i < r.length; i++) {
			for (int j = 0; j < r[i].length; j++) {

				if (i == 0) {
					r[i][j] = new Room((i + 1) * 100 + j + 1, "普通套间", true);
				} else if (i == 1) {
					r[i][j] = new Room((i + 1) * 100 + j + 1, "高级套间", true);
				} else if (i == 2) {
					r[i][j] = new Room((i + 1) * 100 + j + 1, "总统套房", true);
				}
			}
		}
	}

	// 查询系统
	public void print() {
		for (int i = 0; i < r.length; i++) {
			for (int j = 0; j < r[i].length; j++) {
				System.out.print(r[i][j]);
			}
			System.out.println();
		}
	}
//	预定方法
	public void order(int num) {
		r[num/100-1][num%100-1].setFree(false);
		System.out.println("房间"+num+"预定成功");
	}
//退订方法
	public void exit(int num){
		r[num/100-1][num%100-1].setFree(true);
		System.out.println("房间"+num+"退订成功");
	}
}
