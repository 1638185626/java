
/**  
* @Title: PrintDemo.java  
* @Package Demo1  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author liuqing-pc  
* @date 2018��12��25��  
* @version V1.0  
*/
package Demo1;


/**  
* @ClassName: PrintDemo  
* @Description: TODO(����)  
* @author liuqing-pc  
* @date 2018��12��25��  
*    
*/
public class PrintDemo {
	private int age;				//����
	private String name;			//����
	private int stature;			//���
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
