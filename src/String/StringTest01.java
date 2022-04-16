package String;

public class StringTest01 {
	public static void main(String[] args) {
		String a = new String("name:czj&age:21&sex:man");
		String[] as = a.split("&");
		for (int i = 0; i < as.length; i++) {
			//System.out.println(as[i]);
			String[] b = as[i].split(":");
			for (int j = 0; j < b.length; j++) {
				System.out.println(b[j]);
			}
		}
			String c =String.valueOf(1);
			int d=1;
			System.out.println(d);

	}
}
