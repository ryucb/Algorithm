package structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Stack {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer repeat = Integer.parseInt(br.readLine());

		List<String> list = new ArrayList();

		Integer targetNum = -1;

		for (int i = 0; i < repeat; i++) {
			String str = br.readLine();

			if (str.contains(" ")) {
				list.add(str.split(" ")[1]);
			} else {
				switch (str) {
				case "pop":
					if (list.size() == 0) {
						System.out.println("-1");
						break;
					}
					System.out.println(list.get(list.size() - 1));
					list.remove(list.size() - 1);
					break;
				case "size":
					System.out.println(list.size());
					break;
				case "empty":
					if (list.size() == 0) {
						System.out.println("1");
						break;
					}
					System.out.println("0");
					break;
				case "top":
					if (list.size() == 0) {
						System.out.println("-1");
						break;
					}
					System.out.println(list.get(list.size() - 1));
					break;
				}
			}
		}
	}
}
