
/**  
* @Title: PrintDemo.java  
* @Package Demo1  
* @Description: TODO(用一句话描述该文件做什么)  
* @author liuqing-pc  
* @date 2018年12月25日  
* @version V1.0  
*/
package Demo1;


/**  
* @ClassName: PrintDemo  
* @Description: TODO(人类)  
* @author liuqing-pc  
* @date 2018年12月25日  
*    
*/
public class PrintDemo {
	private int age;				//年龄
	private String name;			//姓名
	private int stature;			//身高
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStature() {
		return stature;
	}
	public void setStature(int stature) {
		this.stature = stature;
	}
	@Override
	public String toString() {
		return "PrintDemo [age=" + age + ", name=" + name + ", stature=" + stature + "]";
	}
	
	
	
	

}
