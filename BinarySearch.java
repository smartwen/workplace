package root.array;

public class BinarySearch {
	 /*
	  * 循环实现二分查找算法arr 已排好序的数组x 需要查找的数-1 无法查到数据
	  * 实现于有序数组
	  * param1 要查找的数组名
	  * param2 要查找的数据 
	  */
	 public static int binarySearch(int[] arr, int x) {
		 int low =0;
		 int high = arr.length-1;
		
		 while(low <=high) {
			 int mid = (low+high)/2;
			 if(x == arr[mid]) {
				 return x;
			 }else if(x<arr[mid]){//查找的值比中间值小
				 high = mid -1;
			 }else {//查找的值比中间值大 low往右移
				 low = mid +1;
			 }		
		 }
		 
		return -1;//没有找到返回-1		 
	 }
	 
	/* 
	 * 递归实现二分查找
	 * param1 
	 * param2
	 * param3
	 * param4
	 * */
	 public static int binarySearch2(int[] dataset,int data,int beginIndex,int endIndex){
		 int midIndex = (beginIndex+endIndex)/2;
		if(data<dataset[beginIndex] || data > dataset[endIndex] || beginIndex > endIndex) {
			return -1;
		}
		 //递归 自己调用自个
		if(data == dataset[midIndex]) {
			return midIndex;
		}else if(data < dataset[midIndex]) {//查找的值比中间值小 high往左移
			return binarySearch2(dataset, data, beginIndex, midIndex-1);
		}else {
			return binarySearch2(dataset, data, midIndex+1, endIndex);
		}
		 	 
	 }
	 
	 
	 //main方法
	 public static void main(String[] args) {
		 int[] arr = { 6, 12, 33, 87, 90, 97, 108, 561 };
		 System.out.println(binarySearch(arr, 12));
		 System.out.println(binarySearch2(arr, 87, 0, arr.length-1));
	}
}
