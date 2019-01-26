package unit;
/*这是一个能够简单实现加减乘除、平方、开方的计算器类，然后对这些功能进行单元测试。
这个类并不是很完美，我们故意保留了一些Bug用于演示，这些Bug在注释中都有说明*/
public class Calculator {
	   private static int result; // 静态变量，用于存储运行结果
	    public void add(int n) {
	        result = result + n;
	    }
	    public void substract(int n) {
	        result = result - 1;  //Bug: 正确的应该是 result =result-n
	    }
	    public void multiply(int n) {
	    }         // 此方法尚未写好
	    public void divide(int n) {
	        result = result / n;
	    }
	    public void square(int n) {
	        result = n * n;
	    }
	    public void squareRoot(int n) {
	        for (; ;) ;            //Bug : 死循环
	    }
	    public void clear() {     // 将结果清零
	        result = 0;
	    }
	    public int getResult() {
	        return result;
	    }
}
