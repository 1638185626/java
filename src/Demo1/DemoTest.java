
/**  
* @Title: DemoTest.java  
* @Package Demo1  
* @Description: TODO(用一句话描述该文件做什么)  
* @author liuqing-pc  
* @date 2018年12月25日  
* @version V1.0  
*/
package Demo1;


/**  
* @ClassName: DemoTest  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author liuqing-pc  
* @date 2018年12月25日  
*    
*/
public class DemoTest {

	/**  
	* @Title: main  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @param args    参数  
	* @return void    返回类型  
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double PI = 3.1415;  //常量final 关键字 修饰的属性不能被继承和对象引用。基本数据类型变量的值不能被修改
		//final修饰引用数据类不能修改引用数据类型的地址值，但对象中的属性可以被修改
		
		final PrintDemo pDemo = new PrintDemo();
		/**pDemo = new PrintDemo();
		 * xception in thread "main" java.lang.Error: Unresolved compilation problem:
		*The final local variable pDemo cannot be assigned. It must be blank and not using a compound assignment
		*翻译：
		*线程“main”java.lang中的xception。错误:未解决的编译问题:
		*无法分配最终的本地变量pDemo。它必须是空白的，不能使用复合赋值
		*原因：
		*final修饰的对象地址值不能被改变
		 * */
		pDemo.setName("张三");
		pDemo.setAge(19);
		pDemo.setStature(170);
		System.out.println(pDemo.toString());
		
	}

}
