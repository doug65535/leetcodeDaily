

//leetcode submit region begin(Prohibit modification and deletion)
        class Solution {
            public boolean find132pattern(int[] nums) {
                for (int i = 0, min = Integer.MAX_VALUE; i < nums.length; i++) {
                    min = Math.min(nums[i], min);
                    if (min == nums[i]) continue;

                    for (int j = nums.length - 1; j > i; j--) {
                        if (min < nums[j] && nums[j] < nums[i]) return true;
                    }
                }

                return false;

            }
        }
//leetcode submit region end(Prohibit modification and deletion)

