package p09;

public class SortTest2 {
	public static void main(String[] args) {
		int[] nums = new int[] { 10, 18, 35, 17, 4 };
		for (int j = 0; j < 5; j++) {
			for (int i = j + 1; i < 5; i++) {
				if (nums[0] > nums[i]) {
					int tmp = nums[0];
					nums[0] = nums[i];
					nums[i] = tmp;
				}
			}
		}
		for (int i = 2; i < 5; i++) {
			if (nums[1] > nums[i]) {
				int tmp = nums[0];
				nums[0] = nums[i];
				nums[i] = tmp;

			}
		}
		for (int i = 3; i < 5; i++) {
			if (nums[2] > nums[i]) {
				int tmp = nums[0];
				nums[0] = nums[i];
				nums[i] = tmp;

			}
		}
		for (int i = 4; i < 5; i++) {
			if (nums[3] > nums[i]) {
				int tmp = nums[0];
				nums[0] = nums[i];
				nums[i] = tmp;

			}
		}

		for(int i =0; i<nums.length; i++) {
			System.out.print(nums[i]+ " ");
		}

	}
}
